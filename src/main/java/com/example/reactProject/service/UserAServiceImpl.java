package com.example.reactProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reactProject.dao.UserADao;
import com.example.reactProject.entity.UserA;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserAServiceImpl implements UserAService{
	private final UserADao uDao;

	@Override
	public UserA getUserAByUid(String uid) {
		return uDao.getUserAByuid(uid);
	}

	@Override
	public List<UserA> getUserAList() {
		return uDao.getUserAList();
	}

}
