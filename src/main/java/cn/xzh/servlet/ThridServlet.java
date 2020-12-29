package cn.xzh.servlet;

import com.sun.xml.internal.ws.transport.http.HttpAdapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ThridServlet",urlPatterns = "/thridServlet")
public class ThridServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletContext context = this.getServletContext();
        context.setAttribute("username","ServletContext名字被重定向改了");
        request.getRequestDispatcher("/changeName.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
