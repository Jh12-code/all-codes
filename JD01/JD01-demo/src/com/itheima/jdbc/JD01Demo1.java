package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JD01Demo1 {
    public static void main(String[] args) throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="123456";

        Connection conn = DriverManager.getConnection(url, username, password);
        String sql1="update account set money=3000 where id =1";
        String sql2="update account set money=3000 where id =2";

        Statement statement = conn.createStatement();

        try {
            conn.setAutoCommit(false);
            int count1 = statement.executeUpdate(sql1);
            int count2 = statement.executeUpdate(sql2);
            System.out.println(count2);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        }
        statement.close();
        conn.close();
    }
}
