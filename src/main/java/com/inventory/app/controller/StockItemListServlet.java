package com.inventory.app.controller;

import com.inventory.app.dao.StockItemDAO;
import com.inventory.app.model.StockItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StockItemListServlet extends HttpServlet {
    private StockItemDAO stockDao;

    public void init() {
        stockDao = new StockItemDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String query = request.getParameter("query");
        List<StockItem> items;
        
        if (query != null && !query.isEmpty()) {
            items = stockDao.searchByLabel(query);
            request.setAttribute("query", query);
        } else {
            items = stockDao.findAll();
        }
        
        request.setAttribute("items", items);
        RequestDispatcher rd = request.getRequestDispatcher("product-list.jsp");
        rd.forward(request, response);
    }
}
