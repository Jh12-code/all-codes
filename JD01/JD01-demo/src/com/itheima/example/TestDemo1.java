package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class TestDemo1 {
    @Test
    public void testAdd( ) throws Exception{
            String brandName="香飘飘";
            String companyName="香飘飘";
            int ordered=1;
            String description="绕地球一圈";
            int status =1;
            Properties prop=new Properties();
            prop.load(new FileInputStream("src/druid.properties"));
            DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
            Connection conn = dataSource.getConnection();
            String sql="insert into tb_brand(brand_name,company_name,ordered,description,status) values(?,?,?,?,?);";
            PreparedStatement pstmt=conn.prepareStatement(sql);

            pstmt.setString(1,brandName);
            pstmt.setString(2,companyName);
            pstmt.setInt(3,ordered);
            pstmt.setString(4,description);
            pstmt.setInt(5,status);
            int count=pstmt.executeUpdate();
            System.out.println(count>0);
            pstmt.close();
            conn.close();
        }
    }
