package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.dto.Food;

public class FoodRowMapper implements RowMapper<Food> {

    @Override
    public Food mapRow(ResultSet rs, int rowNum) throws SQLException {
        Food food = new Food();
        food.setId(rs.getLong("ID"));
        food.setStoreId(rs.getLong("STORE_ID"));
        food.setFoodName(rs.getString("FOOD_NAME"));
        food.setFoodPrice(rs.getString("FOOD_PRICE"));
        food.setFoodDec(rs.getString("FOOD_DEC"));
        food.setFoodImg(rs.getString("FOOD_IMG"));
        food.setFoodThumb(rs.getString("FOOD_THUMB"));
        return food;
    }
}

