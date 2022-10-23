package com.pojo;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 执行DML语句
 * @throws Exception
 */
@Test
public class JdbcDemo3 {
    public void testDML() throws Exception {
        //2.获取链接
        String url = "jdbc:mysql:///db1?useSSL=false";
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义sql
        String sql="update account set money = 3000 where id = 1";
        //4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //5.执行sql
        int count = stmt.executeUpdate(sql);
        //6.处理结果
        if(count>0){
            System.out.println("修改成功~~~");

        }
        else{
            System.out.println("修改失败");
        }
        //7.释放资源
        stmt.close();
        conn.close();
    }
}
