package ru.geekbrains.testClass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Error404Handler", urlPatterns = {"/error404handler"})
public class Error404Handler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error 404. Page not found!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
