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
-- Table structure for table `chitietdonhangnhap`
--

DROP TABLE IF EXISTS `chitietdonhangnhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhangnhap` (
  `IMPORTDETAIL_ID` int NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(45) NOT NULL,
  `QUANTITY_IMP` varchar(45) NOT NULL,
  `COST_IMP` varchar(45) NOT NULL,
  `TOTAL_COST_IMP` varchar(45) DEFAULT NULL,
  `IMPORT_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IMPORTDETAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhangnhap`
--

LOCK TABLES `chitietdonhangnhap` WRITE;
/*!40000 ALTER TABLE `chitietdonhangnhap` DISABLE KEYS */;
INSERT INTO `chitietdonhangnhap` VALUES (1,'Iphone X','10','7000000','70000000','HN001'),(2,'RAM Kingston fury','100','500000','50000000','HN002'),(3,'Quạt tích điện','100','200000','20000000','HN003'),(4,'Acer nỉtro 5','10','17000000','170000000','HN004'),(5,'Dây điện nhỏ','100','100000','10000000','HN005');
/*!40000 ALTER TABLE `chitietdonhangnhap` ENABLE KEYS */;
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
