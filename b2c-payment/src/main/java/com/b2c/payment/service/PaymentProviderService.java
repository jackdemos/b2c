package com.b2c.payment.service;

import com.b2c.base.result.Result;
import com.b2c.base.result.ResultSupport;
import com.b2c.code.ResultCodeEnum;
import com.b2c.domain.user.User;
import com.b2c.payment.IPaymentService;
import com.b2c.payment.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Oakley on 2016-03-26.
 */
@Service("paymentService")
public class PaymentProviderService implements IPaymentService {

    @Autowired
    PayDao payDao;

    public Result<Boolean> payment(String userId, String key, double payment_money) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        result.processResult(true,result, ResultCodeEnum.SYS_SUCCESS.getCode(),ResultCodeEnum.SYS_SUCCESS.getDescription(),true);
        return result;
    }
}
