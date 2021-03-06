package com.geek.week05.homework08;

import com.geek.week05.aop01.ISchool;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.annotation.Resource;

@EnableAutoConfiguration
@Data
public class School implements ISchool {

    // Resource
    @Autowired(required = true) //primary
            Klass class1;

    @Resource(name = "student100")
    Student student100;

    @Override
    public void ding(){
        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student100);

    }

}