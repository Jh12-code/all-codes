package com.itheima.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("JD01-demo/src/druid.properties"));
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);

        Connection connection=dataSource.getConnection();
        System.out.println(connection);

    }
}
