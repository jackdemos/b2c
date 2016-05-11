package com.b2c.goods.dao;

import com.b2c.base.result.Result;
import com.b2c.domain.base.FrontCategory;

import java.util.List;

/**
 * Created by Oakley on 2016-05-09.
 */
public interface FrontCategoryDao {
    /**
     * 添加前台类目
     * @param category
     * 验证点:类目前下名称是已存在
     * 验证名字是否为null 或"" 或长度为0
     * @return
     */
    int addFrontCategory(FrontCategory category);

    /**
     * 修改前台类目名称，及父类目
     * @param category
     * @return
     */
    int updateFrontCategory(FrontCategory category);

    /**
     * 删除前台类目
     * @param categoryId
     * 验证点：检查类目下是否存在有效商品
     * @return
     */
    int deleteFrontCategoryById(String categoryId);

    /**
     * 查询全部前台类目,及条件查询
     * @return
     */
    List<FrontCategory> getFrontCategory(String name);

    /**
     * 查询类目名称是否存在
     * @param name
     * @return
     */
    int getCountByName(String name);
}
