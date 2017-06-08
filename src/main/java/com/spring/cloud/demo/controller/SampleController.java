package com.spring.cloud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SampleController
 *
 * @author shisan
 * @create 2017-06-08 上午9:37
 **/

@Controller
@RequestMapping("/sampleController")
public class SampleController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello world~";
    }
}
