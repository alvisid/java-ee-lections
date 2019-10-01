package ru.geekbrains.servlet.filters;

import javax.servlet.*;
import java.io.IOException;

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
