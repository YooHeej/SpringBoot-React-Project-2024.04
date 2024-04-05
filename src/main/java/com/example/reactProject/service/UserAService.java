package com.example.reactProject.service;

import java.util.List;

import com.example.reactProject.entity.UserA;

public interface UserAService {

	UserA getUserAByUid(String uid);
	
	List<UserA> getUserAList();
}
