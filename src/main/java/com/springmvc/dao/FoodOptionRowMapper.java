package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.dto.FoodOption;

public class FoodOptionRowMapper implements RowMapper<FoodOption> {

    @Override
    public FoodOption mapRow(ResultSet rs, int rowNum) throws SQLException {
        FoodOption foodOption = new FoodOption();
        foodOption.setId(rs.getLong("ID"));
        foodOption.setFoodId(rs.getLong("FOOD_ID"));
        foodOption.setOptionName(rs.getString("OPTION_NAME"));
        foodOption.setOptionPrice(rs.getLong("OPTION_PRICE"));
        return foodOption;
    }
}
