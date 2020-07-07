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


        User user = (User) context.getBean("user1");
        System.out.println(user);

        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());



        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);


        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

        Users users = new Users("Kavit", "Shah", "12345678", "kavitshah14.com", "979598476", 20000);

        Users savedUser = userDAO.insertUsersDetails(users);

        System.out.println(userDAO.fetchAllUsersDetails());


        System.out.println(userDAO.fetchUserDetails(2));

        System.out.println(userDAO.deleteUser(2));*/

  
        ActivityDAO activityDAO = (ActivityDAO) context.getBean("activityDAO");
        Activity activity = new Activity("A");

        Activity savedActivity = activityDAO.save(activity);
        System.out.println(savedActivity);
        System.out.println(activityDAO.findAll());

        System.out.println(activityDAO.findById(2));

        Activity activity1 = activityDAO.findById(activity.getActivityId()).get();
        activity1.setActivityType("B");
        System.out.println(activityDAO.save(activity1));


        activityDAO.deleteById(2);






    }
}
