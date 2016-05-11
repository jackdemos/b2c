package com.b2c.goods.dao;

import com.b2c.base.result.Result;
import com.b2c.domain.base.BackCategory;

import java.util.List;

/**
 * Created by Oakley on 2016-05-09.
 *
 * 包含前台类目 ，后台类目，前后台类目关系设置
 */
public interface BackCategoryDao {

    /**
     * 添加后台
     * @param category
     * 验证点:类目前下名称是已存在
     * 验证名字是否为null 或"" 或长度为0
     * @return
     */
    int addBackCategory(BackCategory category);

    /**
     * 修改类目名称，及父类目
     * @param category
     * @return
     */
    int updateBackCategoryById(BackCategory category);

    /**
     * 删除后台类目
     * @param categoryId
     * 验证点：检查类目下是否存在有效商品
     * @return
     */
    int deleteBackCategoryById(String categoryId);

    /**
     * 查询全部后台类目
     * @return
     */
    List<BackCategory> getBackCategory(String name);

    /**
     * 查询是否存在
     * @param name
     * @return
     */
    int getCountByName(String name);


}
