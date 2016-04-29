package com.b2c.search;


/**
 * Created by Oakley on 2016-04-29.
 */
public interface ISearchService {

    /**
     * 构建spu索引
     * @param goodsId
     */
     void createGoodsIndex(String goodsId);

    /**
     *构建sku索引
     * @param skuId
     */
    void createSkuIndex(String skuId);
}
