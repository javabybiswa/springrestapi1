package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.pojo.UserRegisterRequest;
import com.nit.service.UserService;

@RestController
 @RequestMapping("/user")
public class UserController {

	 @Autowired
	  UserService userService;
	 
	@PostMapping("/register")
	  public String userDetails(@RequestBody UserRegisterRequest request) {
		  
		//controller->service
	   //from Service recieving result
		String response=userService.UserDetails(request);
		  return response;
		  
		  //fetch user details of one person by emailid
		   
		   
		
		  }
		 
}
