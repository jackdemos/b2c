package com.b2c.goods.service.category;

import com.b2c.base.result.Result;
import com.b2c.base.result.ResultSupport;
import com.b2c.category.ICategoryService;
import com.b2c.code.ResultCodeEnum;
import com.b2c.domain.base.BackCategory;
import com.b2c.domain.base.CategoryRelation;
import com.b2c.domain.base.FrontCategory;
import com.b2c.goods.dao.BackCategoryDao;
import com.b2c.goods.dao.CategoryRelationDao;
import com.b2c.goods.dao.FrontCategoryDao;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Oakley on 2016-04-29.
 */
@Service("categoryService")
public class CategoryProviderService implements ICategoryService {

    @Autowired
    BackCategoryDao backCategoryDao;

    @Autowired
    FrontCategoryDao frontCategoryDao;

    @Autowired
    CategoryRelationDao categoryRelationDao;

    public Result<String> addBackCategory(BackCategory category) {
        ResultSupport<String> result = new ResultSupport<String>();
        backCategoryDao.addBackCategory(category);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), category.getId());
        return result;
    }

    public Result<Boolean> updateBackCategoryById(BackCategory category) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = backCategoryDao.updateBackCategoryById(category);
        if (count > 0) {
            flag = true;
        }
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), flag);
        return result;
    }

    public Result<Boolean> deleteBackCategoryById(String categoryId) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = backCategoryDao.deleteBackCategoryById(categoryId);
        if (count > 0) {
            flag = true;
        }
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), flag);
        return result;
    }

    public Result<List<BackCategory>> getBackCategory(String name) {
        ResultSupport<List<BackCategory>> result = new ResultSupport<List<BackCategory>>();
        List<BackCategory> backCategoryList = backCategoryDao.getBackCategory(name);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), backCategoryList);
        return result;
    }

    public Result<Integer> getCountByBackCategoryName(String name) {
        ResultSupport<Integer> result = new ResultSupport<Integer>();
        int code = ResultCodeEnum.SYS_SUCCESS.getCode();
        String message = ResultCodeEnum.SYS_SUCCESS.getDescription();
        int count = backCategoryDao.getCountByName(name);
        if (count  > 0) {
            code = ResultCodeEnum.SYS_BACKCATEGORY_EXISTS.getCode();
            message = ResultCodeEnum.SYS_BACKCATEGORY_EXISTS.getDescription();
        }
        result.processResult(true, result, code, message, count);
        return result;
    }

    public Result<Boolean> addFrontCategory(FrontCategory category) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        /**如果记录存在且不是有效的状态，直接把记录修改为有效状态*/
        List<FrontCategory> frontCategoryList =  frontCategoryDao.getFrontCategory(category.getName());
        if(frontCategoryList!=null && frontCategoryList.size()>0){
            category.setId(frontCategoryList.get(0).getId());
            category.setStatus(1);
            return this.updateFrontCategoryById(category);
        }
        frontCategoryDao.addFrontCategory(category);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), true);
        return result;
    }

    public Result<Boolean> updateFrontCategoryById(FrontCategory category) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = frontCategoryDao.updateFrontCategory(category);
        if (count > 0) {
            flag = true;
        }
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), flag);
        return result;
    }

    public Result<Boolean> deleteFrontCategoryById(String categoryId) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = frontCategoryDao.deleteFrontCategoryById(categoryId);
        if (count > 0) {
            flag = true;
        }
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), flag);
        return result;
    }

    public Result<List<FrontCategory>> getFrontCategory(String name) {
        ResultSupport<List<FrontCategory>> result = new ResultSupport<List<FrontCategory>>();
        List<FrontCategory> frontCategoryList = frontCategoryDao.getFrontCategory(name);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), frontCategoryList);
        return result;
    }

    public Result<Integer> getCountByFrontCategoryName(String name) {
        ResultSupport<Integer> result = new ResultSupport<Integer>();
        int code = ResultCodeEnum.SYS_SUCCESS.getCode();
        String message = ResultCodeEnum.SYS_SUCCESS.getDescription();

        int count = frontCategoryDao.getCountByName(name);
        if (count > 0) {
            code = ResultCodeEnum.SYS_FRONTCATEGORY_EXISTS.getCode();
            message = ResultCodeEnum.SYS_FRONTCATEGORY_EXISTS.getDescription();
        }
        result.processResult(true, result, code, message, count);
        return result;
    }

    public Result<String> addCategoryRelation(CategoryRelation categoryRelation) {
        ResultSupport<String> result = new ResultSupport<String>();
        categoryRelationDao.addCategoryRelation(categoryRelation);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), categoryRelation.getId());
        return result;
    }

    public Result<Boolean> deleteCategoryRelationById(String id) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = categoryRelationDao.deleteCategoryRelationById(id);
        if (count > 0) {
            flag = true;
        }
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), flag);
        return result;
    }

    public Result<List<CategoryRelation>> getCategoryRelation(String name) {
        ResultSupport<List<CategoryRelation>> result = new ResultSupport<List<CategoryRelation>>();
        List<CategoryRelation> categoryRelationList = categoryRelationDao.getCategoryRelation(name);
        result.processResult(true, result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(), categoryRelationList);
        return result;
    }

    public Result<Integer> getCountByCategoryRelation(CategoryRelation categoryRelation) {
        ResultSupport<Integer> result = new ResultSupport<Integer>();
        int code = ResultCodeEnum.SYS_SUCCESS.getCode();
        String message = ResultCodeEnum.SYS_SUCCESS.getDescription();

        int count = categoryRelationDao.getCountByCategoryRelation(categoryRelation);
        if (code > 0) {
            code = ResultCodeEnum.SYS_CATEGORYRELATION_EXISTS.getCode();
            message = ResultCodeEnum.SYS_CATEGORYRELATION_EXISTS.getDescription();
        }
        result.processResult(true, result, code, message, count);
        return result;
    }
}
