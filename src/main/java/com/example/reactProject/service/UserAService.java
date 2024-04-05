package com.example.reactProject.service;

import java.util.List;

import com.example.reactProject.entity.UserA;

public interface UserAService {

	UserA getUserByUid(String uid);
	
	List<UserA> getUserList();
}
