package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class TestDemo2 {
        @Test
    public void testUpdate() throws Exception{
            String brandName ="香飘飘";
            String companyName="香飘飘";
            int ordered=1000;
            String description="绕地球三圈";
            int status=1;
            int id=4;
            Properties prop=new Properties();
            prop.load(new FileInputStream("src/druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
            Connection conn=dataSource.getConnection();
            String sql = " update tb_brand\n" +
                    "         set brand_name  = ?,\n" +
                    "         company_name= ?,\n" +
                    "         ordered     = ?,\n" +
                    "         description = ?,\n" +
                    "         status      = ?\n" +
                    "     where id = ?";

            PreparedStatement pstmt=conn.prepareStatement(sql);

            pstmt.setString(1,brandName);
            pstmt.setString(2,companyName);
            pstmt.setInt(3,ordered);
            pstmt.setString(4,description);
            pstmt.setInt(5,status);
            pstmt.setInt(6,id);
            int count = pstmt.executeUpdate();
            System.out.println(count>0);
            pstmt.close();
            conn.close();
        }
    }

