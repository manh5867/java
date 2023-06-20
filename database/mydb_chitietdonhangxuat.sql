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
  `EXPORTDETAIL_ID` int NOT NULL,
  `PRODUCT_ID` varchar(45) DEFAULT NULL,
  `QUANTITY_EXP` varchar(45) DEFAULT NULL,
  `PRICE_EXP` varchar(45) DEFAULT NULL,
  `donHangXuat_EXPORT_ID` int NOT NULL,
  PRIMARY KEY (`EXPORTDETAIL_ID`,`donHangXuat_EXPORT_ID`),
  KEY `fk_chiTietDonHangXuat_donHangXuat1_idx` (`donHangXuat_EXPORT_ID`),
  CONSTRAINT `fk_chiTietDonHangXuat_donHangXuat1` FOREIGN KEY (`donHangXuat_EXPORT_ID`) REFERENCES `donhangxuat` (`EXPORT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhangxuat`
--

LOCK TABLES `chitietdonhangxuat` WRITE;
/*!40000 ALTER TABLE `chitietdonhangxuat` DISABLE KEYS */;
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

-- Dump completed on 2023-06-20 20:47:47
