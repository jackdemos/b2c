package com.b2c.domain.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-04-29.
 * 后台类目
 */
public class BackCategory implements Serializable {

    private String id;
    private String name;
    private String code;
    private String parentId;
    private int level;
    private int status;
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

    public BackCategory() {
    }

    public BackCategory(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public BackCategory(String name, String code, String parentId, int level) {
        this.name = name;
        this.code = code;
        this.parentId = parentId;
        this.level = level;
    }

    public BackCategory(String id, String name, String code, String parentId, int level, int status, Date updateDate, Date createDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.parentId = parentId;
        this.level = level;
        this.status = status;
        this.updateDate = updateDate;
        this.createDate = createDate;
    }
}
