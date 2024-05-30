package com.vincent.mybatixtest.controller;


import com.vincent.mybatixtest.entity.Address;
import com.vincent.mybatixtest.entity.vo.AddressVO;
import com.vincent.mybatixtest.service.IAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
@RestController
@RequestMapping("api/address")
@Api(tags = "Address Management", description = "Operation for Address management")
@RequiredArgsConstructor
public class AddressController {

    private final IAddressService addressService;

    @ApiOperation("通过ID获取地址")
    @GetMapping("/getById")
    public Address selectById(@RequestParam Integer id) {
        System.out.println(id);
            return addressService.getById(id);
    }

    @ApiOperation("新增地址")
    @PostMapping("/add")
    public boolean addAddress(@RequestBody Address address) {
        return addressService.save(address);
    }

    @ApiOperation("通过ID删除地址")
    @PostMapping("/deleteById")
    public boolean deleteById(@RequestParam Integer id) {
        System.out.println(id);
        return addressService.removeById(id);
    }

    @ApiOperation("get All info")
    @GetMapping("/getAllInfoByUserId")
    public List<AddressVO> getAllInfoByUserId(@RequestParam String id) {
        return addressService.getAllInfoByUserId(id);
    }

    @ApiOperation("change default addr")
    @PostMapping("/updateDefaultAddr")
    public boolean updateDefaultAddr(@RequestParam int id, @RequestParam String userId) throws Exception {
        return addressService.updateDefaultAddr(id, userId);
    }
}
