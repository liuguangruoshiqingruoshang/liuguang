package com.hpb.demo1.BB;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class B {
    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

}
