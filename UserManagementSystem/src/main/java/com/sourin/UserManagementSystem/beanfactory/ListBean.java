package com.sourin.UserManagementSystem.beanfactory;

import com.sourin.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ListBean {
    @Bean
    public List<User> getList(){
        return new ArrayList<>();
    }
}
