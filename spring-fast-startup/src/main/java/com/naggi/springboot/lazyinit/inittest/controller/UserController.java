package com.naggi.springboot.lazyinit.inittest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naggi.springboot.lazyinit.inittest.data.Customer;
import com.naggi.springboot.lazyinit.inittest.data.User;
import com.naggi.springboot.lazyinit.inittest.service.CustomerService;
import com.naggi.springboot.lazyinit.inittest.service.LazyUserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	public UserController(){
		log.warn("★user controller has been called.");
	}
	@Autowired
	 LazyUserService userService;

	@RequestMapping(method = RequestMethod.GET)
	List<User> list(Model model /* 画面に値を渡すために、Modelオブジェクトを使用する */) {
		List<User> userList = userService.getUserAll();
		return userList; // なんでここだけRedirectではないのか
	}
	
	@RequestMapping(value="/check",method = RequestMethod.GET)
	InputForm check(@Validated InputForm inform) {
		
		log.info(inform.toString());
		return inform;
	}
	
}

