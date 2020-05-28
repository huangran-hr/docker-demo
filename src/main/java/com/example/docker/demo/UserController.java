package com.example.docker.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: HR
 * @Date: 2020/5/25 16:45
 * @Description:
 */
@RestController
public class UserController {

    @RequestMapping("/user/find")
    @ResponseBody
    public Object findUser(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","huangran");
        map.put("age","28");
        return map;
    }
}
