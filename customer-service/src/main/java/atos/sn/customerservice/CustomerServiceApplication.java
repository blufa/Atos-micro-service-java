package atos.sn.customerservice;

import atos.sn.customerservice.entities.Customer;
import atos.sn.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Jean Claude").email("jeccam38@gmail.com").build(),
					Customer.builder().name("Cheick NDiaye").email("cheick@gmail.com").build(),
					Customer.builder().name("Ababacar Kamara").email("ababacar@gmail.com").build(),
					Customer.builder().name("Abdoulaye Camara").email("abdoulaye@gmail.com").build(),
					Customer.builder().name("Momar Cisse").email("momar@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
