package com.started.proyect.services;

import com.started.proyect.models.User;
import com.started.proyect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        Iterable<User> iterUsers =  userRepository.findAll();

        List<User> users = new ArrayList<>();
        iterUsers.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return userRepository.count();
    }

    public void deleteById(Long userId) {

        userRepository.deleteById(userId);
    }

}
