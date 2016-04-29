package com.b2c.goods.service.brand;

import com.b2c.base.result.Result;
import com.b2c.brand.IBrandService;
import com.b2c.domain.base.Brand;
import org.springframework.stereotype.Service;

/**
 * Created by Oakley on 2016-04-29.
 */
@Service("brandService")
public class BrandProviderService implements IBrandService {
    public Result<Boolean> createBrand(Brand brand) {
        return null;
    }
}
