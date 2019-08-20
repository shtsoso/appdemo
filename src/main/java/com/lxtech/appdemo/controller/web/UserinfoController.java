package com.lxtech.appdemo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/userinfo")
@Controller
public class UserinfoController {

    @RequestMapping("/test")
    @ResponseBody
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
