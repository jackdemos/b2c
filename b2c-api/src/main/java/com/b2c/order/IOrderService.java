package com.b2c.order;

import com.b2c.base.result.Result;
import com.b2c.domain.order.Order;

import java.util.List;

/**
 * Created by Oakley on 2016-04-27.
 *
 * 定义订单与订单详情的接口
 **/

public interface IOrderService {
    /**
     * 根据用户id,及用户状态,状态查询用户订单
     * @param userId
     * @param status
     * @return
     */
    Result<List<Order>> getOrderListByUserId(String userId,int status);

    /**
     * 查询所有订单
     * @return
     */
    Result<List<Order>> getAllOrder();
}
