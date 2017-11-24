package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.demo.FeignClientsConfiguration;
import com.demo.FullLogConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@Component
public  class  ConsumerServiceFallBack  implements ConsumerService{

	@Override
	public String hello() {
		
		return "错误啊啊ｓｂ";
	}

	

	

}
