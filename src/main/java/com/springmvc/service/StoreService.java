package com.springmvc.service;

import java.util.List;

import com.springmvc.dto.Store;
import com.springmvc.dto.StoreDetail;

public interface StoreService {
	List<Store> storeList(int category, int address);

	StoreDetail storeDetail(long id);
}

