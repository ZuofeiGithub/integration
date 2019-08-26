/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.42 : Database - permissions_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`permissions_system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `permissions_system`;

/*Table structure for table `sys_config` */

DROP TABLE IF EXISTS `sys_config`;

CREATE TABLE `sys_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否已经删除 -1:已经删除 0:正常',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `label` varchar(100) DEFAULT NULL COMMENT '标签值',
  `last_updat_time` datetime DEFAULT NULL COMMENT '更新时间',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序(升序)',
  `type` varchar(100) DEFAULT NULL COMMENT '类型',
  `value` varchar(100) DEFAULT NULL COMMENT '数据值',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_config` */

/*Table structure for table `sys_dept` */

DROP TABLE IF EXISTS `sys_dept`;

CREATE TABLE `sys_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否删除 -1:已经删除 0:正常',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `name` varchar(50) DEFAULT NULL COMMENT '机构名称',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级机构ID,一级机构为0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_dept` */

/*Table structure for table `sys_dict` */

DROP TABLE IF EXISTS `sys_dict`;

CREATE TABLE `sys_dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否已经删除 -1:已经删除 0:正常',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `label` varchar(100) DEFAULT NULL COMMENT '标签值',
  `last_updat_time` datetime DEFAULT NULL COMMENT '更新时间',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序(升序)',
  `type` varchar(100) DEFAULT NULL COMMENT '类型',
  `value` varchar(100) DEFAULT NULL COMMENT '数据值',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_dict` */

/*Table structure for table `sys_log` */

DROP TABLE IF EXISTS `sys_log`;

CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `operation` varchar(50) DEFAULT NULL COMMENT '用户操作',
  `params` varchar(5000) DEFAULT NULL COMMENT '请求参数',
  `time` bigint(20) DEFAULT NULL COMMENT '执行时长',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_log` */

/*Table structure for table `sys_login_log` */

DROP TABLE IF EXISTS `sys_login_log`;

CREATE TABLE `sys_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` varchar(50) DEFAULT NULL COMMENT '登陆状态(online:在线,登陆状态;login:退出登陆; logout:退出登陆)',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_login_log` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否删除 -1:已删除 0:正常',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_dept` */

DROP TABLE IF EXISTS `sys_role_dept`;

CREATE TABLE `sys_role_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '机构ID',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_dept` */

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_menu` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `avatar` varchar(150) DEFAULT NULL COMMENT '头像',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否删除 -1:已删除 0:正常',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '机构ID',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` date DEFAULT NULL COMMENT '更新时间',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `nick_name` varchar(150) DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt` varchar(40) DEFAULT NULL COMMENT '加密盐',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态 0:禁用 1:正常',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_iic0kskryiymn15fg9bqpmw22` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(50) DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
