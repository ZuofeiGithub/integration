package com.jiliwangluo.spider.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysLog)实体类
 *
 * @author makejava
 * @since 2019-08-26 11:12:55
 */
public class SysLog implements Serializable {
    private static final long serialVersionUID = -77288128235122456L;
    //编号
    private Long id;
    //创建人
    private String createBy;
    //创建时间
    private Date createTime;
    //IP地址
    private String ip;
    //更新人
    private String lastUpdateBy;
    //更新时间
    private Date lastUpdateTime;
    //请求方法
    private String method;
    //用户操作
    private String operation;
    //请求参数
    private String params;
    //执行时长
    private Long time;
    //用户名
    private String userName;


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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}