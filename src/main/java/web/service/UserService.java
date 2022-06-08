package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
