package com.inventory.app.controller;

import com.inventory.app.dao.AppUserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AppUserDeleteServlet extends HttpServlet {
    private AppUserDAO userDao;

    public void init() {
        userDao = new AppUserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        userDao.delete(id);
        response.sendRedirect("app-users");
    }
}
