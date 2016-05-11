package com.b2c.domain.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-05-09.
 * 前台类目
 */
public class FrontCategory implements Serializable {
    private String id;
    private String name;
    private String code;
    private String parentId;
    private int level;
    private int isShow;
    private  int status;
    private Date updateDate;
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
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

    public FrontCategory() {
    }

    public FrontCategory(String name, String code, String parentId, int level) {
        this.name = name;
        this.code = code;
        this.parentId = parentId;
        this.level = level;

    }
}
