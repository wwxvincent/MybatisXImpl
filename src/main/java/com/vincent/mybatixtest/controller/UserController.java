package com.vincent.mybatixtest.controller;

import com.vincent.mybatixtest.entity.User;
import com.vincent.mybatixtest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 5/30/24
 * @Description:
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    // spring不推荐用Autowired
    // 推荐使用构造函数
//    @Autowired
//    private IUserService userService;
    //就利用Lombok的注解
    // 加了final后，变成常量，在初始化的时候就必须
    // 加@RequiredArgsConstructor
    private final IUserService userService;


    //
    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }
}
