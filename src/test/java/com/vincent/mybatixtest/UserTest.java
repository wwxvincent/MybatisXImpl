package com.vincent.mybatixtest;

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
        users.forEach(System.out::println);
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
}
