package com.sourin.UserManagementSystem.service;

import com.sourin.UserManagementSystem.model.User;
import com.sourin.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public List<User> getAllUser() {
        return userRepo.getUsers();
    }

    public String addUser(User user) {
         List<User> orginalList=getAllUser();
         orginalList.add(user);

         return "User add";
    }


    public List<User> getUserById(Integer id) {
        List<User> orginalList=getAllUser();

        List<User> userById=new ArrayList<>();

        for(User arr:orginalList){
            if(arr.getUserId()==id){
                userById.add(arr);

                return userById;
            }
        }

       return null;
    }

    public String removeUser(Integer id) {

        List<User> orginalList=getAllUser();

        for(User arr:orginalList){
            if(arr.getUserId()==id){
                orginalList.remove(arr);
                return "remove done id : " + id;
            }
        }

        return "delete not done id is not valid : "+id;
    }

    public String updateUser(Integer id, String userName) {
        List<User> orginalList=getAllUser();

        for(User arr:orginalList){
            if(arr.getUserId()==id){
                arr.setUserName(userName);
                return "userName Update with id : " + id;
            }
        }

        return "userName Not Update this is not valid id : "+id;
    }
}
