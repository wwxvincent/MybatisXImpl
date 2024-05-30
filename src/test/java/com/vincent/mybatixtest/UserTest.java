package com.vincent.mybatixtest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.vincent.mybatixtest.entity.User;
import com.vincent.mybatixtest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 5/29/24
 * @Description:
 */
@SpringBootTest
public class UserTest {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    void testQueryByIds() {
        List<User> users = userMapper.selectAllByUserId("1");
        System.out.println(users.toString());
    }

    @Test
    void testQueryWrapper() {
        QueryWrapper<User> wrapper = new QueryWrapper<User>()
                .select("user_id", "user_name", "balance")
                .like("user_name" , "瓜");
        List<User> users = userMapper.selectList(wrapper);
    }

    @Test
    void testLambdaQueryWrapper() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>()
                .select(User::getUserId, User::getUserName, User::getBalance)
                .like(User::getUserName, "瓜")
                .ge(User::getBalance, 1000);
        List<User> users = userMapper.selectList(wrapper);
//        users.forEach(System.out::println);
        for(User en : users){
            System.out.println(en);
        }
    }

    @Test
    void testUpdateByUpdateWrapper() {
        List<String> ids = new ArrayList<>();
        ids = Arrays.asList(new String[]{"1", "2"});
        UpdateWrapper<User> wrapper = new UpdateWrapper<User>()
                .setSql("balance = balance -200")
                .in("user_id", ids);
        userMapper.update(null, wrapper);
    }

    @Test
    void testCustomSqlUpdate() {
        //1. 更新条件
        List<String> ids = new ArrayList<>();
        ids = Arrays.asList(new String[]{"1", "2"});
        int amount =200;
        //2. 定义条件
        QueryWrapper<User> wrapper = new QueryWrapper<User>().in("user_id", ids);
        //3. 调用自定义SQL方法
        userMapper.updateBalanceByIds(wrapper, amount);
    }


}
