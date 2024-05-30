package com.vincent.mybatixtest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.vincent.mybatixtest.entity.Address;
import com.vincent.mybatixtest.entity.vo.AddressVO;
import com.vincent.mybatixtest.mapper.AddressMapper;
import com.vincent.mybatixtest.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
@Service
@Slf4j
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<AddressVO> getAllInfoByUserId(String id) {
        return addressMapper.getAllInfoByUserId(id);
    }


    // 这个是用lambdawrapper 来实现一个罗技
    // 更新默认地址is_default 为1， 但是需要先将同用户id下的其他地址的is_default 设置为0
    // 并且设置回滚事物
    @Override
    @Transactional(rollbackFor= Exception.class)
    public boolean updateDefaultAddr(int id, String userId) throws Exception {
        // 创建LambdaUpdateWrapper实例来更新除了指定addressId外的所有记录的is_default为0
        LambdaUpdateWrapper<Address> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Address::getUserId, userId)
                .ne(Address::getId, id)
                .set(Address::getIsDefault, 0);
        addressMapper.update(null, updateWrapper);

        // 不需要清除之前的条件，因为下一个update会创建新的LambdaUpdateWrapper实例

        if(addressMapper.selectById(id) == null) throw new Exception("No Such address");
        // 创建新的LambdaUpdateWrapper实例来更新指定addressId的记录的is_default为1
        LambdaUpdateWrapper<Address> updateWrapper2 = new LambdaUpdateWrapper<>();
        updateWrapper2.eq(Address::getId, id)
                .set(Address::getIsDefault, 1);
        addressMapper.update(null, updateWrapper2);
        return true;
    }
}
