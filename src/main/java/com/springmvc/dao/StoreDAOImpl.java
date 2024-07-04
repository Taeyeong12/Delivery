package com.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springmvc.dto.Store;

@Repository
public class StoreDAOImpl implements StoreDAO {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Store> storeList(Map<String, Object> map) {
        String sql = "SELECT * FROM store WHERE category = ? AND storeAddress1 = ?";
        
        int category = (int) map.get("category");
        int storeAddress1 = (int) map.get("storeAddress1");
        
        return jdbcTemplate.query(sql, new Object[]{category, storeAddress1}, storeRowMapper());
    }

    private RowMapper<Store> storeRowMapper() {
        return (rs, rowNum) -> {
            Store store = new Store();
            store.setId(rs.getLong("id"));
            store.setCategory(rs.getInt("category"));
            store.setStoreName(rs.getString("storeName"));
            store.setStoreAddress1(rs.getInt("storeAddress1"));
            store.setStoreAddress2(rs.getString("storeAddress2"));
            store.setStoreAddress3(rs.getString("storeAddress3"));
            store.setStorePhone(rs.getString("storePhone"));
            store.setStoreImg(rs.getString("storeImg"));
            store.setStoreThumb(rs.getString("storeThumb"));
            store.setOpeningTime(rs.getInt("openingTime"));
            store.setClosingTime(rs.getInt("closingTime"));
            store.setMinDelevery(rs.getInt("minDelevery"));
            store.setDeleveryTime(rs.getInt("deleveryTime"));
            store.setDeleveryTip(rs.getInt("deleveryTip"));
            store.setStoreDes(rs.getString("storeDes"));
            return store;
        };
    }
}

