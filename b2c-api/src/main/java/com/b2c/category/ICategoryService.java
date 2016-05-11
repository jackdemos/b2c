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
    Result<Integer> getCountByBackCategoryName(String name);


    /**
     * 添加前台类目
     * @param category
     * @return
     */
    Result<Boolean> addFrontCategory(FrontCategory category);

    /**
     * 修改前台类目名称，及父类目
     * @param category
     * @return
     */
    Result<Boolean> updateFrontCategoryById(FrontCategory category);

    /**
     * 删除前台类目
     * @param categoryId
     * 验证点：检查类目下是否存在有效商品
     * @return
     */
    Result<Boolean> deleteFrontCategoryById(String categoryId);

    /**
     * 查询全部前台类目
     * @return
     */
    Result<List<FrontCategory>> getFrontCategory(String name);

    /**
     * 通过名称查找(前台类目)是否存在有效的记录
     * @param name
     * @return
     */
    Result<Integer> getCountByFrontCategoryName(String name);


    /**
     * 添加类目关系
     * @param categoryRelation
     * @return
     */
    Result<String> addCategoryRelation(CategoryRelation categoryRelation);

    /**
     * 修改状态状态
     * @param id
     * @return
     */
    Result<Boolean> deleteCategoryRelationById(String id);

    /**
     * 查询所有类目关系
     * @param name 如果name 为空null 则是筛选查询
     * @return
     */
    Result<List<CategoryRelation>> getCategoryRelation(String name);

    /**
     * 获取类目关联关系是否存在
     * @param categoryRelation
     * @return
     */
    Result<Integer> getCountByCategoryRelation(CategoryRelation categoryRelation);


}
