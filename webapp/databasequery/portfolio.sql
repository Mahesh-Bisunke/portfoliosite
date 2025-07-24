-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4406
-- Generation Time: Jul 24, 2025 at 11:14 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `portfolio`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `message` varchar(5000) NOT NULL,
  `datetime` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`id`, `name`, `email`, `message`, `datetime`) VALUES
(13, 'Mahesh Bisunke', 'maheshbisunke92@gmail.com', 'Hi ! I am a Java Full Stack Developer from Lalitpur Nepal', '2025-07-23 07:42 PM'),
(14, 'Sabita Bisunke', 'sabita88@gamil.com', 'Hello! I am Sabita Bisunke I am looking for Software Engineering role in Nepal', '2025-07-23 07:44 PM'),
(15, 'Priyanka Magar', 'hellopriyanka@gmail.com', 'Hi! I am Priyanka Magar. I am reading class four', '2025-07-23 07:46 PM'),
(16, 'Dipak', 'dipak@gmail.com', 'hello@gmail.com', '2025-07-24 12:17 PM');

-- --------------------------------------------------------

--
-- Table structure for table `education`
--

CREATE TABLE `education` (
  `sn` int(11) NOT NULL,
  `year` varchar(4) NOT NULL,
  `title` varchar(15) NOT NULL,
  `subtitle` varchar(25) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `education`
--

INSERT INTO `education` (`sn`, `year`, `title`, `subtitle`, `description`) VALUES
(1, '2025', 'Bachelor', 'BCA Triton College', 'Tribhuvan University-Triton College I am Currently running');

-- --------------------------------------------------------

--
-- Table structure for table `myproject`
--

CREATE TABLE `myproject` (
  `id` int(11) NOT NULL,
  `filename` varchar(100) NOT NULL,
  `datetime` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `myproject`
--

INSERT INTO `myproject` (`id`, `filename`, `datetime`) VALUES
(4, '2025-07-24T072242.843301900My Portfolio Porject.jpg', '2025-07-24 07:22 AM'),
(5, '2025-07-24T073055.626558100Home.png', '2025-07-24 07:30 AM'),
(6, '2025-07-24T073122.493496700Papaki Chappal.png', '2025-07-24 07:31 AM'),
(7, '2025-07-24T075624.796897500Daraz.jpg', '2025-07-24 07:56 AM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `education`
--
ALTER TABLE `education`
  ADD PRIMARY KEY (`sn`);

--
-- Indexes for table `myproject`
--
ALTER TABLE `myproject`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminlogin`
--
ALTER TABLE `adminlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `education`
--
ALTER TABLE `education`
  MODIFY `sn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `myproject`
--
ALTER TABLE `myproject`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
