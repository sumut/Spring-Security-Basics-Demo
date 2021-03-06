package com.sumutella.basicspringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sumutella
 * @time 1:47 PM
 * @since 11/12/2019, Tue
 */
@Controller
public class MySpringSecurityDemoController  {




    @GetMapping("/my-login")
    public String showLogin(){
        return "login";
    }


    @GetMapping("/")
    public String showLanding() {
        return "landing";
    }

    @GetMapping("/employee")
    public String showHome() {
        return "home";
    }

    @GetMapping("/manager/announcements")
    public String showManagerHome() {
        return "manager-announcements";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }
}
