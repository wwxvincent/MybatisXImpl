package com.vincent.mybatixtest.controller;


import com.vincent.mybatixtest.entity.Address;
import com.vincent.mybatixtest.entity.vo.AddressVO;
import com.vincent.mybatixtest.service.IAddressService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final IAddressService addressService;

    @GetMapping("/getById")
    public Address selectById(@Param("id") Integer id) {
            return addressService.getById(id);
    }
}
