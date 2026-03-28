package com.inventory.app.controller;

import com.inventory.app.dao.StockItemDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StockItemDeleteServlet extends HttpServlet {
    private StockItemDAO stockDao;

    public void init() {
        stockDao = new StockItemDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        stockDao.delete(id);
        response.sendRedirect("inventory");
    }
}
