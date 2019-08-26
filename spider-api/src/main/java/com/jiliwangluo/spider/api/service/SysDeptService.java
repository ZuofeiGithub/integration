package com.jiliwangluo.spider.api.service;

import com.jiliwangluo.spider.api.entity.SysDept;
import java.util.List;

/**
 * (SysDept)表服务接口
 *
 * @author makejava
 * @since 2019-08-26 09:52:55
 */
public interface SysDeptService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDept queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDept> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDept 实例对象
     * @return 实例对象
     */
    SysDept insert(SysDept sysDept);

    /**
     * 修改数据
     *
     * @param sysDept 实例对象
     * @return 实例对象
     */
    SysDept update(SysDept sysDept);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}