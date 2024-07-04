package com.springmvc.service;

import java.util.List;

import com.springmvc.dto.Store;

public interface StoreService {
	List<Store> storeList(int category, int address);
}

