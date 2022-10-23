package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;

/**
 * JDBC重写
 */
public class JDBCOverLoad {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        //class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String useName="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, useName, password);
        //3.定义sql
        String sql = "update account set money =2000 where id=1";
        //4.获取执行sql的对象 Statement
        Statement stmt= conn.createStatement();
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
    }
}
