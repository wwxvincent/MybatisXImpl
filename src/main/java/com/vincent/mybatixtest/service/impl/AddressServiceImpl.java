package com.vincent.mybatixtest.service.impl;

import com.vincent.mybatixtest.entity.Address;
import com.vincent.mybatixtest.mapper.AddressMapper;
import com.vincent.mybatixtest.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
