package ru.geekbrains.servlet.catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "product", urlPatterns = {"/product"})
public class Product implements Servlet {
    private static Logger logger = LoggerFactory.getLogger(Product.class);

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        servletResponse.getWriter().println("<h1>Product page</h1>");
        out.println(logger.getName());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
