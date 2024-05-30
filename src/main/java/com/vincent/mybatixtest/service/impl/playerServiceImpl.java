package com.vincent.mybatixtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.mybatixtest.entity.Player;
import com.vincent.mybatixtest.service.IPlayerService;
import com.vincent.mybatixtest.mapper.PlayerMapper;
import org.springframework.stereotype.Service;

/**
* @author wenxuanwang
* @description 针对表【player】的数据库操作Service实现
* @createDate 2024-05-29 13:53:08
*/
@Service
public class playerServiceImpl extends ServiceImpl<PlayerMapper, Player>
    implements IPlayerService {


}




