package com.springmvc.dao;

import com.springmvc.dto.Join;
import com.springmvc.dto.User;

public interface UserDao {

	void join(Join join);

	int overlapCheck(String value, String valueType);
	
	User findUserByUsername(String username); 

}
