package com.b2c.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-03-24.
 */
public class User implements Serializable {
    /**用户id*/
    private String userId;
    /**用户登录名*/
    private String userName;
    /**密码*/
    private String password;
    /**用户性别*/
    private String gender;
    /**用户编号*/
    private String userNumber;
    /**用户昵称*/
    private String nickname;
    /**用户出生日期*/
    private Date  birthday;
    /**手机号码*/
    private String phone;
    /**用户email*/
    private String email;
    /**用户类型*/
    private String userType;
    /**最后登录 id*/
    private String loginIP;
    /**省id*/
    private int provinceId;
    /**市id*/
    private int cityId;
    /**区 县id*/
    private int districtId;

    /**记录状态,可用:enable,冻结:freeze,disable:注销*/
    /** enabl*/
    private String status;

    /**最后访问时间*/
    private Date loginDate;
    /**记录更新时间*/
    private Date updateDate;
    /**创建时间*/
    private Date createdTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
