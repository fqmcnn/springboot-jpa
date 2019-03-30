/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : companionspace
Target Host     : localhost:3306
Target Database : companionspace
Date: 2019-03-30 17:09:16
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

