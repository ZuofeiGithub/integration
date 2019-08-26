package com.jiliwangluo.spider.api.controller;

import com.jiliwangluo.spider.api.entity.SysConfig;
import com.jiliwangluo.spider.api.service.SysConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysConfig)表控制层
 *
 * @author makejava
 * @since 2019-08-26 09:44:56
 */
@RestController
@RequestMapping("sysConfig")
public class SysConfigController {
    /**
     * 服务对象
     */
    @Resource
    private SysConfigService sysConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysConfig selectOne(Long id) {
        return this.sysConfigService.queryById(id);
    }

}