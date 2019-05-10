/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.18-log : Database - elemalldb_dit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`elemalldb_dit` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `elemalldb_dit`;

/*Table structure for table `customer_addr` */

DROP TABLE IF EXISTS `customer_addr`;

CREATE TABLE `customer_addr` (
  `customer_addr_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT 'customer_login表的自增ID',
  `zip` smallint(6) NOT NULL COMMENT '邮编',
  `province` smallint(6) NOT NULL COMMENT '地区表中省份的ID',
  `city` smallint(6) NOT NULL COMMENT '地区表中城市的ID',
  `district` smallint(6) NOT NULL COMMENT '地区表中的区ID',
  `address` varchar(200) NOT NULL COMMENT '具体的地址门牌号',
  `is_default` tinyint(4) NOT NULL COMMENT '是否默认',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_addr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户地址表';

/*Data for the table `customer_addr` */

/*Table structure for table `customer_balance_log` */

DROP TABLE IF EXISTS `customer_balance_log`;

CREATE TABLE `customer_balance_log` (
  `balance_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '余额日志ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT '用户ID',
  `source` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '记录来源：1订单，2退货单',
  `source_sn` int(10) unsigned NOT NULL COMMENT '相关单据ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录生成时间',
  `amount` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '变动金额',
  PRIMARY KEY (`balance_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户余额变动表';

/*Data for the table `customer_balance_log` */

/*Table structure for table `customer_inf` */

DROP TABLE IF EXISTS `customer_inf`;

CREATE TABLE `customer_inf` (
  `customer_inf_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT 'customer_login表的自增ID',
  `customer_name` varchar(20) NOT NULL COMMENT '用户真实姓名',
  `identity_card_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '证件类型：1 身份证，2 军官证，3 护照',
  `identity_card_no` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `mobile_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `customer_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `gender` char(1) DEFAULT NULL COMMENT '性别',
  `user_point` int(11) NOT NULL DEFAULT '0' COMMENT '用户积分',
  `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `birthday` datetime DEFAULT NULL COMMENT '会员生日',
  `customer_level` tinyint(4) NOT NULL DEFAULT '1' COMMENT '会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石',
  `user_money` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '用户余额',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_inf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `customer_inf` */

/*Table structure for table `customer_level_inf` */

DROP TABLE IF EXISTS `customer_level_inf`;

CREATE TABLE `customer_level_inf` (
  `customer_level` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '会员级别ID',
  `level_name` varchar(10) NOT NULL COMMENT '会员级别名称',
  `min_point` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '该级别最低积分',
  `max_point` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '该级别最高积分',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_level`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户级别信息表';

/*Data for the table `customer_level_inf` */

/*Table structure for table `customer_login` */

DROP TABLE IF EXISTS `customer_login`;

CREATE TABLE `customer_login` (
  `customer_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `mobile_phone` varchar(20) NOT NULL COMMENT '手机号',
  `login_name` varchar(20) NOT NULL COMMENT '用户登录名',
  `password` char(32) NOT NULL COMMENT 'md5加密的密码',
  `identity_card_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '证件类型：1 身份证，2 军官证，3 护照',
  `identity_card_no` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `user_stats` tinyint(4) NOT NULL DEFAULT '1' COMMENT '用户状态',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户登录表';

/*Data for the table `customer_login` */

insert  into `customer_login`(`customer_id`,`mobile_phone`,`login_name`,`password`,`identity_card_type`,`identity_card_no`,`user_stats`,`modified_time`) values (1,'0','niklaus','hao123',1,'15009189102',1,'2019-05-10 00:16:11'),(2,'0','admin','admin',1,'13333333333',1,'2019-05-10 00:16:23'),(3,'1500918910','demo','hao123',1,NULL,1,'2019-05-10 00:29:49'),(4,'15009189102','demo','hao123',1,NULL,1,'2019-05-10 00:36:34'),(5,'15009189102','demo1','hao123',1,NULL,1,'2019-05-10 00:41:02'),(6,'15009189103','demo2','hao123',1,NULL,1,'2019-05-10 00:43:53');

/*Table structure for table `customer_login_log` */

DROP TABLE IF EXISTS `customer_login_log`;

CREATE TABLE `customer_login_log` (
  `login_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '登陆日志ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT '登陆用户ID',
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '用户登陆时间',
  `login_ip` int(10) unsigned NOT NULL COMMENT '登陆IP',
  `login_type` tinyint(4) NOT NULL COMMENT '登陆类型：0未成功，1成功',
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登陆日志表';

/*Data for the table `customer_login_log` */

/*Table structure for table `customer_point_log` */

DROP TABLE IF EXISTS `customer_point_log`;

CREATE TABLE `customer_point_log` (
  `point_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '积分日志ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT '用户ID',
  `source` tinyint(3) unsigned NOT NULL COMMENT '积分来源：0订单，1登陆，2活动',
  `refer_number` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '积分来源相关编号',
  `change_point` smallint(6) NOT NULL DEFAULT '0' COMMENT '变更积分数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '积分日志生成时间',
  PRIMARY KEY (`point_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户积分日志表';

/*Data for the table `customer_point_log` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID` int(10) NOT NULL,
  `USER` varchar(20) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`ID`,`USER`,`NAME`,`PASSWORD`) values (1,'niklaus','niklaus','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
