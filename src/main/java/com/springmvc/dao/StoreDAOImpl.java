package com.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.dto.Food;
import com.springmvc.dto.FoodOption;
import com.springmvc.dto.Store;

@Repository
public class StoreDAOImpl implements StoreDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Store> storeList(Map<String, Object> map) {
        String sql = "SELECT * FROM BM_STORE WHERE CATEGORY = ? AND STORE_ADDRESS1 LIKE ?"; 
    	
        int category = (int) map.get("category");
        String storeAddress1 = map.get("address1").toString(); // Integer를 String으로 변환
        
        // storeAddress1에 와일드카드 추가
        storeAddress1 = storeAddress1 + "%"; 
        
        // 디버깅
        System.out.println("With parameters: category=" + category + ", storeAddress1=" + storeAddress1);

        List<Store> storeList = jdbcTemplate.query(sql, new Object[]{category, storeAddress1}, new StoreRowMapper());
               
        return storeList;
    }

    @Override
    public Store storeDetail(long storeId) {
        String sql = "SELECT * FROM BM_STORE WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{storeId}, new StoreRowMapper());
    }

    @Override
    public List<Food> foodList(long storeId) {
        String sql = "SELECT * FROM BM_FOOD WHERE STORE_ID = ?";
        return jdbcTemplate.query(sql, new Object[] { storeId }, new FoodRowMapper());
    }
    
    public List<FoodOption> foodOption(int foodId) {
        String sql = "SELECT * FROM BM_FOOD_OPTION WHERE FOOD_ID = ?";
        return jdbcTemplate.query(sql, new FoodOptionRowMapper(), foodId);
    }
}
