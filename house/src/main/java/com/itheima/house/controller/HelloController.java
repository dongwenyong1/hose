package com.itheima.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ${dong}
 * @date 2020/1/14 20:36
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
  @RequestMapping("/hello")
  @ResponseBody
    public  String say(){



        return "hello";
    }
}
