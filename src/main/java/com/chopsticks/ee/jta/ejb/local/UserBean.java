package com.chopsticks.ee.jta.ejb.local;

public interface UserBean {
    boolean login(String email, String password);
    boolean register(String name, String email, String password, String contact);
}
