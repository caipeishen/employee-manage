/*
 Navicat Premium Data Transfer

 Source Server         : MySQL本机
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : employee_manage

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 14/12/2021 11:12:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL,
  `dname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ddesc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (101, '教学部', '教学部');
INSERT INTO `department` VALUES (102, '市场部', '市场部');
INSERT INTO `department` VALUES (103, '教研部', '教研部');
INSERT INTO `department` VALUES (104, '运营部', '运营部');
INSERT INTO `department` VALUES (105, '后勤部', '后勤部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` int(0) NULL DEFAULT NULL,
  `birthday` datetime(0) NULL DEFAULT NULL,
  `did` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (2, 'BB', '1234567@163.com', 0, '2021-12-14 10:38:03', 102);
INSERT INTO `employee` VALUES (3, 'CC', '4234335@qq.com', 1, '2021-12-14 10:38:03', 103);
INSERT INTO `employee` VALUES (4, 'DD', '4343343@qq.com', 0, '2021-12-14 10:38:03', 104);
INSERT INTO `employee` VALUES (5, 'EE', '6768554@qq.com', 1, '2021-12-14 10:38:03', 105);
INSERT INTO `employee` VALUES (6, '甲', 'peishen.cai@foxmail.com', 1, '1999-12-12 00:00:00', 101);

SET FOREIGN_KEY_CHECKS = 1;
