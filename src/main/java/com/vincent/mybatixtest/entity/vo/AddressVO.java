package com.vincent.mybatixtest.entity.vo;

import lombok.Data;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 5/30/24
 * @Description:
 */
@Data
public class AddressVO {
    private Integer id;

    private String userName;

    private String userId;

    private int isDefault;

    private String country;

    private String state;

    private String city;

    private String mobile;
}
