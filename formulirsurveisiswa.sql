-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2020 at 09:44 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `formulirsurveisiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `formulir_survei_siswa`
--

CREATE TABLE `formulir_survei_siswa` (
  `NISN` varchar(16) NOT NULL,
  `nama` varchar(56) DEFAULT NULL,
  `alamat_Siswa` varchar(56) DEFAULT NULL,
  `TTL` varchar(100) DEFAULT NULL,
  `jenis_Kelamin` varchar(20) DEFAULT NULL,
  `nama_Sekolah` varchar(56) DEFAULT NULL,
  `alamat_Sekolah` varchar(56) DEFAULT NULL,
  `pertanyaan_1` varchar(600) DEFAULT NULL,
  `pertanyaan_2` varchar(600) DEFAULT NULL,
  `pertanyaan_3` varchar(600) DEFAULT NULL,
  `pertanyaan_4` varchar(600) DEFAULT NULL,
  `pertanyaan_5` varchar(500) DEFAULT NULL,
  `pertanyaan_6` varchar(500) DEFAULT NULL,
  `pertanyaan_7` varchar(500) DEFAULT NULL,
  `pertanyaan_8` varchar(500) DEFAULT NULL,
  `pertanyaan_9` varchar(500) DEFAULT NULL,
  `pertanyaan_10` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formulir_survei_siswa`
--

INSERT INTO `formulir_survei_siswa` (`NISN`, `nama`, `alamat_Siswa`, `TTL`, `jenis_Kelamin`, `nama_Sekolah`, `alamat_Sekolah`, `pertanyaan_1`, `pertanyaan_2`, `pertanyaan_3`, `pertanyaan_4`, `pertanyaan_5`, `pertanyaan_6`, `pertanyaan_7`, `pertanyaan_8`, `pertanyaan_9`, `pertanyaan_10`) VALUES
('21120117130049', 'Yarnish Dwi Sagita Fidarliyan', 'Tembalang', 'Semarang, 29-05-2020', 'Laki-laki', 'SMA Semarang', 'Semarang', 'Kuliah', 'Mental', 'Ya, sebagai indikator keberhasilan.', 'Belajar', 'Ada', 'Sangat besar', 'Sangat besar', 'Kurang baik', 'Ingin kuliah di Undip, sudah mencoba belajar ujian masuk', 'Ya, sangat besar'),
('21120117140007', 'M. Rizqi Alfani', 'Tembalang', 'Semarang, 29-05-2020', 'Laki-laki', 'SMA Semarang', 'Semarang', 'Kuliah', 'Mental', 'Ya, sebagai indikator keberhasilan.', 'Belajar', 'Ada', 'Sangat besar', 'Sangat besar', 'Kurang baik', 'Ingin kuliah di Undip, sudah mencoba belajar ujian masuk', 'Ya, sangat besar'),
('21120117140009', 'Dita Ananda Elisa Reviana', 'Tembalang', 'Semarang, 29-05-2020', 'Laki-laki', 'SMA Semarang', 'Semarang', 'Kuliah', 'Mental', 'Ya, sebagai indikator keberhasilan.', 'Belajar', 'Ada', 'Sangat besar', 'Sangat besar', 'Kurang baik', 'Ingin kuliah di Undip, sudah mencoba belajar ujian masuk', 'Ya, besar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `formulir_survei_siswa`
--
ALTER TABLE `formulir_survei_siswa`
  ADD PRIMARY KEY (`NISN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
