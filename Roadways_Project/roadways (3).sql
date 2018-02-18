-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2016 at 10:09 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `roadways`
--

-- --------------------------------------------------------

--
-- Table structure for table `admintable`
--

CREATE TABLE IF NOT EXISTS `admintable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admintable`
--

INSERT INTO `admintable` (`username`, `password`) VALUES
('admin', '456'),
('Ekam', '321');

-- --------------------------------------------------------

--
-- Table structure for table `booktable`
--

CREATE TABLE IF NOT EXISTS `booktable` (
  `bookingno` int(100) NOT NULL,
  `busno` varchar(100) NOT NULL,
  `route` varchar(100) NOT NULL,
  `notickets` int(100) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `cphone` varchar(100) NOT NULL,
  `caddress` varchar(150) NOT NULL,
  `bdate` date NOT NULL,
  `cost` int(100) NOT NULL,
  PRIMARY KEY (`bookingno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booktable`
--

INSERT INTO `booktable` (`bookingno`, `busno`, `route`, `notickets`, `cname`, `cphone`, `caddress`, `bdate`, `cost`) VALUES
(1, '1', 'jalandhar,ludhiana,patiala', 4, '', '', '', '0000-00-00', 0),
(2, '4', 'jalandhar,12:40,ludhiana,13:45,sirhind,15:00', 5, '', '', '', '0000-00-00', 0),
(3, '4', 'jalandhar,12:40,ludhiana,13:45,sirhind,15:00', 5, '', '', '', '0000-00-00', 0),
(4, '4', 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45', 6, 'k', '6', 'asr', '0000-00-00', 0),
(5, '3', 'amritsar,jalandhar,ludhiana,sirhind,ambala,kurekshtra,panipat,delhi', 5, 'Ekam', '965465465', 'Asr', '0000-00-00', 0),
(6, '4', 'jalandhar,12:40,ludhiana,13:45,sirhind,15:00', 5, '', '', '', '0000-00-00', 0),
(7, '4', 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45,sirhind,15:00,patiala,15:35', 40, 'adsf', 'adsf', '', '0000-00-00', 0),
(8, '4', 'amritsar,11:00,jalandhar,12:40', 6, 'ekamjit', '654324', 'jal', '2016-07-13', 180),
(9, '4', 'amritsar,11:00,jalandhar,12:40', 2, 'ekam', '123', 'jal', '2016-07-15', 105),
(10, '4', 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45,sirhind,15:00,patiala,15:35', 5, 'Gagan', '65465', 'jal', '2016-07-14', 788),
(11, '4', 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45', 6, 'ekam', '98495', 'asoj', '2016-07-15', 525),
(12, '4', 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45,sirhind,15:00', 3, 'ekam', '65462', '', '2016-07-27', 368),
(13, '4', 'amritsar,11:00,jalandhar,12:40', 4, 'u', '9754566', '', '2016-07-15', 140),
(14, '4', 'amritsar,11:00,jalandhar,12:40', 2, 'ed', '654', '', '2016-07-15', 70);

-- --------------------------------------------------------

--
-- Table structure for table `busdet`
--

CREATE TABLE IF NOT EXISTS `busdet` (
  `busno` int(100) NOT NULL,
  `route` varchar(400) NOT NULL,
  `company` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `driver` varchar(100) NOT NULL,
  `conductor` varchar(100) NOT NULL,
  `seats` int(100) NOT NULL,
  `fare` int(100) NOT NULL,
  PRIMARY KEY (`busno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busdet`
--

INSERT INTO `busdet` (`busno`, `route`, `company`, `type`, `driver`, `conductor`, `seats`, `fare`) VALUES
(3, 'jalandhar,10:05,phagwara,10:30,ludhiana,11:15', 'PunBus', 'non_AC', 'ram', 'Taranjit Singh', 48, 25),
(4, 'amritsar,11:00,jalandhar,12:40,ludhiana,13:45,sirhind,15:00,patiala,15:35', 'Libra', 'AC', 'Raju', 'Select Conductor', 58, 35),
(6, 'chandigarh,10:05,ropar,10:40,nawanshahar,11:15,phagwara,12:05,jalandhar,12:30,amritsar,14:15', 'Kartar Bus Service', 'AC', 'Happy', 'Raman', 48, 40);

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE IF NOT EXISTS `employeetable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `ename` varchar(100) NOT NULL,
  `ephone` varchar(100) NOT NULL,
  `egender` varchar(100) NOT NULL,
  `eaddress` varchar(500) NOT NULL,
  `post` varchar(100) NOT NULL,
  `esalary` int(100) NOT NULL,
  `img` varchar(1000) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`username`, `password`, `ename`, `ephone`, `egender`, `eaddress`, `post`, `esalary`, `img`) VALUES
('emp1', '123', 'Raju', '96548872321', 'Male', 'Jalandhar', 'Driver', 9950, ''),
('emp2', '123', 'Daman', '9856134478', 'Male', 'Jalandhar', 'conductor', 20000, ''),
('emp3', '123', 'Arpit', '6324165312', 'Male', 'ldh', 'Driver', 7999, 'images (1).jpeg'),
('emp4', '123', 'Happy', '696521884', 'Male', 'sirhind', 'Driver', 5454, 'C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\1468172964513_images (5).jpeg'),
('emp5', '123', 'Bhoomika', '965483154', 'Female', 'patiala', 'Receptionist', 9999, 'C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\1468258330367_images (4).jpeg'),
('emp6', '123', 'Raman', '65435454', 'Male', 'Patiala', 'Select Post', 4900, 'C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\1468307159986_1468306978188_1468304643665_1468304482236_download (3).jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `finaldb`
--

CREATE TABLE IF NOT EXISTS `finaldb` (
  `fcity` varchar(100) NOT NULL,
  PRIMARY KEY (`fcity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finaldb`
--

INSERT INTO `finaldb` (`fcity`) VALUES
('Amritsar'),
('Bathinda'),
('Chandigarh'),
('Delhi'),
('Jalandhar'),
('Khanna'),
('Ludhiana'),
('Patiala'),
('Sirhind'),
('Tanda');

-- --------------------------------------------------------

--
-- Table structure for table `routedet`
--

CREATE TABLE IF NOT EXISTS `routedet` (
  `routeno` int(100) NOT NULL,
  `route` varchar(100) NOT NULL,
  PRIMARY KEY (`routeno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `routedet`
--

INSERT INTO `routedet` (`routeno`, `route`) VALUES
(1, 'amritsar,jalandhar,ludhiana,sirhind,patiala'),
(2, 'patiala,sirhind,khanna,ludhiana,phagwara,jalandhar,amritsar'),
(3, 'jalandhar,phagwara,ludhiana'),
(4, 'amritsar,jalandhar,ludhiana,sirhind,ambala,kurekshtra,panipat,delhi'),
(5, 'chandigarh,ropar,nawanshahar,phagwara'),
(6, 'chandigarh,ropar,nawanshahar,phagwara,jalandhar,amritsar'),
(7, 'amritsar,jalandhar,ludhiana,kurekshtra');

-- --------------------------------------------------------

--
-- Table structure for table `startdb`
--

CREATE TABLE IF NOT EXISTS `startdb` (
  `scity` varchar(100) NOT NULL,
  PRIMARY KEY (`scity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `startdb`
--

INSERT INTO `startdb` (`scity`) VALUES
('Amritsar'),
('Chandigarh'),
('Delhi'),
('Jalandhar'),
('Ludhiana'),
('Tanda');

-- --------------------------------------------------------

--
-- Table structure for table `stopsdb`
--

CREATE TABLE IF NOT EXISTS `stopsdb` (
  `stopname` varchar(100) NOT NULL,
  PRIMARY KEY (`stopname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stopsdb`
--

INSERT INTO `stopsdb` (`stopname`) VALUES
('adampur'),
('ambala'),
('amritsar'),
('chandigarh'),
('dasuya'),
('delhi'),
('hoshiarpur'),
('jalandhar'),
('khanna'),
('kurekshtra'),
('ludhiana'),
('mohli'),
('nawanshahar'),
('panipat'),
('pathankot'),
('patiala'),
('phagwara'),
('ropar'),
('sirhind'),
('tanda');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
