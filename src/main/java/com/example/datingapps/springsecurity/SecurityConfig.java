//package com.example.datingapps.springsecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    protected void configure(final HttpSecurity http) throws Exception{
//        http.antMatcher("**")
//                .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/postuserdetails").permitAll()
//                .antMatchers().authenticated()
//                .and().formLogin();
//        http.csrf().disable();
//    }
//}
