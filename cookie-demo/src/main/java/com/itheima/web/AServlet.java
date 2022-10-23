package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet( "/aServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        //创建cookie对象
        //Cookie cookie=new Cookie("username","zs");
        String value="张三";
        value = URLEncoder.encode(value, "UTF-8");
        System.out.println("存储数据："+"value");
        Cookie cookie=new Cookie("username","value");
        //设置存活时间 1周7天
        cookie.setMaxAge(60*60*24*7);
        //2.发送cookie对象
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
