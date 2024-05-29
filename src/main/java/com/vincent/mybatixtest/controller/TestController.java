package com.vincent.mybatixtest.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vincent.mybatixtest.entity.Player;
import com.vincent.mybatixtest.entity.User;
import com.vincent.mybatixtest.service.IPlayerService;
import com.vincent.mybatixtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 5/29/24
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    IUserService userService;

    @Autowired
    IPlayerService playerService;

    @GetMapping("/test")
    public User test(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_id",1);
        User user = userService.getOne(userQueryWrapper);
        return user;
    }

    @GetMapping("/test2")
    public Player test2(){
        QueryWrapper<Player> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id",1);
        Player player = playerService.getOne(userQueryWrapper);
        return player;
    }
}
