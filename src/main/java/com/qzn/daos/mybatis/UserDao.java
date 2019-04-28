package com.qzn.daos.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.qzn.models.User;

@Mapper
public interface UserDao {
	
	@Select({ "select * from Users" })
	List<User> queryUsers();
}
