package com.b2c.store.controller;

import com.b2c.base.result.Result;
import com.b2c.category.ICategoryService;
import com.b2c.domain.base.BackCategory;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Oakley on 2016-05-10.
 */
@Controller
public class StoreController {

    @Autowired
    ICategoryService categoryService;

    @RequestMapping(value = "/addBackCategory", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String addBackCategory(String name, String code,String parentId,int level) {
        BackCategory backCategory = new BackCategory(name, code,parentId,level);
        Result<String> result = categoryService.addBackCategory(backCategory);
        return "redirect:/getBackCategory";
    }

    @RequestMapping(value = "/add",method=RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView("backCategory");
        return modelAndView;

    }

    @RequestMapping(value = "/getBackCategory",method=RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public ModelAndView getBackCategory(String name){
        ModelAndView modelAndView = new ModelAndView("back_category_list");
        Result<List<BackCategory>> result = categoryService.getBackCategory(name);
        modelAndView.addObject("data",result.getModel());
        return modelAndView;
    }

}

