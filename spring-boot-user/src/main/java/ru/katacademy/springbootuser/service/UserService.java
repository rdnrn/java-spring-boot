package ru.katacademy.springbootuser.service;

import ru.katacademy.springbootuser.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findById(Long id);
}
