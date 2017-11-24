package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.demo.FeignClientsConfiguration;
import com.demo.FullLogConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@FeignClient(name="cloud-server",configuration={FullLogConfiguration.class},fallback=ConsumerServiceFallBack.class)
public  interface ConsumerService {

	@RequestMapping("/user/index")
	public   String hello();
	

	

}
