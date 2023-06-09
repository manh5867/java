-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chitietdonhangxuat`
--

DROP TABLE IF EXISTS `chitietdonhangxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhangxuat` (
  `EXPORTDETAIL_ID` int NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(45) NOT NULL,
  `QUANTITY_EXP` varchar(45) NOT NULL,
  `PRICE_EXP` varchar(45) NOT NULL,
  `TOTAL_PRICE_EXP` varchar(45) NOT NULL,
  `EXPORT_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EXPORTDETAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhangxuat`
--

LOCK TABLES `chitietdonhangxuat` WRITE;
/*!40000 ALTER TABLE `chitietdonhangxuat` DISABLE KEYS */;
INSERT INTO `chitietdonhangxuat` VALUES (1,'Quạt tích điện','1','200000','200000','HX001'),(2,'Dây điện nhỏ','1','100000','100000','HX002'),(3,'Iphone X','1','7000000','7000000','HX003'),(4,'Marshall Middleton','1','8000000','25000000','HX004'),(5,'Acer nitro 5','1','17000000','25000000','HX004'),(6,'RAM Kingston fury','1','500000','500000','HX005'),(7,'RAM Kingston fury','5','500000','2500000','HX005'),(8,'Marshall Middleton','3','8000000','24000000','HX005');
/*!40000 ALTER TABLE `chitietdonhangxuat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-05 16:06:15
