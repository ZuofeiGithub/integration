package com.jiliwangluo.spider.api.dao;

import com.jiliwangluo.spider.api.entity.SysDept;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysDept)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-26 09:52:55
 */
public interface SysDeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDept queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysDept 实例对象
     * @return 对象列表
     */
    List<SysDept> queryAll(SysDept sysDept);

    /**
     * 新增数据
     *
     * @param sysDept 实例对象
     * @return 影响行数
     */
    int insert(SysDept sysDept);

    /**
     * 修改数据
     *
     * @param sysDept 实例对象
     * @return 影响行数
     */
    int update(SysDept sysDept);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}