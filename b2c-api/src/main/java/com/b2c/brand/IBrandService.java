package com.b2c.brand;

import com.b2c.base.result.Result;
import com.b2c.domain.base.Brand;

/**
 * Created by Oakley on 2016-04-29.
 */
public interface IBrandService {

    Result<Boolean> createBrand(Brand brand);
}
