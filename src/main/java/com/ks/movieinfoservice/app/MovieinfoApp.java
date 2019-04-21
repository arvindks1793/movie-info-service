package com.ks.movieinfoservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ks.movieinfoservice")
@EnableDiscoveryClient
public class MovieinfoApp {

	public static void main(String[] args) {
		SpringApplication.run(MovieinfoApp.class, args);

	}

}
