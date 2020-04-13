-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: finalrecruitment
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `demand_details`
--

DROP TABLE IF EXISTS `demand_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `demand_details` (
  `form_id_one` int NOT NULL,
  `experience` int DEFAULT NULL,
  `job_overview` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `jr_rrid` int DEFAULT NULL,
  `requestor_department` varchar(255) DEFAULT NULL,
  `requestor_id` varchar(255) DEFAULT NULL,
  `requestor_pu_bu` varchar(255) DEFAULT NULL,
  `skills_required` varchar(255) DEFAULT NULL,
  `fk` int DEFAULT NULL,
  PRIMARY KEY (`form_id_one`),
  KEY `FKtrm0ghwas31g868xfn7rtek8n` (`fk`),
  CONSTRAINT `FKtrm0ghwas31g868xfn7rtek8n` FOREIGN KEY (`fk`) REFERENCES `recruitment_understanding` (`form_id_two`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demand_details`
--

LOCK TABLES `demand_details` WRITE;
/*!40000 ALTER TABLE `demand_details` DISABLE KEYS */;
INSERT INTO `demand_details` VALUES (1,2,'SD','ASD',111,'PU','1066','PU','JAVA',NULL),(2,2,'SD','ASD',111,'PU','1066','PU','JAVA',1);
/*!40000 ALTER TABLE `demand_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recruitment_understanding`
--

DROP TABLE IF EXISTS `recruitment_understanding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recruitment_understanding` (
  `form_id_two` int NOT NULL,
  `criteria` varchar(255) DEFAULT NULL,
  `job_overview` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `requestor_department` varchar(255) DEFAULT NULL,
  `requestor_id` varchar(255) DEFAULT NULL,
  `requestor_pu_bu` varchar(255) DEFAULT NULL,
  `resources_needed` int DEFAULT NULL,
  `skill` varchar(255) DEFAULT NULL,
  `form_id_one` int DEFAULT NULL,
  PRIMARY KEY (`form_id_two`),
  KEY `FK81ed4df8lcte4nx8tiiax2b0k` (`form_id_one`),
  CONSTRAINT `FK81ed4df8lcte4nx8tiiax2b0k` FOREIGN KEY (`form_id_one`) REFERENCES `demand_details` (`form_id_one`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recruitment_understanding`
--

LOCK TABLES `recruitment_understanding` WRITE;
/*!40000 ALTER TABLE `recruitment_understanding` DISABLE KEYS */;
INSERT INTO `recruitment_understanding` VALUES (1,'Btech','SD','ASD','PU','1066','PU',5,'JAVA',1);
/*!40000 ALTER TABLE `recruitment_understanding` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-12 15:26:20
