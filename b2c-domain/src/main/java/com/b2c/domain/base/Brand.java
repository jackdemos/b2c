package com.b2c.domain.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-04-29.
 */
public class Brand implements Serializable {
    private String id;
    private String name;
    private String enName;
    private String description;
    private String logUrl;
    private String founder;
    private Date founderDate;
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

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Date getFounderDate() {
        return founderDate;
    }

    public void setFounderDate(Date founderDate) {
        this.founderDate = founderDate;
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

    public Brand() {}




    public Brand(String name, String enName,String logUrl) {
        this.name = name;
        this.enName = enName;
        this.logUrl = logUrl;
    }

    public Brand(String name, String enName, String description, String logUrl, String founder, Date founderDate, int status) {
        this.name = name;
        this.enName = enName;
        this.description = description;
        this.logUrl = logUrl;
        this.founder = founder;
        this.founderDate = founderDate;
        this.status = status;
    }
}
