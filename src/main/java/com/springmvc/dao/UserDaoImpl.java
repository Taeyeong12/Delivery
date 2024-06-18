package com.springmvc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springmvc.dto.Join;


@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void join(Join join) {
		
	}

	@Override
	public int overlapCheck(String value, String valueType) {
		
		Map<String,String> map = new HashMap<>();
		return 0;
	}

}
