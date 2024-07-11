package com.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.springmvc.dto.Store;

public interface StoreDAO {
	 
	List<Store> storeList(Map<String, Object> map);

	Store storeDetail(long storeId);
 
}
