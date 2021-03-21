-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-03-2021 a las 16:29:31
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd2`
--
CREATE DATABASE IF NOT EXISTS `bd2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bd2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aforopersonas`
--

CREATE TABLE IF NOT EXISTS `aforopersonas` (
  `Dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`Dni`,`nombre`),
  KEY `nombre` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE IF NOT EXISTS `empresa` (
  `nif` int(4) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`nif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE IF NOT EXISTS `evento` (
  `Nombre` varchar(50) NOT NULL,
  `Lugar` varchar(50) NOT NULL,
  `Fecha` date NOT NULL,
  `HoraInicio` time NOT NULL,
  `HoraFin` time NOT NULL,
  `Aforo` int(4) NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`Nombre`, `Lugar`, `Fecha`, `HoraInicio`, `HoraFin`, `Aforo`) VALUES
('fiesta', 'asdf', '2021-04-01', '12:21:00', '12:23:00', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `Dni` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `Telefono` int(9) NOT NULL,
  `nif` int(4) NOT NULL,
  PRIMARY KEY (`Dni`),
  UNIQUE KEY `nif` (`nif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aforopersonas`
--
ALTER TABLE `aforopersonas`
  ADD CONSTRAINT `aforopersonas_ibfk_1` FOREIGN KEY (`Dni`) REFERENCES `persona` (`Dni`),
  ADD CONSTRAINT `aforopersonas_ibfk_2` FOREIGN KEY (`nombre`) REFERENCES `evento` (`Nombre`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`nif`) REFERENCES `empresa` (`nif`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
