package com.example.reactProject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.reactProject.entity.User;

@Mapper
public interface UserDao {
	
	@Select("select * from user where uid=#{Uid}")
	User getUserByuid(String Uid);
	
	@Select("select * from user")
	List<User> getUserList();
}
