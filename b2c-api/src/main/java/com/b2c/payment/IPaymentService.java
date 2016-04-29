package com.b2c.payment;


import com.b2c.base.result.Result;

/**
 * Created by Oakley on 2016-03-24.
 */
public interface IPaymentService {
     Result<Boolean> payment(String userId, String key, double payment_money);
}
