package com.b2c.goods.dao;

import com.b2c.base.result.Result;
import com.b2c.domain.base.CategoryRelation;

import java.util.List;

/**
 * Created by Oakley on 2016-05-09.
 */
public interface CategoryRelationDao {
    /**
     * 添加类目关系
     * @param categoryRelation
     * @return
     */
    int addCategoryRelation(CategoryRelation categoryRelation);

    /**
     * 删除类目关系
     * @param id
     * @return
     */
    int deleteCategoryRelationById(String id);


    /**
     * 查询所有类目关系
     * @param name
     * @return
     */
    List<CategoryRelation> getCategoryRelation(String name);

    int getCountByCategoryRelation(CategoryRelation categoryRelation);
}
