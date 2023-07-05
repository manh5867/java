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
-- Table structure for table `hanghoa`
--

DROP TABLE IF EXISTS `hanghoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hanghoa` (
  `PRODUCT_ID` varchar(10) NOT NULL,
  `PRODUCT_NAME` varchar(45) NOT NULL,
  `PRODUCT_DESCRIPTION` varchar(45) DEFAULT NULL,
  `PRODUCT_PRICE` varchar(45) NOT NULL,
  `PRODUCT_TYPE` varchar(45) NOT NULL,
  `PRODUCT_LOCATION` varchar(10) NOT NULL,
  `PRODUCT_QUANTITY` varchar(45) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`),
  KEY `fk_sanpham_vitriluutru1_idx` (`PRODUCT_LOCATION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hanghoa`
--

LOCK TABLES `hanghoa` WRITE;
/*!40000 ALTER TABLE `hanghoa` DISABLE KEYS */;
INSERT INTO `hanghoa` VALUES ('HH001','Acer nỉtro 5','128Gb, 16Gb Ram, đen','17000000','Máy tính xách tay','Kho 1','200'),('HH002','Quạt tích điện','Pin 2000mAh','200000','Thiết bị gia dụng thông minh','Kho 2','1000'),('HH003','Dây điện nhỏ','','100000','Linh kiện điện tử','Kho 5','500'),('HH004','Marshall Middleton','','8000000','Thiết bị âm thanh','Kho 5','97'),('HH005','Iphone X','64GB, trắng','7000000','Điện thoại di động','Kho 2','690'),('HH006','RAM Kingston fury','16GB','500000','Linh kiện điện tử','Kho 4','4995'),('HH007','Samsung Galaxy S5','','10000000','Điện thoại di động','Kho 4','10'),('HH008','Iphone X','','12000000','Điện thoại di động','Kho 5','30');
/*!40000 ALTER TABLE `hanghoa` ENABLE KEYS */;
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
