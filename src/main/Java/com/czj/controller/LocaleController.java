package com.czj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @Description:多语言国际化样例
 */
@Controller
@RequestMapping("/mvc")
public class LocaleController {
    @Autowired
    SessionLocaleResolver resolver;

    @RequestMapping("/locale")
    public ModelAndView setLocale() throws  Exception{
        ModelAndView modelAndView = new ModelAndView("locale");
        return modelAndView;
    }
}
