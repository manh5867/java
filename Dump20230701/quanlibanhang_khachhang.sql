-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlibanhang
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
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `CUSTOMER_ID` int NOT NULL,
  `CUSTOMER_NAME` varchar(45) DEFAULT NULL,
  `CUSTOMER_ADDRESS` varchar(45) DEFAULT NULL,
  `CUSTOMER_PHONE_NUMBER` varchar(45) DEFAULT NULL,
  `CUSTOMER_EMAIL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'','','',''),(3,'bay3','hanoi','1111111','bay3@gmail.com'),(5,'namngoon','bacninh','019626666','namngoon@gmail.com'),(6,'namngo7','bacninh','01962634','namngo7@gmail.com'),(7,'namngo8','bacninh','01962634','namngo8@gmail.com'),(10,'To Hong Van','ban ninh','1272173979','Van@gmail.com'),(17,'Nguyen van Long','Ha Noi','946789102','Long@gmail.com'),(53,'Ngô Trọng Tấn','HaNoi@gmail.com','0916904819','Tan@gmail.com'),(54,'Ngo Phong','Ha Noi','33242414','Phong@gmail.com'),(57,'Minh','Ha Noi','12831839','Minh@gmail.com'),(58,'Duong van Minh','Ha Noi','123441','Minh@gmail.com'),(59,'Duong van Minh','Ha Noi','123441','Minh@gmail.com'),(60,'Duong Van Minh','bac Ninh','342341441','minh@gmail.com'),(61,'Duong Van Minh','Ha Noi','34513515','Minh@gmail.com'),(70,'Nguyen Khanh Hoang','Ha NOi','3242441','Hoang@gmail.com'),(71,'Nguyen Thi Thuy Linh','Hien Van','7291749794','Linh@gmail.com'),(80,'Le Thuy Linh','Bac Ninh','214141','Linh@gmailcom.'),(123,'duongvanminh','vankham','0196366','dminh9971@gmail.com'),(125,'duongminhtuan','vankham','0196366','dminh9971@gmail.com'),(323,'Ngo Hoang Long','Ha Noi','123721837128','Long@gmail.com'),(1000,'duy','bacninh','123567','duy@gmail.com'),(2131321,'duong van long','vankham','0163676','long@gmail.com'),(126472161,'nguyen Van Long','Bac Noi','73294719479','Long@gmail.com'),(1242141244,'nguyen lan Anh','vankham@gmail.com','091821131','anh@gmail.com');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-01 21:59:58
