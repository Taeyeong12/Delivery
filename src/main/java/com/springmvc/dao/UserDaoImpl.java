package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.dto.Join;
import com.springmvc.dto.User;


@Repository
public class UserDaoImpl implements UserDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    

    @Override
    public void join(Join join) {
        String sql = "INSERT INTO BM_USER (USERNAME, PASSWORD, EMAIL, NICKNAME, PHONE) " +
                     "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, join.getUsername(), join.getPassword(), join.getEmail(), join.getNickname(), join.getPhone());
    }

    @Override
    public int overlapCheck(String value, String valueType) {
        String sql = "SELECT COUNT(*) FROM BM_USER WHERE " + valueType + " = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{value}, Integer.class);
    }


    @Override
    public User findUserByUsername(String username) {
        String sql = "SELECT * FROM BM_USER WHERE USERNAME = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, new UserRowMapper());
    }

}
