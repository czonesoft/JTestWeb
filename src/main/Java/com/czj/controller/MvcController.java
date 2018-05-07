package com.czj.controller;

import com.czj.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.*;

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

    @RequestMapping("/testModelView")
    public ModelAndView TestModelView(){
        String viewName = "testModelView"; //视图名
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("date", new Date());
        modelAndView.addObject("name","ModelAndView");
        return modelAndView;
    }

    @RequestMapping(value = "/testModel",method = RequestMethod.GET)
    public @ResponseBody String testModel(Model model){
        model.addAttribute("time",new Date());
        model.addAttribute("name","Model");
        System.out.println(model);
        return "hello testModel";
    }

    @RequestMapping(value = "/testMap",method = RequestMethod.GET)
    public @ResponseBody String testMap(Map<String,Object> map){
        map.put("time",new Date());
        map.put("name","Map");
        return "hello testMap";
    }
}

