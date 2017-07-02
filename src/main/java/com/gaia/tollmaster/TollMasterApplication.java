package com.gaia.tollmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gaia.tollmaster"})
@EnableJpaRepositories(basePackages = {"com.gaia.tollmaster"})
public class TollMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollMasterApplication.class, args);
	}
}
