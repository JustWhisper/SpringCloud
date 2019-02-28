package com.springcloud.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages ="com.springcloud.fegin.fegin")
@SpringBootApplication
public class FeignServiceBootstrap {
	public static void main(String[] args) {
		SpringApplication.run(FeignServiceBootstrap.class, args);
	}
}
