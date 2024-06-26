package com.vincent.mybatixtest.mapper;

import com.vincent.mybatixtest.entity.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.mybatixtest.entity.vo.AddressVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author vincent(wenxuan) wang
 * @since 2024-05-30
 */
public interface AddressMapper extends BaseMapper<Address> {

    List<AddressVO> getAllInfoByUserId(@Param("id") String id);

}
