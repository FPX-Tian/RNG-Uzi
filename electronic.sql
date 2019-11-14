/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.40 : Database - electronic
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`electronic` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `electronic`;

/*Table structure for table `edoc_category` */

DROP TABLE IF EXISTS `edoc_category`;

CREATE TABLE `edoc_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `edoc_category` */

insert  into `edoc_category`(`id`,`name`) values (1,'Java精通'),(2,'Word使用'),(3,'JAVA经典入门教程'),(4,'全面解析XMX技术'),(5,'学习笔记');

/*Table structure for table `edoc_entry` */

DROP TABLE IF EXISTS `edoc_entry`;

CREATE TABLE `edoc_entry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryId` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `summary` varchar(255) NOT NULL,
  `uploaduser` varchar(50) NOT NULL,
  `createdate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categoryId` (`categoryId`),
  CONSTRAINT `edoc_entry_ibfk_1` FOREIGN KEY (`categoryId`) REFERENCES `edoc_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `edoc_entry` */

insert  into `edoc_entry`(`id`,`categoryId`,`title`,`summary`,`uploaduser`,`createdate`) values (1,1,'Java精通','认真学习JAVA','黄秀明','2019-11-08'),(2,2,'Word使用','Word使用大全','孔芳龙','2019-11-15'),(3,3,'经典JAVA入门教程更新','经典JAVA入门教程更新','彭明','2019-11-07'),(4,4,'XMX技术','解析XML技术','黄秀梅','2019-11-08'),(5,5,'学习笔记','笔记复习','HXM','2019-10-31');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
