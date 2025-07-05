package com.chopsticks.ee.jta.ejb;

import com.chopsticks.ee.jta.ejb.local.UserBean;
import com.chopsticks.ee.jta.entity.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserBeanImpl implements UserBean {

    @PersistenceContext(unitName = "JTAPU")
    private EntityManager em;

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    @Override
    public boolean register(String name, String email, String password, String contact) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setContact(contact);

        em.persist(user);

        return true;
    }
}
