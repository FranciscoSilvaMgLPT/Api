package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public final UserRepository repository = new UserRepository();

    public List<User> getUsers() {
        return repository.getUsers();
    }

    public User addUser(User user) {
        return repository.addUser(user);
    }

    public User getUserById(final Long userId) {
        return repository.getUserById(userId);
    }

    public User updateUser(final Long userId,User user){
        return repository.updateUser(userId,user);
    }

    public void deleteUser(final Long userId){
        repository.deleteUser(userId);
    }

    public User updateUserDetail(final Long userId, User user){
        return repository.updateUserDetail(userId,user);
    }

}
