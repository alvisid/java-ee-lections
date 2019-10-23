package com.jsplesson.calc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Calc", urlPatterns = {"Calc", "/calc"})

public class Calc {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int oper = Integer.parseInt(request.getParameter("oper"));
        double val1 = Double.parseDouble(request.getParameter("firstNum"));
        double val2 = Double.parseDouble(request.getParameter("secondNum"));
        double result = 0;
        switch (oper) {
            case 1:
                result = val1 + val2;
                break;
            case 2:
                result = val1 - val2;
                break;
            case 3:
                result = val1 / val2;
                break;
            case 4:
                result = val1 * val2;
                break;
        }
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calc</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2> Результаты расчето e</h2>");
            out.println("<div>Число №1 = " + val1 + " </div>");
            out.println("<div>Число №2 = " + val2 + " </div>");
            out.println("<div>OTвет = " + result + " </div>");
            out.println("<div><a href='index.jsp'>B ернуться на страницу с калькуляторо M</div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
