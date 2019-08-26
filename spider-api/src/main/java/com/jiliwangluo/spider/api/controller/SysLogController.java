package com.jiliwangluo.spider.api.controller;

import com.jiliwangluo.spider.api.entity.SysLog;
import com.jiliwangluo.spider.api.service.SysLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysLog)表控制层
 *
 * @author makejava
 * @since 2019-08-26 11:12:55
 */
@RestController
@RequestMapping("sysLog")
public class SysLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogService sysLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLog selectOne(Long id) {
        return this.sysLogService.queryById(id);
    }

}