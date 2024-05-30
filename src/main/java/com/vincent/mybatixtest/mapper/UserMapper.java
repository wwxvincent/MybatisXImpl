package com.vincent.mybatixtest.mapper;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.vincent.mybatixtest.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author wenxuanwang
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-05-29 11:57:27
* @Entity com.vincent.mybatixtest.entity.User
*/

public interface UserMapper extends BaseMapper<User> {

    List<User> selectAllByUserId(@Param("userId") String userId);

    int insertAll(User user);

    void updateBalanceByIds(@Param("ew") QueryWrapper<User> wrapper, @Param("amount") int amount);
}




