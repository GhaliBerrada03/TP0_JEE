package com.inventory.app.controller;

import com.inventory.app.dao.AppUserDAO;
import com.inventory.app.model.AppUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AppUserFormServlet extends HttpServlet {
    private AppUserDAO userDAO;

    public void init() {
        userDAO = new AppUserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idParam = request.getParameter("id");
        if (idParam != null) {
            Long userId = Long.parseLong(idParam);
            Optional<AppUser> existingUser = userDAO.findById(userId);
            existingUser.ifPresent(user -> request.setAttribute("user", user));
        }
        RequestDispatcher rd = request.getRequestDispatcher("user-form.jsp");
        rd.forward(request, response);
    }
}
