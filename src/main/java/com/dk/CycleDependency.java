package com.dk;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleDependency {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) applicationContext.getBean("A");
        B b = (B) applicationContext.getBean("B");

        System.out.println(ToStringBuilder.reflectionToString(a));
        System.out.println(ToStringBuilder.reflectionToString(b));
    }
}
