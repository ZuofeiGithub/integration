package com.jiliwangluo.spider.api.controller;

import com.jiliwangluo.spider.api.entity.SysUser;
import com.jiliwangluo.spider.api.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2019-08-26 11:25:54
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Long id) {
        return this.sysUserService.queryById(id);
    }

    @GetMapping("findAll")
    public Object findAll(){
        return sysUserService.queryAll();
    }
}