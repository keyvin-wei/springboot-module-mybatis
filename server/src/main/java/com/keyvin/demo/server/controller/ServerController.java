package com.keyvin.demo.server.controller;

import com.keyvin.demo.api.config.ResultBody;
import com.keyvin.demo.model.entity.User;
import com.keyvin.demo.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiwh
 * @date 2019/10/21 19:39
 */
@RestController
public class ServerController {
    @Autowired
    private UserService userService;

    @RequestMapping("/server")
    public String index(){
        User user = userService.findById(2);
        String message = "hello ServerController index"+user.getName();
        return ResultBody.success(message);
    }

    @RequestMapping("/server1")
    public String error(){
        String str = null;
        if(str.equals("d")){
            System.out.println(11111);
        }
        return ResultBody.success();
    }

}
