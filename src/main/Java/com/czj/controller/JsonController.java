package com.czj.controller;

import com.czj.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: Spring MVC Json格式数据操作
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/jsondemo")
    public  String jsonDemo(){
        return "jsondemo";
    }

    @ResponseBody  //不写这个注解，没有返回数据
    @RequestMapping("/adduser")
    public Person get(/*@RequestBody*/ Person  person) throws ParseException {//不用写@RequestBody，ajax直接传json对象。项目需配置jackson.jar
        Person u = new Person();
        u.setId(person.getId());
        u.setName(person.getName());
        u.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1976-8-1"));
        u.setSalary(30000);//不设置这个报500错误，long不允许为空
        return u;
    }
}
