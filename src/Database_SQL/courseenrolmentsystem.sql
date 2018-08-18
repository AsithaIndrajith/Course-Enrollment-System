-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 18, 2018 at 10:14 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `courseenrolmentsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `id` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`id`, `password`) VALUES
('admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `assignment_grades`
--

CREATE TABLE `assignment_grades` (
  `studentID` int(20) NOT NULL,
  `subjectID` varchar(20) NOT NULL,
  `id` int(20) NOT NULL,
  `assignmentType` varchar(50) NOT NULL,
  `result` varchar(20) NOT NULL,
  `grade` varchar(20) NOT NULL,
  `year` int(10) DEFAULT NULL,
  `semester` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assignment_grades`
--

INSERT INTO `assignment_grades` (`studentID`, `subjectID`, `id`, `assignmentType`, `result`, `grade`, `year`, `semester`) VALUES
(1600000, 'SCS 1000', 4325, 'Project', '45', 'D+', NULL, NULL),
(1600000, 'SCS 1000', 11000110, 'In Class', '51', 'C', NULL, NULL),
(1600000, 'SCS 1000', 11000111, 'In Class', '78', 'A-', NULL, NULL),
(1600000, 'SCS 1000', 11000112, 'In Class', '67', 'B', NULL, NULL),
(1600000, 'SCS 1000', 11000113, 'Practical', '45', 'D+', NULL, NULL),
(1600000, 'SCS 1001', 1004577, 'In Class', '79', 'A-', NULL, NULL),
(1600001, 'SCS 1000', 11000110, 'In Class', '67', 'B', NULL, NULL),
(1600025, 'SCS 1100', 11000000, 'In Class', '87', 'A+', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `courseID` varchar(20) NOT NULL,
  `courseName` varchar(50) NOT NULL,
  `departmentID` int(20) NOT NULL,
  `degreeID` int(10) NOT NULL,
  `type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courseID`, `courseName`, `departmentID`, `degreeID`, `type`) VALUES
('FGS', 'finance maths', 100, 26, 'BSc'),
('PIT', 'Information Technology', 100, 24, 'P'),
('PSE', 'Software Engineering', 100, 22, 'P'),
('SCS', 'Computer Science', 100, 21, 'U'),
('SGS', 'maths science', 100, 20, 'U'),
('SIS', 'Information Systems', 100, 23, 'U');

-- --------------------------------------------------------

--
-- Table structure for table `degree`
--

CREATE TABLE `degree` (
  `degreeID` int(10) NOT NULL,
  `degreeName` varchar(50) NOT NULL,
  `depID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `degree`
--

INSERT INTO `degree` (`degreeID`, `degreeName`, `depID`) VALUES
(20, 'Umaths science', 100),
(21, 'BSc Computer Science', 100),
(22, 'MSc Computer Science', 100),
(23, 'BSc Information System', 100),
(24, 'PInformation Technology', 100),
(26, 'Ufinance maths', 100);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `departmentID` int(20) NOT NULL,
  `departmentName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`departmentID`, `departmentName`) VALUES
(100, 'School Of Computing'),
(101, 'School Of Engineering'),
(102, 'School Of Business');

-- --------------------------------------------------------

--
-- Table structure for table `exam_grades`
--

CREATE TABLE `exam_grades` (
  `subjectID` varchar(10) NOT NULL,
  `studentID` int(10) NOT NULL,
  `result` varchar(10) NOT NULL,
  `grade` varchar(10) NOT NULL,
  `credits` int(10) NOT NULL,
  `semester` varchar(10) NOT NULL,
  `year` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_grades`
--

INSERT INTO `exam_grades` (`subjectID`, `studentID`, `result`, `grade`, `credits`, `semester`, `year`) VALUES
('SCS 1000', 1600000, '87', 'A+', 3, '1', '1'),
('SCS 1000', 1600001, '67', 'B', 3, '1', '1'),
('SCS 1000', 1600007, '55', 'C', 3, '1', '1'),
('SCS 1000', 1600014, '58', 'C+', 3, '1', '1'),
('SCS 1001', 1600000, '67', 'B', 4, '1', '1'),
('SCS 1001', 1600001, '78', 'A-', 4, '1', '1'),
('SCS 1001', 1600014, '8', 'F', 0, '1', '1'),
('SCS 1002', 1600000, '97', 'A+', 3, '1', '1'),
('SCS 1004', 1600000, '45', 'D+', 0, '1', '1'),
('SCS 1005', 1600000, '78', 'A-', 3, '1', '1'),
('SCS 1006', 1600000, '58', 'C+', 3, '1', '1'),
('SCS 1007', 1600000, '60', 'C+', 3, '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `instructorID` int(20) NOT NULL,
  `instructorName` varchar(30) NOT NULL,
  `instructorPhone` varchar(20) NOT NULL,
  `instructorAddress` varchar(100) NOT NULL,
  `instructorNIC` varchar(20) NOT NULL,
  `instructorPassword` varchar(50) NOT NULL,
  `depID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`instructorID`, `instructorName`, `instructorPhone`, `instructorAddress`, `instructorNIC`, `instructorPassword`, `depID`) VALUES
(1010000, 'Ishan Sankalpa Somachandra', '0112141255', '123,Jayamawatha', '7249817496', '1234', 100),
(1010001, 'V.Piyadasa', '0112141257', '123,Jayamawtaha', '952611116V', '1234', 100),
(1010002, 'lflalk', 'LKNELNF', 'lkndflkn3', 'lkefle', 'lkenlfk', 100);

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `lecturerID` int(20) NOT NULL,
  `lecturerName` varchar(30) NOT NULL,
  `lecturerPhone` varchar(12) NOT NULL,
  `lecturerAddress` varchar(100) NOT NULL,
  `lecturerNIC` varchar(12) NOT NULL,
  `lecturerPassword` varchar(20) NOT NULL,
  `depID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lecturerID`, `lecturerName`, `lecturerPhone`, `lecturerAddress`, `lecturerNIC`, `lecturerPassword`, `depID`) VALUES
(2020000, 'G.K.D.A.Dias', '0112141257', '123,Pannipitiya', '78275087', '1234', 100),
(2020001, 'Veerasiri', '0112141257', '123,Pannipitiya', '987611789V', '1234', 100),
(2020010, 'Piyadasa', '12345674', 'wellawatta', '96785672V', '1234', 100),
(2020011, 'niyo', '21481209', 'pannipitiya', '478934798', '1234', 100);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `locationID` int(11) NOT NULL,
  `locationName` varchar(50) NOT NULL,
  `depID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`locationID`, `locationName`, `depID`) VALUES
(250, 'Mini Auditoriums', 100),
(251, 'IRQUE Lab', 100),
(252, 'Lab A', 100),
(253, 'Lab B', 100),
(254, 'Bawana Hall', 100),
(255, 'cantine', 100);

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate`
--

CREATE TABLE `postgraduate` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telephone` varchar(20) NOT NULL,
  `qualifications` varchar(50) DEFAULT NULL,
  `password` varchar(10) NOT NULL,
  `security` varchar(100) NOT NULL,
  `answer` varchar(20) NOT NULL,
  `institute` varchar(50) NOT NULL,
  `departmentID` int(20) NOT NULL,
  `year` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate`
--

INSERT INTO `postgraduate` (`id`, `name`, `dob`, `nic`, `address`, `email`, `telephone`, `qualifications`, `password`, `security`, `answer`, `institute`, `departmentID`, `year`) VALUES
(1700000, 'K.K.D.A.K.Indrajith', '1995-september-18', '952611224V', '697-8,Jayamawatha,Dedigamuwa', NULL, '0112141257', 'BSc Computer Science', '1995', 'What is your mother\'s maiden name?', 'sp', 'NSBM', 100, 1),
(1700065, 'awfeb', '1980-January-1', ';kalng', '', NULL, '', NULL, ';kalng', 'What is you mother\'s maiden name?', '', 'University Of Colombo School Of Computing', 100, 1);

-- --------------------------------------------------------

--
-- Table structure for table `student_subject`
--

CREATE TABLE `student_subject` (
  `studentID` int(20) NOT NULL,
  `subjectID` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_subject`
--

INSERT INTO `student_subject` (`studentID`, `subjectID`) VALUES
(1600009, 'SCS 1100'),
(1600009, 'SCS 1101'),
(1600009, 'SCS 1102'),
(1600009, 'SCS 1103'),
(1600009, 'SCS 1104'),
(1600009, 'SCS 1105'),
(1600009, 'SCS 1107'),
(1600018, 'SCS 1000'),
(1600018, 'SCS 1001'),
(1600018, 'SCS 1002'),
(1600018, 'SCS 1003'),
(1600018, 'SCS 1004'),
(1600018, 'SCS 1005'),
(1600018, 'SCS 1006'),
(1600018, 'SCS 1007'),
(1600019, 'SCS 1000'),
(1600019, 'SCS 1001'),
(1600019, 'SCS 1002'),
(1600019, 'SCS 1003'),
(1600019, 'SCS 1005'),
(1600019, 'SCS 1006'),
(1600019, 'SCS 1007'),
(1600019, 'SCS 1100'),
(1600019, 'SCS 1101'),
(1600019, 'SCS 1102'),
(1600019, 'SCS 1103'),
(1600019, 'SCS 1105'),
(1600019, 'SCS 1106'),
(1600019, 'SCS 1107'),
(1600020, 'SCS 1000'),
(1600020, 'SCS 1001'),
(1600020, 'SCS 1002'),
(1600020, 'SCS 1003'),
(1600020, 'SCS 1005'),
(1600020, 'SCS 1006'),
(1600020, 'SCS 1007'),
(1600021, 'SCS 1000'),
(1600021, 'SCS 1001'),
(1600021, 'SCS 1002'),
(1600021, 'SCS 1003'),
(1600021, 'SCS 1005'),
(1600021, 'SCS 1006'),
(1600021, 'SCS 1007'),
(1600021, 'SCS 1100'),
(1600021, 'SCS 1101'),
(1600021, 'SCS 1102'),
(1600021, 'SCS 1103'),
(1600021, 'SCS 1105'),
(1600021, 'SCS 1106'),
(1600021, 'SCS 1107'),
(1600022, 'SCS 1000'),
(1600022, 'SCS 1001'),
(1600022, 'SCS 1002'),
(1600022, 'SCS 1003'),
(1600022, 'SCS 1004'),
(1600022, 'SCS 1006'),
(1600022, 'SCS 1007'),
(1600022, 'SCS 1100'),
(1600022, 'SCS 1101'),
(1600022, 'SCS 1102'),
(1600022, 'SCS 1103'),
(1600022, 'SCS 1105'),
(1600022, 'SCS 1106'),
(1600022, 'SCS 1107'),
(1600023, 'SCS 1000'),
(1600023, 'SCS 1001'),
(1600023, 'SCS 1002'),
(1600023, 'SCS 1003'),
(1600023, 'SCS 1005'),
(1600023, 'SCS 1006'),
(1600023, 'SCS 1007'),
(1600023, 'SCS 1100'),
(1600023, 'SCS 1101'),
(1600023, 'SCS 1102'),
(1600023, 'SCS 1103'),
(1600023, 'SCS 1105'),
(1600023, 'SCS 1106'),
(1600023, 'SCS 1107'),
(1600024, 'SCS 1100'),
(1600024, 'SCS 1101'),
(1600024, 'SCS 1102'),
(1600024, 'SCS 1103'),
(1600024, 'SCS 1105'),
(1600024, 'SCS 1106'),
(1600024, 'SCS 1107'),
(1600025, 'SCS 1000'),
(1600025, 'SCS 1001'),
(1600025, 'SCS 1002'),
(1600025, 'SCS 1003'),
(1600025, 'SCS 1005'),
(1600025, 'SCS 1006'),
(1600025, 'SCS 1007'),
(1600025, 'SCS 1100'),
(1600025, 'SCS 1101'),
(1600025, 'SCS 1102'),
(1600025, 'SCS 1103'),
(1600025, 'SCS 1104'),
(1600025, 'SCS 1105'),
(1600025, 'SCS 1107'),
(1600026, 'SCS 1000'),
(1600026, 'SCS 1001'),
(1600026, 'SCS 1002'),
(1600026, 'SCS 1003'),
(1600026, 'SCS 1005'),
(1600026, 'SCS 1006'),
(1600026, 'SCS 1007'),
(1600026, 'SCS 1100'),
(1600026, 'SCS 1101'),
(1600026, 'SCS 1102'),
(1600026, 'SCS 1103'),
(1600026, 'SCS 1105'),
(1600026, 'SCS 1106'),
(1600026, 'SCS 1107'),
(1600027, 'SCS 1100'),
(1600027, 'SCS 1101'),
(1600027, 'SCS 1102'),
(1600027, 'SCS 1103'),
(1600027, 'SCS 1105'),
(1600027, 'SCS 1106'),
(1600027, 'SCS 1107'),
(1600031, 'SCS 1100'),
(1600031, 'SCS 1101'),
(1600031, 'SCS 1102'),
(1600031, 'SCS 1103'),
(1600031, 'SCS 1105'),
(1600031, 'SCS 1106'),
(1600031, 'SCS 1107');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `subjectID` varchar(30) NOT NULL,
  `subjectName` varchar(50) NOT NULL,
  `subjectSemester` varchar(10) NOT NULL,
  `subjectYear` varchar(10) NOT NULL,
  `credits` int(5) NOT NULL,
  `price` int(10) NOT NULL,
  `courseID` varchar(20) NOT NULL,
  `lecturerID` int(20) NOT NULL,
  `departmentID` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subjectID`, `subjectName`, `subjectSemester`, `subjectYear`, `credits`, `price`, `courseID`, `lecturerID`, `departmentID`) VALUES
('PSE 1000', 'SE 1', '1', '1', 3, 3000, 'PSE', 2020010, 100),
('PSE 1001', 'OS I', '1', '1', 3, 2750, 'PSE', 2020001, 100),
('PSE 1002', 'RT', '1', '1', 3, 3000, 'PSE', 2020001, 100),
('PSE 1003', 'DF', '1', '1', 2, 3500, 'PSE', 2020000, 100),
('PSE 1004', 'HJ', '1', '1', 3, 4000, 'PSE', 2020010, 100),
('PSE 1005', 'HJK', '1', '1', 3, 3000, 'PSE', 2020001, 100),
('PSE 1006', 'SER', '1', '1', 3, 2500, 'PSE', 2020001, 100),
('PSE 1007', 'NML', '1', '1', 3, 3000, 'PSE', 2020001, 100),
('SCS 1000', 'Data Structures And Algorithm 1', '1', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 1001', 'Databse I', '1', '1', 4, 2700, 'SCS', 2020000, 100),
('SCS 1002', 'Computer System 1', '1', '1', 3, 2500, 'SCS', 2020000, 100),
('SCS 1003', 'Programming 1', '1', '1', 3, 3000, 'SCS', 2020000, 100),
('SCS 1004', 'Enhancement 1', '1', '1', 3, 2500, 'SCS', 2020000, 100),
('SCS 1005', 'Computer Network 1', '1', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 1006', 'Computer Hardware 1', '1', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 1007', 'Arduino 1', '1', '1', 3, 2800, 'SCS', 2020000, 100),
('SCS 1100', 'Data Structures And Algorithms II', '2', '1', 3, 3000, 'SCS', 2020000, 100),
('SCS 1101', 'Databse II', '2', '1', 4, 3000, 'SCS', 2020000, 100),
('SCS 1102', 'Programming II', '2', '1', 3, 3200, 'SCS', 2020000, 100),
('SCS 1103', 'Computer System II', '2', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 1104', 'Computer Network II', '2', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 1105', 'Arduino II', '2', '1', 3, 3000, 'SCS', 2020000, 100),
('SCS 1106', 'Enhancement II', '2', '1', 3, 2500, 'SCS', 2020000, 100),
('SCS 1107', 'Computer Hardware II', '2', '1', 3, 2700, 'SCS', 2020000, 100),
('SCS 2000', 'SDG', '1', '2', 3, 3040, 'SCS', 2020010, 100);

-- --------------------------------------------------------

--
-- Table structure for table `teaching_allocation`
--

CREATE TABLE `teaching_allocation` (
  `subjectID` varchar(10) NOT NULL,
  `lecturerID` int(10) NOT NULL,
  `semester` varchar(20) NOT NULL,
  `year` varchar(10) NOT NULL,
  `locationID` int(20) DEFAULT NULL,
  `instructorID` int(20) NOT NULL,
  `depID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teaching_allocation`
--

INSERT INTO `teaching_allocation` (`subjectID`, `lecturerID`, `semester`, `year`, `locationID`, `instructorID`, `depID`) VALUES
('PSE 1000', 2020001, '1', '1', 252, 1010002, 100),
('SCS 1000', 2020000, '1', '1', 250, 1010000, 100);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate`
--

CREATE TABLE `undergraduate` (
  `id` int(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `telephone` varchar(12) NOT NULL,
  `alResult` varchar(20) NOT NULL,
  `alIndex` varchar(20) NOT NULL,
  `alStream` varchar(40) NOT NULL,
  `password` varchar(100) NOT NULL,
  `security` varchar(40) NOT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `year` varchar(10) DEFAULT NULL,
  `depID` int(10) NOT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate`
--

INSERT INTO `undergraduate` (`id`, `name`, `nic`, `dob`, `address`, `telephone`, `alResult`, `alIndex`, `alStream`, `password`, `security`, `answer`, `year`, `depID`, `email`) VALUES
(1600000, 'asitha Indrajith', '952611224V', '1995-9-17', '697-8,Jayamawatha,Dedigamuwa', '076687230', 'B B B', '4160860', 'Combined Maths', '1995', 'What is your mother\'s maiden name?', 'sp', '1', 100, 'asithakusalk8@gmail.com'),
(1600009, 'hfekh', '375892', '375892', 'hfshfk', '495843097', '', '', '', '', '', NULL, NULL, 100, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `assignment_grades`
--
ALTER TABLE `assignment_grades`
  ADD PRIMARY KEY (`studentID`,`subjectID`,`id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`courseID`),
  ADD KEY `departmentID` (`departmentID`),
  ADD KEY `degreeID` (`degreeID`);

--
-- Indexes for table `degree`
--
ALTER TABLE `degree`
  ADD PRIMARY KEY (`degreeID`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`departmentID`);

--
-- Indexes for table `exam_grades`
--
ALTER TABLE `exam_grades`
  ADD PRIMARY KEY (`subjectID`,`studentID`);

--
-- Indexes for table `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`instructorID`),
  ADD KEY `depID` (`depID`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`lecturerID`),
  ADD KEY `depID` (`depID`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`locationID`),
  ADD KEY `depID` (`depID`);

--
-- Indexes for table `postgraduate`
--
ALTER TABLE `postgraduate`
  ADD PRIMARY KEY (`id`),
  ADD KEY `departmentID` (`departmentID`);

--
-- Indexes for table `student_subject`
--
ALTER TABLE `student_subject`
  ADD PRIMARY KEY (`studentID`,`subjectID`),
  ADD KEY `subjectID` (`subjectID`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`subjectID`),
  ADD KEY `courseID` (`courseID`,`lecturerID`),
  ADD KEY `lecturerID` (`lecturerID`);

--
-- Indexes for table `teaching_allocation`
--
ALTER TABLE `teaching_allocation`
  ADD PRIMARY KEY (`subjectID`),
  ADD KEY `teaching_allocation_ibfk_2` (`instructorID`),
  ADD KEY `teaching_allocation_ibfk_3` (`lecturerID`),
  ADD KEY `teaching_allocation_ibfk_4` (`locationID`),
  ADD KEY `teaching_allocation_ibfk_5` (`depID`);

--
-- Indexes for table `undergraduate`
--
ALTER TABLE `undergraduate`
  ADD PRIMARY KEY (`id`),
  ADD KEY `depID` (`depID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `departmentID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
--
-- AUTO_INCREMENT for table `lecturer`
--
ALTER TABLE `lecturer`
  MODIFY `lecturerID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2020012;
--
-- AUTO_INCREMENT for table `postgraduate`
--
ALTER TABLE `postgraduate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1700066;
--
-- AUTO_INCREMENT for table `undergraduate`
--
ALTER TABLE `undergraduate`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1600010;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `courses_ibfk_1` FOREIGN KEY (`degreeID`) REFERENCES `degree` (`degreeID`),
  ADD CONSTRAINT `courses_ibfk_2` FOREIGN KEY (`departmentID`) REFERENCES `department` (`departmentID`);

--
-- Constraints for table `instructor`
--
ALTER TABLE `instructor`
  ADD CONSTRAINT `instructor_ibfk_1` FOREIGN KEY (`depID`) REFERENCES `department` (`departmentID`);

--
-- Constraints for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD CONSTRAINT `lecturer_ibfk_1` FOREIGN KEY (`depID`) REFERENCES `department` (`departmentID`);

--
-- Constraints for table `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`depID`) REFERENCES `department` (`departmentID`);

--
-- Constraints for table `postgraduate`
--
ALTER TABLE `postgraduate`
  ADD CONSTRAINT `postgraduate_ibfk_1` FOREIGN KEY (`departmentID`) REFERENCES `department` (`departmentID`);

--
-- Constraints for table `student_subject`
--
ALTER TABLE `student_subject`
  ADD CONSTRAINT `student_subject_ibfk_1` FOREIGN KEY (`subjectID`) REFERENCES `subject` (`subjectID`),
  ADD CONSTRAINT `student_subject_ibfk_2` FOREIGN KEY (`studentID`) REFERENCES `undergraduate` (`id`);

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `courses` (`courseID`),
  ADD CONSTRAINT `subject_ibfk_2` FOREIGN KEY (`lecturerID`) REFERENCES `lecturer` (`lecturerID`);

--
-- Constraints for table `teaching_allocation`
--
ALTER TABLE `teaching_allocation`
  ADD CONSTRAINT `teaching_allocation_ibfk_1` FOREIGN KEY (`subjectID`) REFERENCES `subject` (`subjectID`) ON DELETE NO ACTION,
  ADD CONSTRAINT `teaching_allocation_ibfk_2` FOREIGN KEY (`instructorID`) REFERENCES `instructor` (`instructorID`) ON DELETE NO ACTION,
  ADD CONSTRAINT `teaching_allocation_ibfk_3` FOREIGN KEY (`lecturerID`) REFERENCES `lecturer` (`lecturerID`) ON DELETE NO ACTION,
  ADD CONSTRAINT `teaching_allocation_ibfk_4` FOREIGN KEY (`locationID`) REFERENCES `location` (`locationID`) ON DELETE NO ACTION,
  ADD CONSTRAINT `teaching_allocation_ibfk_5` FOREIGN KEY (`depID`) REFERENCES `department` (`departmentID`) ON DELETE NO ACTION;

--
-- Constraints for table `undergraduate`
--
ALTER TABLE `undergraduate`
  ADD CONSTRAINT `undergraduate_ibfk_1` FOREIGN KEY (`depID`) REFERENCES `department` (`departmentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
