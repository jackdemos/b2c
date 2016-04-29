package com.b2c.customerservice.service;

import com.b2c.base.result.Result;
import com.b2c.customerservice.ICustomerService;
import org.springframework.stereotype.Service;

/**
 * Created by Oakley on 2016-04-29.
 */
@Service("customerService")
public class CustomerProviderService implements ICustomerService {

    public Result<Object> getCustomerInfoByNumber(String number) {
        return null;
    }

    public Result<String> getCustomerResultByNumber(String number) {
        return null;
    }
}
