package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.dto.Join;

@Service
@Primary
public class UserServiceImpl implements UserService {
 
	@Autowired
	private UserDao userDao;
	
	@Override
	public void join(Join join) {
		userDao.join(join);
	}
	
 
	@Override
	public int overlapCheck(String value, String valueType) {
		return userDao.overlapCheck(value, valueType);
	}
 
}
