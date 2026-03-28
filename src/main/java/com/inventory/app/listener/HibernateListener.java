package com.inventory.app.listener;

import com.inventory.app.util.HibernateUtil;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Initialisation au démarrage
        HibernateUtil.getSessionFactory();
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Fermeture à l'arrêt
        HibernateUtil.shutdown();
    }
}
