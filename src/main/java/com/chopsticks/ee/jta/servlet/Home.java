package com.chopsticks.ee.jta.servlet;

import com.chopsticks.ee.jta.ejb.local.UserBean;
import com.chopsticks.ee.jta.entity.User;
import jakarta.ejb.EJB;
import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class Home extends HttpServlet {

    @EJB
    UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        userBean.register("Thidas", "thidas@gmail.com", "123", "08912345656");

    }
}
