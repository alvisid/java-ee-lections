package ru.geekbrains.servlet;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("<h1>Hello from first servlet</h1>");

    }

    @Override
    public String getServletInfo() {
        return "First Servlet";
    }

    @Override
    public void destroy() {

    }
}
