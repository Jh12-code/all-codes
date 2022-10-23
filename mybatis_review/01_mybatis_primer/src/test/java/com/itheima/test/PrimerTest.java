package com.itheima.test;

import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class PrimerTest {
    @Test
    public void testPrimer() throws Exception {
        /*读取Mybatis核心配置文件*/
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        /*创建SqlSessionFactoryBuild核心对象*/
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        /*创建工厂类SqlSessionFactory，产生SqlSession*/
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);

        /*创建SqlSession对象*/
        SqlSession sqlSession = sessionFactory.openSession(true);

        /*通过代理模式创建UserMapper接口的代理实现类对象*/
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

        int user = usermapper.insertUser();

        System.out.println(user);

    }


    @Test
    public void testInsertUser2() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int user2 = mapper.insertUser2();

        System.out.println(user2);
    }
}
