package com.b2c.goods.service.category;

import com.b2c.base.result.Result;
import com.b2c.base.result.ResultSupport;
import com.b2c.category.ICategoryService;
import com.b2c.code.ResultCodeEnum;
import com.b2c.domain.base.BackCategory;
import com.b2c.goods.dao.BackCategoryDao;
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

    public Result<String> addBackCategory(BackCategory category) {
        ResultSupport<String> result = new ResultSupport<String>();
        backCategoryDao.addBackCategory(category);
        result.processResult(true,result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(),category.getId());
        return result;
    }

    public Result<Boolean> updateBackCategoryById(BackCategory category) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = backCategoryDao.updateBackCategoryById(category);
        if(count>0){flag=true;}
        result.processResult(true,result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(),flag);
        return result;
    }

    public Result<Boolean> deleteBackCategoryById(String categoryId) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = false;
        int count = backCategoryDao.deleteBackCategoryById(categoryId);
        if(count>0){flag=true;}
        result.processResult(true,result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(),flag);
        return result;
    }

    public Result<List<BackCategory>> getBackCategory(String name) {
        ResultSupport<List<BackCategory>> result = new ResultSupport<List<BackCategory>>();
        List<BackCategory> backCategoryList = backCategoryDao.getBackCategory(name);
        result.processResult(true,result, ResultCodeEnum.SYS_SUCCESS.getCode(),
                ResultCodeEnum.SYS_SUCCESS.getDescription(),backCategoryList);
        return result;
    }

    public Result<Integer> getCountByName(String name) {
        ResultSupport<Integer> result = new ResultSupport<Integer>();
        int count = backCategoryDao.getCountByName(name);
        result.processResult(true,result, ResultCodeEnum.SYS_BACKCATEGORY_EXISTS.getCode(),
                ResultCodeEnum.SYS_BACKCATEGORY_EXISTS.getDescription(),count);
        return result;
    }
}
