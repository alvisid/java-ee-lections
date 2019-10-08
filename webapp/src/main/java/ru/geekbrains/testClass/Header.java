package ru.geekbrains.testClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "header", urlPatterns = {"/header"})
public class Header extends HttpServlet {

    Logger loggerHeader = LoggerFactory.getLogger(Header.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");

        getServletContext().getRequestDispatcher("/header.html").include(req, res);
        res.getWriter().println("<p>Response body from servlet</p>");
        getServletContext().getRequestDispatcher("/footer.html").include(req, res);
    }


}
