package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC API 详解：Connection
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        //class.Class.forName("com.mysql.jdbc.driver");
        //2.获取连接：如果连接的是本机mysql并且端口默认的3306，可以简化为
        String url ="jdbc:mysql:///db1?useSSl=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义sql
        String sql1="update account set money=3000 where id=1";
        String sql2="update account set money=3000 where id=2";
        //4.获取执行sql的对象 Sattement
        Statement stmt = conn.createStatement();
        try{
            //---- 开启事务 ----
            conn.setAutoCommit(false);
            //5。执行sql
            int count1=stmt.executeUpdate(sql1);//受影响的行数
            //处理结果
            System.out.println(count1);

            //执行sql
            int count2 = stmt.executeUpdate(sql2);//受影响的行数
            //6.处理的结果
            System.out.println(count2);
            //---- 提交事务 ----
            // 程序运行到此处，说明没有出现任何问题，则需要提交事务
            conn.commit();
        }catch (Exception e){
            //----回滚事务 ----
            //程序在出现异常时会执行这个地方，此时就需要回滚事务
            conn.rollback();
            e.printStackTrace();
        }
        //释放资源
        stmt.close();
        conn.close();

    }

}
