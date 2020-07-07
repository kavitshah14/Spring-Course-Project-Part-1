package com.upgrad.hirewheels.client;

import com.upgrad.hirewheels.daos.ActivityDAO;
import com.upgrad.hirewheels.daos.UserDAO;
import com.upgrad.hirewheels.models.Activity;
import com.upgrad.hirewheels.practice.BalanceService;
import com.upgrad.hirewheels.practice.UserService;
import com.upgrad.hirewheels.practice.User;
import com.upgrad.hirewheels.models.Users;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        /*===================================================================================================================================*/

        System.out.println("-------------------------------------Checkpoint 1 Solution---------------------------------------");

        User user = (User) context.getBean("user1");
        System.out.println(user);

        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());

        System.out.println("-------------------------------------Checkpoint 2 Solution---------------------------------------");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);

        /*===================================================================================================================================*/

        System.out.println("-------------------------------------Checkpoint 3 Solution---------------------------------------");

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

        Users users = new Users("Ram", "Kumar", "password", "ramkumuar@4.com", "9795958876", 10000);


        System.out.println("-------------------------------------Inserted Users Details---------------------------------------");
        Users savedUser = userDAO.insertUsersDetails(users);

        System.out.println("-------------------------------------Fetch All User Details---------------------------------------");
        System.out.println(userDAO.fetchAllUsersDetails());

        System.out.println("-------------------------------------Fetch User Details by Id---------------------------------------");
        System.out.println(userDAO.fetchUserDetails(2));

        /*System.out.println("-------------------------------------Deleted User Detail by Id---------------------------------------");
        System.out.println(userDAO.deleteUser(2));*/

        System.out.println("-------------------------------------Inserted Activity---------------------------------------");
        ActivityDAO activityDAO = (ActivityDAO) context.getBean("activityDAO");
        Activity activity = new Activity("A");

        Activity savedActivity = activityDAO.save(activity);
        System.out.println(savedActivity);
        System.out.println("-------------------------------------Fetch All Activity---------------------------------------");
        System.out.println(activityDAO.findAll());

        System.out.println("------------------------------------ Fetch Activity By Id---------------------------------------");
        System.out.println(activityDAO.findById(2));

        System.out.println("-------------------------------------Updated Activity---------------------------------------");
        Activity activity1 = activityDAO.findById(activity.getActivityId()).get();
        activity1.setActivityType("B");
        System.out.println(activityDAO.save(activity1));

        System.out.println("-------------------------------------Delete Activity By Id---------------------------------------");
        activityDAO.deleteById(2);






    }
}
