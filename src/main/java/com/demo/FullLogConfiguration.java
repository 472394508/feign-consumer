package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;


public class FullLogConfiguration  extends FeignClientsConfiguration{

		//日志级别
	    @Bean
		Logger.Level  feignLoggerLevel(){
			return Logger.Level.FULL;
		}
		
}
