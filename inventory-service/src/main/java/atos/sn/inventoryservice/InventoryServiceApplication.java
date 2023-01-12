package atos.sn.inventoryservice;

import atos.sn.inventoryservice.entities.Product;
import atos.sn.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.saveAll(List.of(
					Product.builder().name("Orange").price(500).quantity(12).build(),
					Product.builder().name("Mangue").price(800).quantity(2).build(),
					Product.builder().name("Piment").price(100).quantity(10).build(),
					Product.builder().name("Avocat").price(900).quantity(90).build(),
					Product.builder().name("Riz").price(450).quantity(20).build(),
					Product.builder().name("Fonio").price(6700).quantity(33).build(),
					Product.builder().name("Mil").price(200).quantity(15).build(),
					Product.builder().name("Biscuit").price(500).quantity(30).build()
			));
			productRepository.findAll().forEach(System.out::println);
		};
	}

}
