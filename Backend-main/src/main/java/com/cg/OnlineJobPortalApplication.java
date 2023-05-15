package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan({"com.cg"})
//@EntityScan("com.cg")
@EnableJpaRepositories("com.cg")
//@Configuration

public class OnlineJobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineJobPortalApplication.class, args);
	}

}
