package web.Dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void createUser(User user);

    User readUser(int id);

    void updateUser(User user);

    void deleteUser(int id);
}