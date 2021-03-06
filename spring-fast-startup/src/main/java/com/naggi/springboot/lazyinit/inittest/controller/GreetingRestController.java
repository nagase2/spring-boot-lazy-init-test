package com.naggi.springboot.lazyinit.inittest.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naggi.springboot.lazyinit.inittest.data.Customer;
import com.naggi.springboot.lazyinit.inittest.data.Greeting;
import com.naggi.springboot.lazyinit.inittest.service.CustomerService;
import com.naggi.springboot.lazyinit.inittest.service.EagerLoadService;
import com.naggi.springboot.lazyinit.inittest.service.LazyService;

@RestController
@RequestMapping("/rest")
public class GreetingRestController {

	@Autowired
	private EagerLoadService hService;
	@Autowired
	CustomerService customerService;
	
	private static final Logger log = LoggerFactory.getLogger(GreetingRestController.class);
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/greeting2")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	System.out.println("aaa333qqq3333");
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/hello")
    public String sayHello(){
    	
    	return hService.sayHello("yoshi");
    }
  
    @RequestMapping("/customerlist")
    public List<Customer> getCustomerList(){
    	log.info("customer list has been called");
    	return customerService.findAll();
    }
    
}