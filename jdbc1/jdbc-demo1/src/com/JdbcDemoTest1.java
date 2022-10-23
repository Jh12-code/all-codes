package com;

import com.pojo.Account;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemoTest1 {
    /**
     * 查询account账户表数据，封装为Account对象中，并且储存到arraylist集合中
     * 1。定义实体类Account
     * 2.查询数据，封装到Account对象中
     * 3.将Account对象存入Arraylist集合中
     */
    @Test
    public void testResultset2() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql:///db1?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义sql
        String sql ="select * from account";
        //4.获取statement对象
        Statement stmt = conn.createStatement();
        //5.执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //创建集合
        List<Account> list =new ArrayList<>();
        while (rs.next()){
            Account account =new Account();
            //获取数据
            int id=rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            account.setId(id);
            account.setName(name);
            account.setMoney(money);
            list.add(account);

        }
        System.out.println(list);
        //7. 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }

    }


