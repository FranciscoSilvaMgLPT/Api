package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.LinkedList;
import java.util.List;

public class UserRepository {

    private Long count = 0L;
    private final List<User> users = new LinkedList<>();

    public List<User> getUsers() {
        return users;
    }

    public User addUser(User user) {
       User newUser = User.builder()
                .id(count)
                .username(user.getUsername())
                .password(user.getPassword())
                .build();

        users.add(newUser);
        count += 1;
        return newUser;
    }

    public User getUserById(final Long userId) {
        return users.get(Math.toIntExact(userId));
    }

    public User updateUser(final  Long userId, User user){
        users.get(Math.toIntExact(userId)).setUsername(user.getUsername());
        users.get(Math.toIntExact(userId)).setPassword(user.getPassword());
        return users.get(Math.toIntExact(userId));
    }

    public void deleteUser(final Long userId){
        users.remove(Math.toIntExact(userId));
    }

    public User updateUserDetail(final Long userId, User user){
        if(!user.getUsername().equals("")){
            users.get(Math.toIntExact(userId)).setUsername(user.getUsername());
        }
        if(!user.getPassword().equals("")){
            users.get(Math.toIntExact(userId)).setPassword(user.getPassword());
        }
      return users.get(Math.toIntExact(userId));
    }



}
