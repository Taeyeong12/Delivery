package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.dto.Store;

public class StoreRowMapper implements RowMapper<Store> {

    @Override
    public Store mapRow(ResultSet rs, int rowNum) throws SQLException {
        Store store = new Store();
        store.setId(rs.getLong("ID"));
        store.setCategory(rs.getInt("CATEGORY"));
        store.setStoreName(rs.getString("STORE_NAME"));
        store.setStoreAddress1(rs.getInt("STORE_ADDRESS1"));
        store.setStoreAddress2(rs.getString("STORE_ADDRESS2"));
        store.setStoreAddress3(rs.getString("STORE_ADDRESS3"));
        store.setStorePhone(rs.getString("STORE_PHONE"));
        store.setStoreImg(rs.getString("STORE_IMG"));
        store.setStoreThumb(rs.getString("STORE_THUMB"));
        store.setOpeningTime(rs.getInt("OPENING_TIME"));
        store.setClosingTime(rs.getInt("CLOSING_TIME"));
        store.setMinDelivery(rs.getInt("MIN_DELIVERY"));
        store.setDeliveryTime(rs.getInt("DELIVERY_TIME"));
        store.setDeliveryTip(rs.getInt("DELIVERY_TIP"));
        store.setStoreDes(rs.getString("STORE_DES"));
        return store;
    }
}
