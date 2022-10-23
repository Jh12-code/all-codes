package com.ithiema.spring.test;

import com.itheima.spring.pojo.Clazz;
import com.itheima.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {
    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

        //Student studentOne = (Student) ioc.getBean("studentOne");
        //Student student = ioc.getBean("studentOne", Student.class);
        //Student student = ioc.getBean(Student.class);
        //Student student = ioc.getBean("studentTwo", Student.class);
        /*Student student = ioc.getBean("studentFive", Student.class);*/
        Student student = ioc.getBean("studentSix", Student.class);
        System.out.println(student);
    }


   @Test
    public void testXml(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(clazz);
    }
}
