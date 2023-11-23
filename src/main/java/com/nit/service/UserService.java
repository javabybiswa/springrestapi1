package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.UserEntity;
import com.nit.pojo.UserRegisterRequest;
import com.nit.repository.UserRepository;

@Service
public class UserService {

	 @Autowired
	  UserRepository repository;
	
	 public String UserDetails(UserRegisterRequest request) {
		 
		  UserEntity user=new UserEntity();
		  
		   user.setEmail(request.getEmail());
		   user.setName(request.getName());
		   user.setMobile(request.getMobile());
		   user.setPassword(request.getPassword());
		   repository.save(user);
		   return "user Register Successfully";
	 }
}
