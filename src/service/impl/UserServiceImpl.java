package service.impl;

import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {
    private List<User>users=new ArrayList<>();




    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String createUser(List<User> users) {
       this.users.addAll(users);





        return users.toString();
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
