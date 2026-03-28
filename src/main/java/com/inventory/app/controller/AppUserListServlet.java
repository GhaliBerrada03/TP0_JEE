package com.inventory.app.controller;

import com.inventory.app.dao.AppUserDAO;
import com.inventory.app.model.AppUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AppUserListServlet extends HttpServlet {
    private AppUserDAO userDAO;

    public void init() {
        userDAO = new AppUserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<AppUser> userList = userDAO.findAll();
        request.setAttribute("userList", userList);
        RequestDispatcher rd = request.getRequestDispatcher("user-list.jsp");
        rd.forward(request, response);
    }
}
