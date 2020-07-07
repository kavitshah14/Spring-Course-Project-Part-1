package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    //@Transactional
    public Users insertUsersDetails(Users users) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }

    public Users updatePassword(int userId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Users users = entityManager.find(Users.class,userId);
        entityManager.getTransaction().begin();
        entityManager.persist(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }

    public Users fetchUserDetails(int userId) {
        return entityManagerFactory.createEntityManager().find(Users.class, userId);
    }

    public List<Users> fetchAllUsersDetails() {
        Query query = entityManagerFactory.createEntityManager().createQuery("from Users m",Users.class);
        return (List<Users>)query.getResultList();
    }

    public boolean deleteUser(int userId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Users users = entityManager.find(Users.class,userId);
        entityManager.getTransaction().begin();
        entityManager.remove(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}

