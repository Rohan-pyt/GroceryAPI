package com.example.demo.Service;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(Long user_id);

    void deleteUser(Integer user_Id);

    User findByUsername(String user_name);


    List<User> findAllUsers();

    Long numberOfUsers();
}
