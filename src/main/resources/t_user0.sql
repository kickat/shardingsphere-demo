SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user0`
-- ----------------------------
DROP TABLE IF EXISTS `t_user0`;
CREATE TABLE `t_user0` (
  `user_id` bigint(64) NOT NULL COMMENT '主键',
  `id_number` varchar(18) NOT NULL COMMENT '身份证号码',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `gender` int(2) DEFAULT '1' COMMENT '性别：1-男；2-女',
  `birth_date` date DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';
