package com.wade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2018/3/15.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }
}
