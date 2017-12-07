package com.uhurusystems.web.contollers;


import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}
