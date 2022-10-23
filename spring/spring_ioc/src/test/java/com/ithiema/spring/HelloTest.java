package com.ithiema.spring;

import com.itheima.spring.pojo.HelloWord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void testHello(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWord helloWord = (HelloWord) ioc.getBean("helloWord");
        helloWord.sayHello();
    }
}
