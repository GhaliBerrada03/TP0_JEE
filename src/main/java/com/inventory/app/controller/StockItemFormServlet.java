package com.inventory.app.controller;

import com.inventory.app.dao.StockItemDAO;
import com.inventory.app.model.StockItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class StockItemFormServlet extends HttpServlet {
    private StockItemDAO stockDao;

    public void init() {
        stockDao = new StockItemDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null) {
            Long id = Long.parseLong(idStr);
            Optional<StockItem> item = stockDao.findById(id);
            item.ifPresent(i -> request.setAttribute("item", i));
        }
        RequestDispatcher rd = request.getRequestDispatcher("product-form.jsp");
        rd.forward(request, response);
    }
}
