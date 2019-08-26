package com.jiliwangluo.spider.api.service;

import com.jiliwangluo.spider.api.entity.SysConfig;
import java.util.List;

/**
 * (SysConfig)表服务接口
 *
 * @author makejava
 * @since 2019-08-26 09:44:53
 */
public interface SysConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysConfig queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysConfig 实例对象
     * @return 实例对象
     */
    SysConfig insert(SysConfig sysConfig);

    /**
     * 修改数据
     *
     * @param sysConfig 实例对象
     * @return 实例对象
     */
    SysConfig update(SysConfig sysConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}