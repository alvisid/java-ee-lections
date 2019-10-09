package ru.geekbrains.filters;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FirstFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        filterConfig.getServletContext().getRequestDispatcher("/header.html").include(request, response);
        response.getWriter().println("<p>Header from filter</p>");
        chain.doFilter(request, response);
        response.getWriter().println("<p>Footer from filter</p>");
//        filterConfig.getServletContext().getRequestDispatcher("footer.html").include(request, response);
    }

    @Override
    public void destroy() {

    }
}
