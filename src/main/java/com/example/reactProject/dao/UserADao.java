package com.example.reactProject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.reactProject.entity.UserA;

@Mapper
public interface UserADao {
	
	@Select("select * from user where uid=#{Uid}")
	UserA getUserByuid(String Uid);
	
	@Select("select * from user")
	List<UserA> getUserList();
}
