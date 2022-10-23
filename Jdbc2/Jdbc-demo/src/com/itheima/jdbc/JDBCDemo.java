package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //1. 注册驱动
         Class.forName("com.mysql.jdbc.Driver");
        //2. 获取连接
        String url="com.mysql:127.0.0.1:3306/db2";
        String username="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql = "update user set money = 2000 where id = 1";
        Statement stmt=connection.createStatement();
        int count = stmt.executeUpdate(sql);
        stmt.close();
        connection.close();
    }
}
