package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet( "/bServlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //获取cookie

    //1.获取cookie数组
        Cookie[] cookies = request.getCookies();

        //遍历数组
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if ("username".equals(name)) {


                String value = cookie.getValue();
                value=URLDecoder.decode(value,"UTF-8");
                System.out.println(name+":"+value);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
