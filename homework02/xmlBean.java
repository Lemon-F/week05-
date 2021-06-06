package com.geek.week05.homework02;

import org.springframework.stereotype.Component;

//写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub。
//第一点用xml
//首先定义一个类，类中写一个方法
//2.再对应的xml文件中配置bean
public class xmlBean {
    void startBean(){
        System.out.println("这是通过xml形式");
    }
}
