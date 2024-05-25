package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
      return "home.html";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login.jsp";
    }
    @RequestMapping("/logout")
    public  String logout(){
        return "logout.jsp";
    }
}
