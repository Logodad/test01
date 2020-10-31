package com.qf.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class testController {

    @GetMapping("/test1")
    @ResponseBody
    public String test(@RequestParam("s") String s){
        System.out.println("s="+s);
        return "测试专用";
    }
}
