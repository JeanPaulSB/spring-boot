package com.upb;

import com.upb.customer.Customer;
import com.upb.customer.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/")
public class Main {
    
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }


}
