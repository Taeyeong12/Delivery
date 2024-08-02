package com.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.StoreDAO;
import com.springmvc.dto.Food;
import com.springmvc.dto.FoodOption;
import com.springmvc.dto.Store;
import com.springmvc.dto.StoreDetail;

@Service
public class StoreServiceImpl implements StoreService {
 
    @Autowired
    private StoreDAO storeDAO;
    
    @Override
    public List<Store> storeList(int category, int address) {
        Map<String, Object> map = new HashMap<>();
        map.put("category", category);
        map.put("address1", address);
        
        
        List<Store> storeList = storeDAO.storeList(map);

        for(Store sotore : storeList ) {
        	System.out.println(sotore.toString());
        }
        
        return storeDAO.storeList(map);
    }

    @Override
    public StoreDetail storeDetail(long storeId) {
        Store storeInfo = storeDAO.storeDetail(storeId); 
        
        List<Food> foodList = storeDAO.foodList(storeId);
//        List<Review> reviewList = storeDAO.reviewList(storeId);
        
        return new StoreDetail(storeInfo, foodList);
    }
    
	@Override
	public List<FoodOption> foodOption(int foodId) {
		return storeDAO.foodOption(foodId);
	}
}
