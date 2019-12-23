package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {
    @RequestMapping(value="/login")
public String getFirstView(){


        return "index";
    }

    @RequestMapping(value="/")
    public String getHome(){


        return "Working";
    }
}
