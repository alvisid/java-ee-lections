package ru.geekbrains.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class ContextListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(ContextListener.class);
//    private ServletContext context;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        ServletContext context = sce.getServletContext();
//        logger.info("Context initialization: " + context.getContextPath());
        logger.info("Initializing application");

        ServletContext sc = sce.getServletContext();
        String jdbcConnectionString = sc.getInitParameter("jdbcConnectionString");
        String username = sc.getInitParameter("dbUserName");
        String password = sc.getInitParameter("dbPassword");

/*        if (isNotNullOrEmpty(jdbcConnectionString) || isNotNullOrEmpty(username)) {
            logger.error("Connection string and DB username must be specified");
            return;
        }*/
        try {
            Connection conn = DriverManager.getConnection(jdbcConnectionString, username, password);
            sc.setAttribute("jdbcConnection", conn);
        } catch (SQLException ex) {
            logger.error("", ex);
        }

    }

/*    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        ServletContext context = sce.getServletContext();
        Connection conn = (Connection) context.getAttribute("jdbcConnection");
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            logger.error("", e);
        }
    }

    private boolean isNotNullOrEmpty(String str) {

        return str != null && str.isEmpty();
    }*/
}
