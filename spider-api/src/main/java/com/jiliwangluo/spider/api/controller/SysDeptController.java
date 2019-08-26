package com.jiliwangluo.spider.api.controller;

import com.jiliwangluo.spider.api.entity.SysDept;
import com.jiliwangluo.spider.api.service.SysDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDept)表控制层
 *
 * @author makejava
 * @since 2019-08-26 09:52:55
 */
@RestController
@RequestMapping("sysDept")
public class SysDeptController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptService sysDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDept selectOne(Long id) {
        return this.sysDeptService.queryById(id);
    }

}