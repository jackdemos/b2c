package com.b2c.customerservice;

import com.b2c.base.result.Result;

/**
 * Created by Oakley on 2016-04-29.
 */
public interface ICustomerService {

    /**
     * 根据售后编号匿获取售后信息
     * @param number
     * @return
     */
    Result<Object> getCustomerInfoByNumber(String number);

    /**
     * 根据售后服务编号获取售后结果
     * @param number
     * @return
     */
    Result<String> getCustomerResultByNumber(String number);
}
