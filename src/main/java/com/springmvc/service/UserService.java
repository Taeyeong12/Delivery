package com.springmvc.service;

import javax.validation.Valid;

import com.springmvc.dto.Join;

public interface UserService {

	void join(@Valid Join join);

	int overlapCheck(String value, String valueType);

}
