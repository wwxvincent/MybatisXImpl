package com.vincent.mybatixtest.entity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 5/30/24
 * @Description:
 */
@Data
public class UserVO {

    private String userId;

    private String userName;

    private BigDecimal balance;


}
