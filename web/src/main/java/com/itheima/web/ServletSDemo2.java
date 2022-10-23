package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/demo2",loadOnStartup=1)
public class ServletSDemo2 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init~~~");
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet hello world");
    }
    public void destroy() {
        System.out.println("destroy~~");
    }

    public String getServletInfo() {
        return null;
    }





    public ServletConfig getServletConfig() {
        return null;
    }
}

