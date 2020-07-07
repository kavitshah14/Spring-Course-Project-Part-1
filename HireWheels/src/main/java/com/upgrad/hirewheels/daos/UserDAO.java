package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Users;

import java.util.List;

public interface UserDAO {

    public Users insertUsersDetails(Users users);
    public Users updatePassword(int userId);
    public Users fetchUserDetails(int userId);
    public List<Users> fetchAllUsersDetails();
    public boolean deleteUser(int userId);

}


