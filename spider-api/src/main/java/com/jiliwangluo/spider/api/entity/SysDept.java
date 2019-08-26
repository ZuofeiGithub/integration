package com.jiliwangluo.spider.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysDept)实体类
 *
 * @author makejava
 * @since 2019-08-26 09:52:55
 */
public class SysDept implements Serializable {
    private static final long serialVersionUID = -40056831324152885L;
    //编号
    private Long id;
    //创建人
    private String createBy;
    //创建时间
    private Date createTime;
    //是否删除 -1:已经删除 0:正常
    private Integer delFlag;
    //更新人
    private String lastUpdateBy;
    //更新时间
    private Date lastUpdateTime;
    //机构名称
    private String name;
    //排序
    private Integer orderNum;
    //上级机构ID,一级机构为0
    private Long parentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

}