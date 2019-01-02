package com.baiyang.mastercontroller;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/** 开启could*/
@EnableDiscoveryClient
/** 开启dubbo*/
@EnableDubbo
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//启用负载均衡，默认算法是轮询
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
