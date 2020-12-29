package cn.xzh.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="FirstServlet",urlPatterns = "/firstServlet")
public class FirstServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext context = this.getServletContext();
        String username = request.getParameter("username");
        context.setAttribute("username",username);
        response.sendRedirect(context.getContextPath()+"/thridServlet");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        request.setAttribute("username",username);
        request.getServletContext();
        request.getRequestDispatcher("/secondServlet").forward(request,response);
    }
}
