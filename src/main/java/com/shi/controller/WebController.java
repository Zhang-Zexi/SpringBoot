package com.shi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/ttt")
    public String index(ModelMap modelMap){
//        modelMap.addAttribute("message","Joh SHI");
        return "HelloWorld";
    }
}
