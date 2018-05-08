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
    @ResponseBody
    @RequestMapping("/adduser")
    public Person get(@RequestBody Person person) throws ParseException {
        Person u = new Person();
        u.setId(1);
        u.setName("czjczj");
        u.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1976-8-1"));
        return u;
    }
}
