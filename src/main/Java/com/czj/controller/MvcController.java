package com.czj.controller;

import com.czj.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mvc")
public class MvcController {
    //访问路径 host:port/hello/mvc
    @RequestMapping("/hello")
    public String Hello(){
        return "home";  //返回home.jsp
    }

    @RequestMapping("/toperson")
    public void ToPerson(Person man){
        System.out.println("hello, "+man.getName()+", are you "+man.getAge()+" years old?");
    }

    @RequestMapping("/toconvert")
    public void ToConvert(Person man){
        System.out.println("hello, "+man.getName()+", are you birthday is :"+man.getBirthday()+",your salary is"+man.getSalary());
    }
}

