package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class TestDemo3 {
    @Test
    public void testDeleteById() throws Exception {
        int id=4;
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        DataSource dataSouce= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSouce.getConnection();
        String sql="delete from tb_brand where id=?";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setInt(1,id);
        int count=pstmt.executeUpdate();
        System.out.println(count>0);
        pstmt.close();
        conn.close();
    }
}
