package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import feign.Feign;

/**
 * 是否开启熔断
 * @author Administrator
 *
 */
public class DisableHystrixConfiguration extends  FeignClientsConfiguration{

	@Bean
	@Scope("prototype") //每次请求创建一个
	public  Feign.Builder feignBuilder(){	
	  return Feign.builder();
	}
	
	
}
