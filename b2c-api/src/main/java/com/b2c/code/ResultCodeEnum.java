package com.b2c.code;

/**
 * Created by Administrator on 2016-04-22.
 */
public enum ResultCodeEnum {

    /**
     * 系统级错误提示
     */
    SYS_ERROR(1000,"系统调用失败"),
    SYS_PARAMS_ERROR(1001,"参数错误"),
    SYS_PARAMS_NOTNULL(1002,"参数不能为空"),

    /**
     * 调用成功相应提示
     */
    SYS_SUCCESS(10000,"系统调用成功"),

    /**
     * 用户信息提示 10001 开始：
     */
    SYS_USER_EXISTS(10001,"用户已被注册"),
    SYS_PHONE_EXISTS(10002,"手机号已被绑定"),
    SYS_PHONE_NOTMATCH(10003,"手机号码格式错误"),
    SYS_EMAIL_NOTMATCH(10004,"邮件地址格式错误"),
    SYS_USER_SUCCESS(10005,"用户注册成功"),
    SYS_NICKNNAME_EXISTS(10006,"用户昵称已存在"),
    SYS_CHANGE_PASSWORD_SUCCESS(10007,"密码修改成功"),
    SYS_USER_REGISTER_SUCCESS(10008,"用户注册成功"),



    /**
     * 商品信息提示 20000开始
     */

     SYS_BACKCATEGORY_EXISTS(20001,"类目已存在"),

    /**
     * 订单信息提示 30000 开始
     */


    /**
     * 店铺信息提示 40000 开始
     *
     */


    /**
     * 活动信息提示 50000 开始
     */
    ;



    private final Integer code;
    private final String description;

    private ResultCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

}
