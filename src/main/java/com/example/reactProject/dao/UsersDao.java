package com.example.reactProject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.reactProject.entity.Users;

@Mapper
public interface UsersDao {
	@Select("select * from users where isDeleted=0"
			+ " order by regDate desc limit #{count} offset #{offset}")
	List<Users> getUsersList(int count, int offset);
}
