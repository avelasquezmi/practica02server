package com.mef.cloud.avelasquezpractica02server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Avelasquezpractica02ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Avelasquezpractica02ServerApplication.class, args);
	}
}
