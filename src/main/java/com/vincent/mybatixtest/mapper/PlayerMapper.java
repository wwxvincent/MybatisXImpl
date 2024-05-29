package com.vincent.mybatixtest.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.vincent.mybatixtest.entity.Player;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author wenxuanwang
* @description 针对表【player】的数据库操作Mapper
* @createDate 2024-05-29 13:53:08
* @Entity com.vincent.mybatixtest.entity.Player
*/

public interface PlayerMapper extends BaseMapper<Player> {
    List<Player> searchById(@Param("id") String id);
}




