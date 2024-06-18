package com.springmvc.dao;

import com.springmvc.dto.Join;

public interface UserDao {

	void join(Join join);

	int overlapCheck(String value, String valueType);

}
