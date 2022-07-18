package com.bankingdemo.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.bankingdemo.loans.repository"})
@ComponentScans({ @ComponentScan("com.bankingdemo.loans.controller") })
@EnableJpaRepositories("com.bankingdemo.loans.repository")
@EntityScan("com.bankingdemo.loans.model")
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
