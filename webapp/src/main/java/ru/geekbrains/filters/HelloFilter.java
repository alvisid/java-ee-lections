/*
package ru.geekbrains.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "HelloFilter", urlPatterns = {"/hellofilter"})
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Фильтр запущен");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("");
        servletRequest.setAttribute("hello", "Привет от фильтра");
        System.out.println("фильр передает переменную hello, которая содержит строку - " + servletRequest.getAttribute("hello"));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("фильтр завершает работу");

    }
}
*/
