package com.b2c.base.param;

import java.io.Serializable;

/**
 * Created by Oakley on 2016-04-21.
 */
public class BaseQuery implements Serializable{
    private static final long serialVersionUID = 5537264124199030276L;

    /** 缺省页大小 */
    public static final int DEFAULT_PAGE_SIZE = 20;

    /** 最大页大小 **/
    public static final int MAX_PAGE_SIZE     = 1000;

    /**
     * 页大小
     */
    protected int           pageSize;
    /**
     * 总数
     */
    private int             totalRecord;
    /**
     * 当前页
     */
    private int             pageIndex;

    /**
     * 总页数
     */
    private int             totalPage;

    /**
     * 排序：参考：Constants.ORDERBY_*
     */
    private String orderBy;

    private String secOrderby; //第二个排序值字段

    /**
     * 默认desc=true,desc=false即asc
     */
    private Boolean desc = true;

    /**
     * 第二个排序字段的排序顺序 默认desc=true,desc=false即asc
     */
    private Boolean secDesc = true;
    /**
     * 兼容之前的 max offset
     */
    private Integer max;
    private Integer offset;

    public int getPageSize() {
        if (pageSize < 1) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    /**
     * 总条目数
     *
     * @param totalRecord
     */
    public void setTotalRecord(int totalRecord) {
        this.totalPage = (totalRecord + getPageSize() - 1) / getPageSize();
        this.totalRecord = totalRecord;
    }

    /**
     * 当前页
     *
     * @return
     */
    public int getPageIndex() {
        if (pageIndex < 1) {
            pageIndex = 1;
        } else if (getTotalPage() > 0 && pageIndex > getTotalPage()) {
            pageIndex = getTotalPage();
        }

        return pageIndex;
    }


    public boolean hasNextPage() {
        if (pageIndex <= getTotalPage()) {
            return true;
        } else {
            return false;
        }
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * mysqlDB开始位置
     *
     * @return
     */
    public int getStartPos() {
        int cPage = getPageIndex();

        if (cPage <= 1) {
            return 0;
        }

        cPage--;

        int pgSize = getPageSize();

        return (pgSize * cPage);
    }

    /**
     * 结束位置
     *
     * @return
     */
    public int getEndPos() {
        if (getPageIndex() * getPageSize() < getTotalRecord()) {
            return getPageIndex() * getPageSize();
        } else {
            return getTotalRecord();
        }
    }

    /**
     * 总页数
     *
     * @return
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 排序：参考：Constants.ORDERBY_*
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 排序：参考：Constants.ORDERBY_*
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 默认desc=true,desc=false即asc
     */
    public Boolean getDesc() {
        return desc;
    }

    /**
     * 默认desc=true,desc=false即asc
     */
    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

    public int getMax() {
        if (null == max) {
            return this.getPageSize();
        }
        return max;
    }

    public int getOffset() {
        if (null == offset) {
            return ( (this.getPageIndex() - 1<=0)? 0 : this.getPageIndex() - 1) * this.getPageSize();
        }
        return offset;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getSecOrderby() {
        return secOrderby;
    }

    public void setSecOrderby(String secOrderby) {
        this.secOrderby = secOrderby;
    }

    public Boolean getSecDesc() {
        return secDesc;
    }

    public void setSecDesc(Boolean secDesc) {
        this.secDesc = secDesc;
    }

}
