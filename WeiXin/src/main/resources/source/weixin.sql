/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : weixin

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-09-26 00:34:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area` (
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) NOT NULL,
  `priority` int(2) NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `UK_AREA` (`area_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
