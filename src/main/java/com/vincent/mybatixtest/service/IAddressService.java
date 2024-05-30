package com.vincent.mybatixtest.service;

import com.vincent.mybatixtest.entity.Address;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.mybatixtest.entity.vo.AddressVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
public interface IAddressService extends IService<Address> {

    List<AddressVO> getAllInfoByUserId(String id);

    boolean updateDefaultAddr(int id, String userId) throws Exception;
}
