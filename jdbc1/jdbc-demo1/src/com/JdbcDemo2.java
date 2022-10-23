package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql:///db1?useSSL=false";
        String usename="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, usename, password);
        String sql = "update account set money = 4000 where id = 1";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        if(count>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        stmt.close();
        conn.close();
    }
}
