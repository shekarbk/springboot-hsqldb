package com.chandra.springboothsqldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan("com.chandra")
@EnableJpaRepositories("com.chandra.repository")
@EntityScan("com.chandra.dao")

public class SpringbootHsqldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHsqldbApplication.class, args);
	}
}
