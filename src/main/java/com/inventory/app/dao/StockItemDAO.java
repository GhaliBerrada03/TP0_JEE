package com.inventory.app.dao;

import com.inventory.app.model.StockItem;
import com.inventory.app.util.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

public class StockItemDAO extends GenericDAOImpl<StockItem, Long> {
    
    public List<StockItem> searchByLabel(String keyword) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from StockItem where itemLabel like :keyword", StockItem.class)
                    .setParameter("keyword", "%" + keyword + "%")
                    .list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
