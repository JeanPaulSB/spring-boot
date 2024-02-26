package com.upb.customer;

import jakarta.annotation.PostConstruct;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {
    private final CustomerRepository customerRepository;

    public DataLoader(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }

    @PostConstruct
    private void loadData(){
        customerRepository.saveAll(List.of(
                new Customer("jean paul","jp@gmail.com",25),
                new Customer("Andres","andr@gmail.com",25),
                new Customer("sime","sime@gmail.com",25)

                )

        );
    }
}
