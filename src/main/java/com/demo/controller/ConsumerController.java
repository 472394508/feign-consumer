package com.demo.controller;

import com.demo.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
	public String  helloConsumer(){
		return consumerService.hello();
	}
    
 
    
    
    

    
}
