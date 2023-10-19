package com.example.demo.ServiceImp;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserDetailsImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    //It will be provided later with Spring @Bean.
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User saveUser(final User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    //save = create or update
    @Override
    public User updateUser(final User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long user_id) {

    }

    @Override
    public void deleteUser(final Integer user_id){
        userRepository.deleteById(user_id);
    }

    @Override
    public User findByUsername(String user_name){
        return userRepository.findByUsername(user_name).orElse(null);
    }

    @Override
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public Long numberOfUsers(){
        return userRepository.count();
    }

}