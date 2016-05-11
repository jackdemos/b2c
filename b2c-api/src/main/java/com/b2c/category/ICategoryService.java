package com.b2c.category;

import com.b2c.base.result.Result;
import com.b2c.domain.base.BackCategory;

import java.util.List;

/**
 * Created by Oakley on 2016-04-29.
 */
public interface ICategoryService {
    /**
     * 添加后台
     * @param category
     * 验证点:类目前下名称是已存在
     * 验证名字是否为null 或"" 或长度为0
     * @return
     */
    Result<String> addBackCategory(BackCategory category);

    /**
     * 修改类目名称，及父类目
     * @param category
     * @return
     */
    Result<Boolean> updateBackCategoryById(BackCategory category);

    /**
     * 删除后台类目
     * @param categoryId
     * 验证点：检查类目下是否存在有效商品
     * @return
     */
    Result<Boolean> deleteBackCategoryById(String categoryId);

    /**
     * 查询全部后台类目
     * @return
     */
    Result<List<BackCategory>> getBackCategory(String name);

    /**
     * 查询是否存在
     * @param name
     * @return
     */
    Result<Integer> getCountByName(String name);


}
