package com.sumonsarder.cse.SpringBootCRUD.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("sumon")
                .password("$2a$10$1yhX6uC7Lp.2r/9z0wDsEua.NwUE6iYuTLcAWwOECQULoPgYeWA5a")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("$2a$10$GWDRToyR7gSJ6c3He.yixu8yfZPr8uDBehSPATFp2o9OLU3/Pjitq")
                .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       /* http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();*/

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/new").hasAnyRole("USER", "ADMIN")
                .antMatchers("/edit/*","/delete/*").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/403");
    }
}
