package cn.xzh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName="FirstFilter",urlPatterns = "/filterServlet",dispatcherTypes = {DispatcherType.REQUEST})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化了firstFilter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("是否每次都拦截?");
        request.setAttribute("filter","拦截过了");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("摧毁firstFilter");
    }
}
