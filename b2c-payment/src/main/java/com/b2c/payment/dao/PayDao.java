package com.b2c.payment.dao;

import com.b2c.domain.order.Order;

/**
 * Created by Oakley on 2016-03-26.
 */
public interface PayDao {
     Order getPayNumberByOrderNum(String orderNumber);
}
