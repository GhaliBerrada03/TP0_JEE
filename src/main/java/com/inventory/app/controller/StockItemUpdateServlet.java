package com.inventory.app.controller;

import com.inventory.app.dao.StockItemDAO;
import com.inventory.app.model.StockItem;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Optional;

public class StockItemUpdateServlet extends HttpServlet {
    private StockItemDAO stockDao;

    public void init() {
        stockDao = new StockItemDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("itemId"));
        String label = request.getParameter("itemLabel");
        String desc = request.getParameter("itemDescription");
        BigDecimal price = new BigDecimal(request.getParameter("unitPrice"));
        Integer qty = Integer.parseInt(request.getParameter("stockQuantity"));

        Optional<StockItem> optItem = stockDao.findById(id);
        if (optItem.isPresent()) {
            StockItem item = optItem.get();
            item.setItemLabel(label);
            item.setItemDescription(desc);
            item.setUnitPrice(price);
            item.setStockQuantity(qty);
            stockDao.update(item);
        }
        response.sendRedirect("inventory");
    }
}
