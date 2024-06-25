package com.springmvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.dto.User;

@Service
public class LoginDetailService implements UserDetailsService {
 
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUsername(username);

        if (user != null) {
            LoginService loginDetail = new LoginService();
            loginDetail.setUser(user);
            return loginDetail;
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
 
}
