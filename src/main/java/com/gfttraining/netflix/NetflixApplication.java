package com.gfttraining.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class NetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

}
