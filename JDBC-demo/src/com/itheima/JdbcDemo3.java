package com.itheima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo3 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        //class.forName("com.mysql,jdbc.Driver");

        String url="jdbc:mysql:///db1?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql="update account set money=2000 where id=1";

        Statement stmt=conn.createStatement();
        int count =stmt.executeUpdate(sql);
        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
