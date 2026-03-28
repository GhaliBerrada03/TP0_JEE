package com.inventory.app.controller;

import com.inventory.app.dao.AppUserDAO;
import com.inventory.app.model.AppUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AppUserCreateServlet extends HttpServlet {
    private AppUserDAO userDao;

    public void init() {
        userDao = new AppUserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("fullName");
        String email = request.getParameter("loginEmail");
        String pass = request.getParameter("userPassword");

        AppUser newUser = new AppUser(name, email, pass);
        userDao.save(newUser);
        response.sendRedirect("app-users");
    }
}
