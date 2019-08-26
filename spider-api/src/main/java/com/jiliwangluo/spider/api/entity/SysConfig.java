package com.jiliwangluo.spider.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysConfig)实体类
 *
 * @author makejava
 * @since 2019-08-26 09:44:45
 */
public class SysConfig implements Serializable {
    private static final long serialVersionUID = 889989618572744196L;
    //编号
    private Long id;
    //创建人
    private String createBy;
    //创建时间
    private Date createTime;
    //是否已经删除 -1:已经删除 0:正常
    private Integer delFlag;
    //描述
    private String description;
    //标签值
    private String label;
    //更新时间
    private Date lastUpdatTime;
    //更新时间
    private String lastUpdateBy;
    //备注
    private String remarks;
    //排序(升序)
    private Double sort;
    //类型
    private String type;
    //数据值
    private String value;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getLastUpdatTime() {
        return lastUpdatTime;
    }

    public void setLastUpdatTime(Date lastUpdatTime) {
        this.lastUpdatTime = lastUpdatTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}