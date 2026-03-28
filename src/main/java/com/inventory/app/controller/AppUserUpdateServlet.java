package com.inventory.app.controller;

import com.inventory.app.dao.AppUserDAO;
import com.inventory.app.model.AppUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AppUserUpdateServlet extends HttpServlet {
    private AppUserDAO userDao;

    public void init() {
        userDao = new AppUserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("fullName");
        String email = request.getParameter("loginEmail");

        Optional<AppUser> optionalUser = userDao.findById(id);
        if (optionalUser.isPresent()) {
            AppUser user = optionalUser.get();
            user.setFullName(name);
            user.setLoginEmail(email);
            userDao.update(user);
        }
        response.sendRedirect("app-users");
    }
}
