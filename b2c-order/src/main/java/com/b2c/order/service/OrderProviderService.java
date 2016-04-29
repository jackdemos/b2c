package com.b2c.order.service;

import com.b2c.base.result.Result;
import com.b2c.domain.order.Order;
import com.b2c.order.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Oakley on 2016-04-29.
 */
@Service("orderService")
public class OrderProviderService implements IOrderService {

    public Result<List<Order>> getOrderListByUserId(String userId, int status) {
        return null;
    }

    public Result<List<Order>> getAllOrder() {
        return null;
    }
}
