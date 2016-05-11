package com.b2c.domain.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-05-09.
 * 前后台类目对应关系表
 */
public class CategoryRelation implements Serializable {
    private String id;
    private String frontCategoryId;
    private String frontCategoryName;
    private String backCategoryId;
    private String backCategoryName;
    private int status;
    private Date updateDate;
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrontCategoryId() {
        return frontCategoryId;
    }

    public void setFrontCategoryId(String frontCategoryId) {
        this.frontCategoryId = frontCategoryId;
    }

    public String getBackCategoryId() {
        return backCategoryId;
    }

    public void setBackCategoryId(String backCategoryId) {
        this.backCategoryId = backCategoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFrontCategoryName() {
        return frontCategoryName;
    }

    public void setFrontCategoryName(String frontCategoryName) {
        this.frontCategoryName = frontCategoryName;
    }

    public String getBackCategoryName() {
        return backCategoryName;
    }

    public void setBackCategoryName(String backCategoryName) {
        this.backCategoryName = backCategoryName;
    }
}
