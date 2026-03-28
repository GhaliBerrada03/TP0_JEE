package com.inventory.app.controller;

import com.inventory.app.dao.StockItemDAO;
import com.inventory.app.model.StockItem;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class StockItemCreateServlet extends HttpServlet {
    private StockItemDAO stockDao;

    public void init() {
        stockDao = new StockItemDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String label = request.getParameter("itemLabel");
        String desc = request.getParameter("itemDescription");
        BigDecimal price = new BigDecimal(request.getParameter("unitPrice"));
        Integer qty = Integer.parseInt(request.getParameter("stockQuantity"));

        StockItem newItem = new StockItem(label, desc, price, qty);
        stockDao.save(newItem);
        response.sendRedirect("inventory");
    }
}
