package com.example.logger.service;

import com.example.logger.model.User;
import com.example.logger.repositroy.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getUsers() {
        log.info("Liste Getirildi");
        return userRepository.findAll();
    }


    public User createUser(User user) {
        log.info("Oluşturuldu");
        return userRepository.save(user);
    }
}
