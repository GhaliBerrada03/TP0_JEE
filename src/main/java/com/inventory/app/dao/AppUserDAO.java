package com.inventory.app.dao;

import com.inventory.app.model.AppUser;
import com.inventory.app.util.HibernateUtil;
import org.hibernate.Session;
import java.util.Optional;

public class AppUserDAO extends GenericDAOImpl<AppUser, Long> {
    
    public Optional<AppUser> findByEmail(String email) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from AppUser where loginEmail = :email", AppUser.class)
                    .setParameter("email", email)
                    .uniqueResultOptional();
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
