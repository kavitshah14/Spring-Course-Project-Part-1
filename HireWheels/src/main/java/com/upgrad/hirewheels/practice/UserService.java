package com.upgrad.hirewheels.practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserService {

    @Qualifier("user2")
    @Autowired
    private User user;

    public User getUsers() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
    }

    public void printName() {
        user.getFirst_name();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "firstName=" + user.getFirst_name() +
                '}';
    }
}
