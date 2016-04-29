package com.b2c.base.result;

import com.b2c.code.ResultCodeEnum;

public class ResultSupport<T> implements Result<T> {

    private static final long serialVersionUID = 4661096805690919752L;

    /**
     * 系统业务调用是否成功
     */
    private boolean success = false;

    /**
     * 业务编码，根据业务不同，返回的编码不同. 编码从1000开始，1000以内为系统错误预留
     */
    private int resultCode = ResultCodeEnum.SYS_ERROR.getCode();

    /**
     * 相应的信息
     */
    private String message = ResultCodeEnum.SYS_ERROR.getDescription();

    /**
     * 具体返回的数据
     */
    private T model;


    /**
     * 如果是列表,返回总条数
     */
    private int totalRecord;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getModel() {
        return model;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    /**
     * 创建一个result。
     */
    public ResultSupport() {
    }

    /**
     * 创建一个result。
     *
     * @param success 是否成功
     */
    public ResultSupport(boolean success) {
        this.success = success;
    }

    public ResultSupport(boolean success, int resultCode, String message) {
        this.success = success;
        this.resultCode = resultCode;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * @return the resultCode
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode the resultCode to set
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    public void setModel(T model) {
        this.model = model;
    }

    public void processResult(boolean success, Result<T> result, int code, String message, T model) {
        result.setSuccess(success);
        result.setResultCode(code);
        result.setMessage(message);
        result.setModel(model);
    }


}
