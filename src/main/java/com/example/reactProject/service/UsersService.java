package com.example.reactProject.service;

import java.util.List;

import com.example.reactProject.entity.Users;

public interface UsersService {
	public static final int COUNT_PER_PAGE = 10;
	
	Users getUsersByUid(String uid);
	List<Users> getUsersList(int page);
	int getUsersCount();
	void registerUser(Users users);
	void updateUser(Users users);
	void deleteUser(String uid);
	int login(String uid, String pwd);
	
}
