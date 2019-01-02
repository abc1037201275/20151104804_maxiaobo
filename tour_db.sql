/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : tour_db

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-06-01 22:12:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_gonggao
-- ----------------------------
DROP TABLE IF EXISTS `t_gonggao`;
CREATE TABLE `t_gonggao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biaoti` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `gonggaolock` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_gonggao
-- ----------------------------
INSERT INTO `t_gonggao` VALUES ('1', '喜大普奔', '哈哈哈哈哈', '2017-12-14 22:22:16', '1');
INSERT INTO `t_gonggao` VALUES ('2', '云南天气：降温降雪大雨齐来袭 昆明最高温将跌破10℃', '昨天冷空气进入云南，东部的昭通、曲靖、文山等地一带出现气温跳水，不少地方的最高气温比前一天下降了10-16℃，从20℃以上降至10℃出头，甚至不到10℃。例如宣威前天最高气温22.5℃，昨天却只有6.6℃，下降了16℃左右', '2017-12-16 14:21:57', '0');
INSERT INTO `t_gonggao` VALUES ('3', '云南采取九大举措加快推进旅游强省建设', '过实施九大举措，2018年到2022年，全省休闲度假游客比重力争上升到50%以上，非基本消费占总消费比重上升到60%以上，游客平均消费达到2000元/人次以上；旅游总收入达到1.5万亿元，旅游产业增加值占全省国内生产总值比重达10%以上，为我省发展成为较高集约型旅游强省打下基础。', '2017-12-16 14:22:52', '0');
INSERT INTO `t_gonggao` VALUES ('4', '建军电动车行助力“2017中国兰坪雪邦山之恋音乐节”', ' 建军电动车行以“质量放心,售后服务满意”为经营思想，全力为中国驰名商标五星钻豹、爱玛电动车和步步先电动三轮车用户做好服务。\r\n\r\n     该行负责人表示，音乐节是兰坪的盛事，借助音乐节将是建军电动车行一次难得的、效益凸显的宣传良机！', '2017-12-16 14:23:26', '0');
INSERT INTO `t_gonggao` VALUES ('5', '迎第四次旅游革命 促厦门旅游产业发展转型升级', '魏小安教授认为，随着第四次旅游革命运营格局变化，机遇与困难并存，从第四次旅游革命的角度', '2017-12-16 14:25:21', '0');
INSERT INTO `t_gonggao` VALUES ('6', '厦门全域旅游初见成效 力争实现旅游收入达1380亿元', '海西晨报讯（记者陈翠仙）说起厦门，人们就会联想到美丽的鼓浪屿，但是厦门不仅仅有鼓浪屿，这个美丽的海滨城市处处皆是风景。除了鼓浪屿之外，厦门正在积极打造5A级景区，提高厦门景区质量，厦门全域旅游的创建工作正稳步进行中。日前，厦门市旅发委副主任陈桂林做客厦门市人民政府网，解读了《全域旅游政策》，介绍了厦门全域旅游工作取得的成果。', '2017-12-16 14:26:47', '0');
INSERT INTO `t_gonggao` VALUES ('7', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '日前，晨报推出《厕纸难觅，“方便处”怎方便?》系列报道，关注厦门公共厕所免费厕纸供应难题，引起了市民及相关业者的热烈讨论。各旅游单位作为厦门对外的窗口，对厕所改革十分重视，厦门市旅发委在改扩建旅游厕所的同时，也积极引导旅游单位推广厕所文明工程，有部分旅游景区已经开始探索提供免费厕纸等易耗品的方式方法', '2017-12-16 14:27:48', '0');
INSERT INTO `t_gonggao` VALUES ('8', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '2017-12-16 14:28:44', '1');
INSERT INTO `t_gonggao` VALUES ('9', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '2017-12-16 14:28:50', '1');
INSERT INTO `t_gonggao` VALUES ('10', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '2017-12-16 14:28:55', '1');
INSERT INTO `t_gonggao` VALUES ('11', '探索扫码领取免费厕纸 为游客行方便', '厦门部分景区探索扫码领取免费厕纸 为游客行方便', '2017-12-16 14:29:00', '0');
INSERT INTO `t_gonggao` VALUES ('12', '喜大普奔', '喜大普奔', '2018-01-06 10:32:45', '0');

-- ----------------------------
-- Table structure for t_guide
-- ----------------------------
DROP TABLE IF EXISTS `t_guide`;
CREATE TABLE `t_guide` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biaoti` varchar(255) DEFAULT NULL,
  `content` text,
  `createtime` datetime DEFAULT NULL,
  `guidelock` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_guide
-- ----------------------------
INSERT INTO `t_guide` VALUES ('1', '刘俊杰', '123', '2017-12-23 10:32:11', '0');

-- ----------------------------
-- Table structure for t_hotel
-- ----------------------------
DROP TABLE IF EXISTS `t_hotel`;
CREATE TABLE `t_hotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `content` text,
  `createtime` datetime DEFAULT NULL,
  `hotellock` int(11) NOT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hotel
-- ----------------------------
INSERT INTO `t_hotel` VALUES ('1', '云南', 'fds', '2017-12-14 22:31:35', '1', '20171214223135.jpg', 'ljj', '230', '13228221710');
INSERT INTO `t_hotel` VALUES ('2', '123', '123', '2017-12-14 22:40:39', '1', '20171214224039.jpg', '234', '5', '132');
INSERT INTO `t_hotel` VALUES ('3', '上海', '好', '2018-01-04 21:58:20', '1', '20180104215820.jpg', '上海大酒店', '300', '13228221710');
INSERT INTO `t_hotel` VALUES ('4', '500', '很好', '2018-01-04 21:58:44', '0', '20180104215844.jpg', '浙江大酒店', '500', '13228221710');
INSERT INTO `t_hotel` VALUES ('5', '成都', '美\r\n', '2018-01-04 21:59:05', '0', '20180104215905.jpg', '成都大酒店', '700', '13228221710');
INSERT INTO `t_hotel` VALUES ('6', '云南', '11', '2018-01-04 21:59:32', '0', '20180104215932.jpg', '云南大酒店', '900', '13228221710');

-- ----------------------------
-- Table structure for t_jingdian
-- ----------------------------
DROP TABLE IF EXISTS `t_jingdian`;
CREATE TABLE `t_jingdian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `createtime` datetime DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `jingdianlock` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_jingdian
-- ----------------------------
INSERT INTO `t_jingdian` VALUES ('1', '大理', '2017-12-14 22:28:57', '20171214222857.jpg', '1', '云南');
INSERT INTO `t_jingdian` VALUES ('2', '厦门', '2017-12-14 22:30:58', '20171214223058.jpg', '1', '云南');
INSERT INTO `t_jingdian` VALUES ('3', 'adsf', '2017-12-14 22:36:48', '20171214223648.jpg', '1', 'asd');
INSERT INTO `t_jingdian` VALUES ('4', 'sfd', '2017-12-14 22:38:48', '20171214223848.jpg', '1', 'fsda');
INSERT INTO `t_jingdian` VALUES ('5', '云南，简称云（滇），省会昆明，位于中国西南的边陲，是人类文明重要发祥地之一', '2017-12-15 14:07:50', '20171215140750.jpg', '0', '云南');
INSERT INTO `t_jingdian` VALUES ('6', '山水', '2017-12-16 14:40:11', '20171216144011.jpg', '1', '武夷山');
INSERT INTO `t_jingdian` VALUES ('7', '美美美', '2017-12-16 14:45:30', '20171216144530.jpg', '1', '重庆');
INSERT INTO `t_jingdian` VALUES ('8', '大理白族自治州地处云南省中部偏西，海拔2090米，东邻楚雄州，南靠普洱市、临沧市，西与保山市、怒江州相连，北接丽江市。地跨东经98°52′～101°03′，北纬24°41′～26°42′之间，东巡洱海，西及点苍山脉', '2017-12-16 14:46:10', '20171216144610.jpg', '0', '大理');
INSERT INTO `t_jingdian` VALUES ('9', '么么么', '2018-01-04 20:20:13', '20180104202013.jpg', '1', '重庆');
INSERT INTO `t_jingdian` VALUES ('10', '美美美', '2018-01-04 20:20:35', '20180104202035.jpg', '1', '重庆');
INSERT INTO `t_jingdian` VALUES ('11', '大三', '2018-01-04 20:22:48', '20180104202248.jpg', '1', '上海');
INSERT INTO `t_jingdian` VALUES ('12', '上海，简称“沪”或“申”，是中国共产党的诞生地，中华人民共和国直辖市，国家中心城市，超大城市，国际经济、金融、贸易、航运、科技创新中心，首批沿海开放城市。上海地处长江入海口，是长江经济带的龙头城市', '2018-01-04 21:50:56', '20180104215056.jpg', '0', '上海');
INSERT INTO `t_jingdian` VALUES ('13', '北京，简称“京”，是中华人民共和国的首都、直辖市、国家中心城市、超大城市、国际大都市，全国政治中心、文化中心、国际交往中心、科技创新中心，是中国共产党中央委员会、中华人民共和国中央人民政府、全国人民代表大会、中国人民政治协商会议全国委员会、中华人民共和国中央军事委员会所在地，也是中部战区司令部驻地。', '2018-01-04 21:51:13', '20180104215113.jpg', '0', '北京');
INSERT INTO `t_jingdian` VALUES ('14', '重庆凭借长江“黄金水道”之便，依托丰富的资源和广阔的市场，从汉代起就已成为长江上游的工商业重镇，如今更发展为集重工业、轻工业、贸易等为一体的产业齐备、门类繁多、自成体系的经济、政治和文化中心城市。它也是西南地区科学技术力量最强的城市。 重庆既是大城市，又是“大农村”，农业和农村经济在全市经济中占有举足轻重的地位。广阔的农村地域，多样的地形地貌，适宜动植物栖息生长的自然环境，给予了重庆开发立体农业和发展生态农业的极佳条件。重庆采取以粮食、猪肉生产为主，农、林、牧、副、渔全面发展的方针，已成为中国重要的商品粮基地和著名的肉猪商品基地。 重庆处于中国经济发展较快的东部和资源富集的西部的结合地带，是长江流域和西南地区区域经济的结合部，因此，成为中国西南地区的交通和邮电通讯枢纽。重庆水、陆、空交通四通八达，与全国各地乃至世界许多大、中城市形成了方便，高效的立体交通网络。“蜀道难”早已成为昔日浩叹', '2018-01-04 21:51:34', '20180104215134.jpg', '0', '重庆');
INSERT INTO `t_jingdian` VALUES ('15', '马尔代夫拥有丰富的海洋资源，有各种热带鱼类及海龟、玳瑁和珊瑚、贝壳之类的海产品。\r\n马尔代夫及周围水域拥有700多种鱼类，生产鲣鱼、金枪鱼、龙虾、海参，还有少量的石斑鱼、鲨鱼、海龟和玳瑁等。最多的是珊瑚鱼，它们的颜色、形状、大小各不相同。\r\n', '2018-01-04 21:52:17', '20180104215217.jpg', '0', '马尔代夫');
INSERT INTO `t_jingdian` VALUES ('16', '春熙路', '2018-01-04 21:54:05', '20180104215405.jpg', '1', '春熙路');

-- ----------------------------
-- Table structure for t_liuyan
-- ----------------------------
DROP TABLE IF EXISTS `t_liuyan`;
CREATE TABLE `t_liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `createtime` datetime DEFAULT NULL,
  `liuyanlock` int(11) NOT NULL,
  `recontent` text,
  `recreatetime` datetime DEFAULT NULL,
  `managerid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3B2747191E3A5F50` (`managerid`),
  KEY `FK3B27471948E361B6` (`userid`),
  CONSTRAINT `FK3B2747191E3A5F50` FOREIGN KEY (`managerid`) REFERENCES `t_manager` (`id`),
  CONSTRAINT `FK3B27471948E361B6` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_liuyan
-- ----------------------------
INSERT INTO `t_liuyan` VALUES ('1', '好棒棒的的旅游公司', '2017-12-14 21:55:45', '0', 'ok', '2018-01-06 10:32:04', '1', '1');

-- ----------------------------
-- Table structure for t_manager
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `managerlock` int(11) NOT NULL DEFAULT '0',
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_manager
-- ----------------------------
INSERT INTO `t_manager` VALUES ('1', '0', 'admin', 'admin');

-- ----------------------------
-- Table structure for t_reshotel
-- ----------------------------
DROP TABLE IF EXISTS `t_reshotel`;
CREATE TABLE `t_reshotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createtime` datetime DEFAULT NULL,
  `heji` int(11) NOT NULL,
  `numer` int(11) NOT NULL,
  `reshotellock` int(11) NOT NULL,
  `times` varchar(255) DEFAULT NULL,
  `hotelid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA5CD449F1D19285E` (`hotelid`),
  KEY `FKA5CD449F48E361B6` (`userid`),
  CONSTRAINT `FKA5CD449F1D19285E` FOREIGN KEY (`hotelid`) REFERENCES `t_hotel` (`id`),
  CONSTRAINT `FKA5CD449F48E361B6` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_reshotel
-- ----------------------------
INSERT INTO `t_reshotel` VALUES ('1', '2017-12-14 22:33:19', '460', '2', '0', '2017-12-19', '1', '1');
INSERT INTO `t_reshotel` VALUES ('2', '2018-01-04 21:40:59', '1150', '5', '0', '2018-01-25', '1', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `jiguan` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `truename` varchar(255) DEFAULT NULL,
  `userlock` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `xingbie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '成都', '23', '2017-12-14 21:44:46', '377796191@qq.com', '汉族', '1234567', '13228221710', 'admin', '0', 'ljj', '男');
INSERT INTO `t_user` VALUES ('2', '成都', '23', '2017-12-14 22:05:39', '377796191@qq.com', '汉族', '1234567', '13228221710', '刘俊杰', '1', '刘俊杰', '男');

-- ----------------------------
-- Table structure for t_xianlu
-- ----------------------------
DROP TABLE IF EXISTS `t_xianlu`;
CREATE TABLE `t_xianlu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `createtime` datetime DEFAULT NULL,
  `endaddress` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `staraddress` varchar(255) DEFAULT NULL,
  `xianlulock` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_xianlu
-- ----------------------------
INSERT INTO `t_xianlu` VALUES ('1', '“纳西人家”纯玩系列产品之 浪漫私人会所\r\n\r\n大理（洱海大游船）+丽江(私人会所,千亩花海)+五日纯玩游\r\n\r\n旅游目的地推荐理由：\r\n\r\n特色一：丽江赠送价值280元的丽水金沙\r\n\r\n特色二：大理特别赠送洱海骑行，感受早晨洱海的风光;\r\n\r\n特色三：丽江特别安排特色商务酒店，大理特别安排一晚特色海边客栈；\r\n\r\n特色四：大理大型观光洱海豪华游轮（价值168元）从洱海边到南诏风情岛时长3小时左右尽览苍山洱海; \r\n\r\n特色五：丽江特别安排深度游览世界文化遗产-束河古镇；\r\n\r\n特色六: 我们的导游提供管家式的服务，旅游有问题，一站式全帮你搞定；\r\n\r\n特色七：我们全程不进任何购物店，不推任何购物店，100%保证品质纯玩；\r\n\r\n特色八：丽江安排纳西土鸡火锅，大理安排白族砂锅鱼;', '2018-01-05 11:39:58', '云南', '2000', '成都', '0');
INSERT INTO `t_xianlu` VALUES ('2', '1【故宫博物院 】公元1987年被联合国文教组织列入世界文化遗产保护。\r\n\r\n2【天 坛 公 园】公元1998年被联合国文教组织列入世界文化遗产保护。\r\n\r\n3【八达岭长城 】公元1987年被联合国文教组织列入世界文化遗产保护。\r\n\r\n4【颐 和 园 】公元1998年被联合国文教组织列入世界文化遗产保护。\r\n\r\n5【北 海 公 园】与中南海水域相连、一墙之隔的北京最早的皇家园林。\r\n\r\n6【3D艺术画展】身临其境般感受自己就在画中，并与画进行的交流。\r\n\r\n7【傅琰东魔术城表演】身临其境般体会魔术艺术的变幻莫测。\r\n\r\n8【清华大学】中国著名的大学府．', '2018-01-05 11:38:56', '北京', '5000', '成都', '0');
INSERT INTO `t_xianlu` VALUES ('3', '行程特色：\r\n\r\n1、上海【迪士尼】乐园一日豪华游 ，2016年6月迪士尼乐园开启：六大主题园区（米奇大街、奇想花园、梦幻世界、探险岛、宝藏湾和明日世界！ \r\n\r\n2、特别安排两大水乡：南浔坐船参加水乡婚礼——“浔爱江南，回首浪漫”、中国最后的枕水人家—乌镇；\r\n\r\n3、特别安排鼋头渚,船游太湖；参观百年名校--【浙江大学】；\r\n\r\n4、免费升级1晚4星级（未挂牌）酒店，舒适享受……\r\n\r\n5、纯玩不进店，全程白天无自费，超级性价比；', '2018-01-05 11:38:11', '上海', '6000', '成都', '0');
INSERT INTO `t_xianlu` VALUES ('4', '辅导费盛大发售', '2018-01-06 10:19:28', '达州', '400', '成都', '0');
