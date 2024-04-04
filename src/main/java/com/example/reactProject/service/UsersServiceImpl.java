package com.example.reactProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reactProject.dao.UsersDao;
import com.example.reactProject.entity.Users;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService{
	private final UsersDao usersDao;
	
	
	@Override
	public Users getUsersByUid(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getUsersList(int page) {
		int offset = (page -1) * COUNT_PER_PAGE;
		return usersDao.getUsersList(COUNT_PER_PAGE, offset);
	}

	@Override
	public int getUsersCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registerUser(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(String uid, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
