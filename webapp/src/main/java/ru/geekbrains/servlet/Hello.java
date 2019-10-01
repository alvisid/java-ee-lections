package ru.geekbrains.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "Hello", urlPatterns = {"/hello"})
public class Hello extends HttpServlet {

    public void init() throws ServletException {
        out.println("Инициализируем сервлет");
    }

    public void destroy() {
        out.println("Уничтожаем сервлет");
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        getServletContext().getRequestDispatcher("/index.html").forward(req, res);

        try (PrintWriter out = res.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Hello</title>");
            out.println("</head>");
            out.println("<body>");
            System.out.println("Получаем переменную hello от фильтра");
            out.println("<h1> + request.getAttribute(hello) + </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        processRequest(req, res);
        getServletContext().getRequestDispatcher("/index.html").forward(req, res);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
