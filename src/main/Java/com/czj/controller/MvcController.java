package com.czj.controller;

import com.czj.model.*;
import com.czj.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.*;

import javax.servlet.http.*;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
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

    @RequestMapping(value="/testparam")
    public String testRequestParam(@RequestParam(value="id") Integer id,
                                   @RequestParam(value="name")String name){
        System.out.println(id+" "+name);
        return "/home";
    }

    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public String get(@PathVariable("id") Integer id){
        System.out.println("get"+id);
        return "/home";
    }

    @RequestMapping(value="/user/{id}",method=RequestMethod.POST)
    public String post(@PathVariable("id") Integer id){
        System.out.println("post"+id);
        return "/home";
    }

    @RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
    public String put(@PathVariable("id") Integer id){
        System.out.println("put"+id);
        return "/home";
    }

    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        System.out.println("delete"+id);
        return "/home";
    }

    //请求转发到controller(必须用forward)
    @RequestMapping("/testForward2Action")
    public ModelAndView TestForward2Action(HttpServletRequest req, ModelAndView mv) throws Exception{
        mv.setViewName("forward:hello");
        return mv;
    }

    //访问非视图解析器的视图时,用forward
    @RequestMapping("/testForward2View")
    public ModelAndView TestForward2View(HttpServletRequest req,ModelAndView mv) throws Exception{
        mv.setViewName("forward:/WEB-INF/views/home.jsp");  //不添加前后缀
        return mv;
    }

    //重定向到controller
    @RequestMapping("/testRedirect2Action")
    public ModelAndView TestRedirect2Action(HttpServletRequest req,ModelAndView mv) throws Exception{
        mv.setViewName("redirect:hello");
        return mv;
    }

    @RequestMapping("/test2View")
    public ModelAndView Test2View(HttpServletRequest req,ModelAndView mv) throws Exception{
        mv.setViewName("redirect:home.jsp");
        return mv;
    }

    @RequestMapping(value = "/testUpload", method = RequestMethod.GET)
    public  String TestUploadDemo() throws Exception{
        return "uploadDemo";
    }

    @RequestMapping(value = "/testUploadAction",method = RequestMethod.POST)
    public String TestUpload(HttpServletRequest req) throws Exception {
        //MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req; //直接转换报RequestFacade cannot be cast to MultipartHttpServletRequest
        MultipartResolver resolver = new CommonsMultipartResolver(req.getSession().getServletContext());
        MultipartHttpServletRequest mreq = resolver.resolveMultipart(req);

        MultipartFile file = mreq.getFile("myfile");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/")+
                "uploads/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
        fos.write(file.getBytes());
        fos.flush();
        fos.close();
        return "home";
    }

    @Autowired
    PersonService personService;

    @RequestMapping("/testIoc")
    public String TestIoc(){
        personService.introduce();
        return "home";
    }
}

