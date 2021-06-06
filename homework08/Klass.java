package com.geek.week05.homework08;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


import java.util.List;

//开启自动装配
@EnableAutoConfiguration
@Data
public class Klass {
    List<Student> students;

    public void dong(){
        System.out.println(this.getStudents());
    }

}