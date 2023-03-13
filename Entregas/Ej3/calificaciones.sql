-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-03-2023 a las 17:54:10
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `calificaciones`
--
CREATE DATABASE IF NOT EXISTS `calificaciones` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `calificaciones`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE IF NOT EXISTS `alumno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `AD` double NOT NULL,
  `SGE` double NOT NULL,
  `DI` double NOT NULL,
  `PMDM` double NOT NULL,
  `PSP` double NOT NULL,
  `EIE` double NOT NULL,
  `HLC` double NOT NULL,
  `media` double GENERATED ALWAYS AS ((`AD` + `SGE` + `DI` + `PMDM` + `PSP` + `EIE`) / 6) STORED,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id`, `nombre`, `apellidos`, `AD`, `SGE`, `DI`, `PMDM`, `PSP`, `EIE`, `HLC`) VALUES
(1, 'Benita', 'Ramirez', 5.1, 6.8, 10, 8.3, 5.4, 4.2, 3.8),
(2, 'Carlos', 'Jimenez', 4.1, 6.8, 10, 3.3, 6.4, 9.2, 3.4),
(3, 'Antonio', 'Franchesco', 3.25, 3.8, 10, 3.3, 7.4, 1.2, 3.4),
(4, 'Juan', 'Viñuela', 4.5, 5, 7.3, 8, 7.4, 9, 1.5),
(5, 'Benita', 'Macande', 8.1, 4, 9.5, 8, 7.3, 8, 5.2),
(6, 'Silvia', 'Rama', 7.3, 8.3, 7.8, 8, 7.6, 9, 10);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
