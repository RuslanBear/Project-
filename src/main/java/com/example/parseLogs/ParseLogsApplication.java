package com.example.parseLogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ParseLogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParseLogsApplication.class, args);
	}

}
