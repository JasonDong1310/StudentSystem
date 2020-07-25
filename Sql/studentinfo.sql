/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50645
Source Host           : localhost:3306
Source Database       : studentinfo

Target Server Type    : MYSQL
Target Server Version : 50645
File Encoding         : 65001

Date: 2020-07-25 19:46:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `gradestudent`
-- ----------------------------
DROP TABLE IF EXISTS `gradestudent`;
CREATE TABLE `gradestudent` (
  `Sno` varchar(50) NOT NULL DEFAULT '',
  `Sname` varchar(50) DEFAULT NULL,
  `Grade1` int(50) DEFAULT NULL,
  `Grade2` int(50) DEFAULT NULL,
  `Grade3` int(50) DEFAULT NULL,
  `TotalGrade` int(100) DEFAULT NULL,
  `class` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of gradestudent
-- ----------------------------
INSERT INTO `gradestudent` VALUES ('', '', null, null, null, null, '');
INSERT INTO `gradestudent` VALUES ('20180169101', '董乐圣', '65', '65', '65', '195', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169102', '方飞池', '86', '86', '86', '258', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169103', '邵宏达', '90', '90', '90', '270', '金融学2');
INSERT INTO `gradestudent` VALUES ('20180169104', '闫和正', '86', '86', '86', '258', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169105', '沈立成', '65', '65', '65', '195', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169106', '王家福', '86', '86', '86', '258', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169107', '万怡月', '84', '84', '84', '252', '金融学2');
INSERT INTO `gradestudent` VALUES ('20180169108', '杜婉蓉', '84', '84', '84', '252', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169109', '方雪尔', '86', '86', '86', '258', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180169110', '何洁', '86', '86', '86', '258', '金融学1');
INSERT INTO `gradestudent` VALUES ('20180378101', '陈恩泽', '86', '86', '86', '258', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378102', '于碧曼', '86', '86', '86', '258', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378103', '颜美丽', '75', '75', '75', '225', '审计学2');
INSERT INTO `gradestudent` VALUES ('20180378104', '林素欣', '95', '95', '95', '285', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378105', '郭慧美', '68', '68', '68', '204', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378106', '尹闵雨', '70', '70', '70', '210', '审计学2');
INSERT INTO `gradestudent` VALUES ('20180378107', '高梦泽', '86', '86', '86', '258', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378108', '黎石瑶', '86', '86', '86', '258', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378109', '熊文华', '79', '79', '79', '237', '审计学1');
INSERT INTO `gradestudent` VALUES ('20180378110', '白乐语', '87', '87', '87', '261', '审计学3');
INSERT INTO `gradestudent` VALUES ('20180554101', '萧刚捷', '86', '86', '86', '258', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554102', '沈正信', '96', '96', '96', '288', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554103', '陈欣德', '75', '75', '75', '225', '经济学2');
INSERT INTO `gradestudent` VALUES ('20180554104', '王明轩', '86', '86', '86', '258', '经济学4');
INSERT INTO `gradestudent` VALUES ('20180554105', '范永丰', '76', '76', '76', '228', '经济学3');
INSERT INTO `gradestudent` VALUES ('20180554106', '于乐邦', '85', '85', '85', '255', '经济学4');
INSERT INTO `gradestudent` VALUES ('20180554107', '刘熠文', '90', '90', '90', '270', '经济学4');
INSERT INTO `gradestudent` VALUES ('20180554108', '陈紫真', '89', '89', '89', '267', '经济学4');
INSERT INTO `gradestudent` VALUES ('20180554109', '顾燕楠', '86', '86', '86', '258', '经济学3');
INSERT INTO `gradestudent` VALUES ('20180554110', '刘紫萍', '66', '66', '66', '198', '经济学2');
INSERT INTO `gradestudent` VALUES ('20180554111', '冯齐心', '85', '85', '85', '255', '经济学2');
INSERT INTO `gradestudent` VALUES ('20180554112', '杨千怡', '74', '74', '74', '222', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554113', '马欣愉', '75', '75', '75', '225', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554114', '顾冰冰', '74', '74', '74', '222', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554115', '尹世', '84', '84', '84', '252', '经济学3');
INSERT INTO `gradestudent` VALUES ('20180554116', '罗永宁', '77', '77', '77', '231', '经济学1');
INSERT INTO `gradestudent` VALUES ('20180554117', '马毅然', '91', '91', '91', '273', '经济学2');
INSERT INTO `gradestudent` VALUES ('20181864101', '李相赫', '60', '60', '60', '180', '金信1');
INSERT INTO `gradestudent` VALUES ('20181864108', 'lisi', '12', '12', '12', '36', '金信1');
INSERT INTO `gradestudent` VALUES ('20181864155', 'zhangsan', '60', '60', '60', '180', '金信1');
INSERT INTO `gradestudent` VALUES ('20181864199', 'wangwu', '23', '23', '23', '69', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865101', '李大', '96', '96', '96', '288', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865102', '冯小二', '66', '66', '66', '198', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865103', '高小菜', '84', '84', '84', '252', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865104', '刘柳柳', '94', '94', '94', '282', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865105', '萨大幕', '78', '78', '78', '234', '金信1');
INSERT INTO `gradestudent` VALUES ('20181865106', '高千方', '88', '88', '88', '264', '金信1');
INSERT INTO `gradestudent` VALUES ('20181877101', '全志龙', '86', '86', '86', '258', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877102', '李翠花', '84', '84', '84', '252', '金数2');
INSERT INTO `gradestudent` VALUES ('20181877103', '戴敏丽', '84', '84', '84', '252', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877104', '锁韶阳', '65', '65', '65', '195', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877105', '雕春海', '87', '87', '87', '261', '金数2');
INSERT INTO `gradestudent` VALUES ('20181877106', '狄天蓝', '75', '75', '75', '225', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877107', '朱鸿飞', '60', '60', '60', '180', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877108', '问从珊', '85', '85', '85', '255', '金数1');
INSERT INTO `gradestudent` VALUES ('20181877109', '系婉仪', '95', '95', '95', '285', '金数2');
INSERT INTO `gradestudent` VALUES ('20181877110', '公咏志', '77', '77', '77', '231', '金数2');
INSERT INTO `gradestudent` VALUES ('20181877111', '万英达', '64', '64', '64', '192', '金数1');

-- ----------------------------
-- Table structure for `newstudent`
-- ----------------------------
DROP TABLE IF EXISTS `newstudent`;
CREATE TABLE `newstudent` (
  `Sno` varchar(100) NOT NULL DEFAULT '',
  `Sname` varchar(50) DEFAULT NULL,
  `Ssex` varchar(25) DEFAULT NULL,
  `Sdept` varchar(50) DEFAULT NULL,
  `Smajor` varchar(50) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of newstudent
-- ----------------------------
INSERT INTO `newstudent` VALUES ('20180169101', '董乐圣', '男', '金融', '金融学', '555');
INSERT INTO `newstudent` VALUES ('20180169102', '方飞池', '男', '金融', '金融学', '324');
INSERT INTO `newstudent` VALUES ('20180169103', '邵宏达', '男', '金融', '金融学', '422');
INSERT INTO `newstudent` VALUES ('20180169104', '闫和正', '男', '金融', '金融学', '788');
INSERT INTO `newstudent` VALUES ('20180169105', '沈立成', '男', '金融', '金融学', '699');
INSERT INTO `newstudent` VALUES ('20180169106', '王家福', '男', '金融', '金融学', '125');
INSERT INTO `newstudent` VALUES ('20180169107', '万怡月', '女', '金融', '金融学', '911');
INSERT INTO `newstudent` VALUES ('20180169108', '杜婉蓉', '女', '金融', '金融学', '918');
INSERT INTO `newstudent` VALUES ('20180169109', '方雪尔', '女', '金融', '金融学', '354');
INSERT INTO `newstudent` VALUES ('20180169110', '何洁', '女', '金融', '金融学', '252');
INSERT INTO `newstudent` VALUES ('20180378101', '陈恩泽', '男', '会计', '审计', '156');
INSERT INTO `newstudent` VALUES ('20180378102', '于碧曼', '女', '会计', '审计', '564');
INSERT INTO `newstudent` VALUES ('20180378103', '颜美丽', '女', '会计', '审计', '456');
INSERT INTO `newstudent` VALUES ('20180378104', '林素欣', '女', '会计', '审计', '456');
INSERT INTO `newstudent` VALUES ('20180378105', '郭慧美', '女', '会计', '审计', '378');
INSERT INTO `newstudent` VALUES ('20180378106', '尹闵雨', '女', '会计', '审计', '578');
INSERT INTO `newstudent` VALUES ('20180378107', '高梦泽', '女', '会计', '审计', '963');
INSERT INTO `newstudent` VALUES ('20180378108', '黎石瑶', '女', '会计', '审计', '453');
INSERT INTO `newstudent` VALUES ('20180378109', '熊文华', '男', '会计', '审计', '323');
INSERT INTO `newstudent` VALUES ('20180378110', '白乐语', '男', '会计', '审计', '561');
INSERT INTO `newstudent` VALUES ('20180554101', '萧刚捷', '男', '经济', '经济学', '789');
INSERT INTO `newstudent` VALUES ('20180554102', '沈正信', '男', '经济', '经济学', '123');
INSERT INTO `newstudent` VALUES ('20180554103', '陈欣德', '男', '经济', '经济学', '781');
INSERT INTO `newstudent` VALUES ('20180554104', '王明轩', '男', '经济', '经济学', '777');
INSERT INTO `newstudent` VALUES ('20180554105', '范永丰', '男', '经济', '经济学', '792');
INSERT INTO `newstudent` VALUES ('20180554106', '于乐邦', '男', '经济', '经济学', '666');
INSERT INTO `newstudent` VALUES ('20180554107', '马敏学', '男', '经济', '经济学', '799');
INSERT INTO `newstudent` VALUES ('20180554108', '陈紫真', '女', '经济', '经济学', '966');
INSERT INTO `newstudent` VALUES ('20180554109', '顾燕楠', '女', '经济', '经济学', '745');
INSERT INTO `newstudent` VALUES ('20180554110', '刘紫萍', '女', '经济', '经济学', '322');
INSERT INTO `newstudent` VALUES ('20180554111', '冯齐心', '女', '经济', '经济学', '455');
INSERT INTO `newstudent` VALUES ('20180554112', '杨千怡', '女', '经济', '经济学', '144');
INSERT INTO `newstudent` VALUES ('20180554113', '马欣愉', '女', '经济', '经济学', '199');
INSERT INTO `newstudent` VALUES ('20180554114', '顾冰冰', '女', '经济', '经济学', '120');
INSERT INTO `newstudent` VALUES ('20180554115', '尹世', '男', '经济', '经济学', '144');
INSERT INTO `newstudent` VALUES ('20180554116', '罗永宁', '男', '经济', '经济学', '744');
INSERT INTO `newstudent` VALUES ('20180554117', '马毅然', '男', '经济', '经济学', '628');
INSERT INTO `newstudent` VALUES ('20181864109', '张三', '男', '计科', '金信', '123');
INSERT INTO `newstudent` VALUES ('20181864110', '李四', '男', '计科', '金信', '123');
INSERT INTO `newstudent` VALUES ('20181865101', '李大', '男', '计科', '金信', '557');
INSERT INTO `newstudent` VALUES ('20181865102', '冯小二', '男', '计科', '金信', '612');
INSERT INTO `newstudent` VALUES ('20181865103', '高小菜', '男', '计科', '金信', '446');
INSERT INTO `newstudent` VALUES ('20181865104', '刘柳柳', '女', '计科', '金信', '456');
INSERT INTO `newstudent` VALUES ('20181865105', '萨大幕', '男', '计科', '金信', '154');
INSERT INTO `newstudent` VALUES ('20181865106', '高千方', '男', '计科', '金信', '894');
INSERT INTO `newstudent` VALUES ('20181865107', '汪清', '男', '计科', '金信', '896');
INSERT INTO `newstudent` VALUES ('20181865108', '钱为', '男', '计科', '金信', '560');
INSERT INTO `newstudent` VALUES ('20181865109', '聂熙', '女', '计科', '金信', '561');
INSERT INTO `newstudent` VALUES ('20181865110', '牛老大', '男', '计科', '金信', '513');
INSERT INTO `newstudent` VALUES ('20181877101', '全志龙', '男', '计科', '金数', '459');
INSERT INTO `newstudent` VALUES ('20181877102', '李翠花', '女', '计科', '金数', '481');
INSERT INTO `newstudent` VALUES ('20181877103', '戴敏丽', '女', '计科', '金数', '384');
INSERT INTO `newstudent` VALUES ('20181877104', '锁韶阳', '女', '计科', '金数', '971');
INSERT INTO `newstudent` VALUES ('20181877105', '雕春海', '男', '计科', '金数', '754');
INSERT INTO `newstudent` VALUES ('20181877106', '狄天蓝', '男', '计科', '金数', '312');
INSERT INTO `newstudent` VALUES ('20181877107', '朱鸿飞', '男', '计科', '金数', '365');
INSERT INTO `newstudent` VALUES ('20181877108', '问从珊', '女', '计科', '金数', '355');
INSERT INTO `newstudent` VALUES ('20181877109', '系婉仪', '女', '计科', '金数', '911');
INSERT INTO `newstudent` VALUES ('20181877110', '公咏志', '男', '计科', '金数', '373');
INSERT INTO `newstudent` VALUES ('20181877111', '万英达', '男', '计科', '金数', '784');

-- ----------------------------
-- Table structure for `newteacher`
-- ----------------------------
DROP TABLE IF EXISTS `newteacher`;
CREATE TABLE `newteacher` (
  `Sname` varchar(100) NOT NULL,
  `Ssex` varchar(100) DEFAULT NULL,
  `Sdept` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `ID` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Sname`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of newteacher
-- ----------------------------
INSERT INTO `newteacher` VALUES ('wangwu', '男', '计科', '12345', '281934');
