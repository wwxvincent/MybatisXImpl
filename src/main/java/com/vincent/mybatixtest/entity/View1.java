package com.vincent.mybatixtest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("view1")
public class View1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer addressId;

    private String userName;

    private String userId;

    private Boolean isDefault;

    private String country;

    private String state;

    private String city;

    private String mobile;


}
