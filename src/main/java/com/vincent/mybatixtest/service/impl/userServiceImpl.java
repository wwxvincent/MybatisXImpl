package com.vincent.mybatixtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.mybatixtest.entity.User;
import com.vincent.mybatixtest.service.IUserService;
import com.vincent.mybatixtest.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* @author wenxuanwang
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-05-29 11:57:27
*/
@Slf4j
@Service
public class userServiceImpl extends ServiceImpl<UserMapper, User>
    implements IUserService {

}




