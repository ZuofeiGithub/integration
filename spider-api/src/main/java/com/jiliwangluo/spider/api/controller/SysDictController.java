package com.jiliwangluo.spider.api.controller;

import com.jiliwangluo.spider.api.entity.SysDict;
import com.jiliwangluo.spider.api.service.SysDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDict)表控制层
 *
 * @author makejava
 * @since 2019-08-26 09:53:39
 */
@RestController
@RequestMapping("sysDict")
public class SysDictController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictService sysDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDict selectOne(Long id) {
        return this.sysDictService.queryById(id);
    }

}