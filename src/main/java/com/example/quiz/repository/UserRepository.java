package com.example.quiz.repository;

import com.example.quiz.domain.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    protected List<User> userList = new ArrayList<>();

    @PostConstruct
    protected void initUserData(){
        for(int i = 1; i<=20; i++){
            User user = new User();
            user.id = "U"+ i;
            user.name ="User Name " + i;
            userList.add(user);
        }
    }

    public List<User> getUserList(){
        return this.userList;
    }
}
