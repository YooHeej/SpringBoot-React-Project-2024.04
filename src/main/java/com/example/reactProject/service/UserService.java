package com.example.reactProject.service;

import java.util.List;

import com.example.reactProject.entity.User;

public interface UserService {

	User getUserByUid(String uid);
	
	List<User> getUserList();
}
