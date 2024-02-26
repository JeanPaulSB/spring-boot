package com.upb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/customers")
public class Main {

    private final CustomerRepository customerRepository;

    public  Main(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    record NewCustomerRequest(
            String email,
            String name,
            Integer age
    ){}

    @PostMapping
    public void addCustomer(@RequestBody  NewCustomerRequest request){
            Customer customer = new Customer();
            customer.setAge(request.age());
            customer.setName((request.name()));
            customer.setEmail(request.email());

            customerRepository.save(customer);
    }
}
