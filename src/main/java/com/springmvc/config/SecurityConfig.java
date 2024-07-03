package com.springmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.firewall.StrictHttpFirewall;

import com.springmvc.login.LoginDetailService;
import com.springmvc.login.LoginFail;
import com.springmvc.login.LoginSuccess;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    public void configure(WebSecurity web) {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedDoubleSlash(true); // 이중 슬래시 허용
        web.httpFirewall(firewall);
    }
	

    @Bean
    public BCryptPasswordEncoder encodePwd() {
        return new BCryptPasswordEncoder();
    }
   
    @Autowired
    private LoginDetailService loginDetailService;
    
    
    @Autowired
    private LoginSuccess loginSuccess;
    
    @Autowired
    private LoginFail loginFail;

    @Override
	protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/user/**").hasAnyRole("ADMIN, USER")
            .anyRequest().permitAll()
            .and()
            .formLogin()
            .loginPage("/login") // 로그인 폼을 제공하는 페이지
            .loginProcessingUrl("/login") // 로그인 폼 제출 경로
            .successHandler(loginSuccess)
            .failureHandler(loginFail)
            .permitAll()
            .and()
            .logout()
            .logoutSuccessUrl("/myPage")
            .permitAll()
            .and()
            .rememberMe()
            .key("rememberKey")
            .rememberMeCookieName("rememberMeCookieName")
            .rememberMeParameter("remember-me")
            .tokenValiditySeconds(60 * 60 * 24 * 7)
            .userDetailsService(loginDetailService);
        
	}
}
