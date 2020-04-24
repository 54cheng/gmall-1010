package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2020-04-22 09:41:01
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

    public int closeOrder(String orderToken);

    public int successOrder(String orderToken);

}
