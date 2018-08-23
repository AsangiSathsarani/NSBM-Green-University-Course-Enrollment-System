-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2018 at 06:26 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbmuniversity`
--

-- --------------------------------------------------------

--
-- Table structure for table `coursedetails`
--

CREATE TABLE `coursedetails` (
  `cozId` varchar(5) NOT NULL,
  `subName` varchar(50) NOT NULL,
  `credit` int(2) NOT NULL,
  `description` varchar(100) NOT NULL,
  `depName` varchar(50) NOT NULL,
  `semester` int(2) NOT NULL,
  `lecName` varchar(50) NOT NULL,
  `instructName` varchar(50) NOT NULL,
  `labNo` varchar(10) NOT NULL,
  `labInsructName` varchar(50) NOT NULL,
  `sTime` varchar(10) NOT NULL,
  `fTime` varchar(10) NOT NULL,
  `cozFee` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coursedetails`
--

INSERT INTO `coursedetails` (`cozId`, `subName`, `credit`, `description`, `depName`, `semester`, `lecName`, `instructName`, `labNo`, `labInsructName`, `sTime`, `fTime`, `cozFee`) VALUES
('2101', 'Data Structure and Algo', 3, 'Tree,LinkedList,Queue,Stack\nBinary Tree\n\n\n', 'School of Computing', 1, 'Dr.Noyel', 'Miss.Nimali', 'A', 'Miss.Nayomi', '2.00pm', '5.00pm', 3500),
('2102', 'Statics', 2, 'Mean', 'School of Computing', 1, 'Miss.Niroshi', 'Miss.Amila', 'A', 'Miss.Sepali', '2.00pm', '5.00pm', 2500),
('2103', 'Mathematical Method', 2, 'Interraction', 'School of Computing', 1, 'Dr.Silva', 'Miss.Uditha', 'B', 'Miss.Niluka', '1.00pm', '3.00pm', 3000),
('2104', 'Programming', 3, 'Java Concept', 'School of Computing', 1, 'Dr.Niyomal', 'Miss.Achini', 'A', 'Miss.Pushpa', '1.00pm', '5.00pm', 4000),
('2105', 'Laboratary', 2, 'Kali linax\n', 'School of Computing', 1, 'Dr.Ariyarathne', 'Miss.Dularika', 'A', 'Miss.Nawodya', '2.00pm', '5.00pm', 3000),
('2106', 'Software Engineering', 3, 'Testing\nDesigning', 'School of Computing', 1, 'Dr.Pushpa', 'Miss.Asha', 'C', 'Miss.Kumari', '2.00pm', '4.00pm', 3500),
('2107', 'Foundation of Computer Seince', 2, 'Theory of Automata', 'School of Computing', 1, 'Dr.Shriyan', 'Miss.Sepali', 'A', 'Miss.Diwyangi', '2.00pm', '5.00pm', 3000),
('2108', 'Computer System', 2, 'KarnMap\nFlip flop', 'School of Computing', 1, 'Dr.Nimal', 'Miss.Sadewi', 'A', 'Miss.Nawanjali', '2.00pm', '3.00pm', 2500),
('2109', 'Database', 3, 'SQL Query', 'School of Computing', 1, 'Dr.Jeewani', 'Miss.Nayanathara', 'A', 'Miss.Amila', '2.00pm', '4.00pm', 4000),
('2110', 'Discrete Mathematics', 2, 'Nevigator', 'School of Computing', 1, 'Dr.Lakshman', 'Miss.Awanthi', 'A', 'Miss.Anurada', '2.00pm', '4.00pm', 2500),
('2111', 'Computer Network', 2, 'Ip Address', 'School of Computing', 1, 'Dr.Shirom', 'Miss.Akila', 'B', 'Miss.Sewwandi', '2.00pm', '5.00pm', 3500),
('2112', 'Automata', 2, 'Sequence', 'School of Computing', 1, 'Dr.Kanishka', 'Miss.Madurangi', 'C', 'Miss.Waruna', '2.00pm', '4.00pm', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `departmentdetails`
--

CREATE TABLE `departmentdetails` (
  `depCode` varchar(5) NOT NULL,
  `depName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departmentdetails`
--

INSERT INTO `departmentdetails` (`depCode`, `depName`) VALUES
('B1915', 'School of Bussiness'),
('B1920', 'School of Computing'),
('B1925', 'School of Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `enrolledcourse`
--

CREATE TABLE `enrolledcourse` (
  `regId` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `depName` varchar(50) NOT NULL,
  `yearOfReg` varchar(4) NOT NULL,
  `semOneSubOne` varchar(50) NOT NULL,
  `courseOneFee` int(10) NOT NULL,
  `semOneSubTwo` varchar(50) NOT NULL,
  `courseTwoFee` int(10) NOT NULL,
  `semOneSubThree` varchar(50) NOT NULL,
  `courseThreeFee` int(10) NOT NULL,
  `semOneSubFour` varchar(50) NOT NULL,
  `courseFourFee` int(10) NOT NULL,
  `semTwoSubOne` varchar(50) NOT NULL,
  `courseFiveFee` int(10) NOT NULL,
  `semTwoSubTwo` varchar(50) NOT NULL,
  `courseSixFee` int(10) NOT NULL,
  `semTwoSubThree` varchar(50) NOT NULL,
  `courseSevenFee` int(10) NOT NULL,
  `semTwoSubFour` varchar(50) NOT NULL,
  `courseEghitFee` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enrolledcourse`
--

INSERT INTO `enrolledcourse` (`regId`, `name`, `depName`, `yearOfReg`, `semOneSubOne`, `courseOneFee`, `semOneSubTwo`, `courseTwoFee`, `semOneSubThree`, `courseThreeFee`, `semOneSubFour`, `courseFourFee`, `semTwoSubOne`, `courseFiveFee`, `semTwoSubTwo`, `courseSixFee`, `semTwoSubThree`, `courseSevenFee`, `semTwoSubFour`, `courseEghitFee`) VALUES
(3, 'A.P.Nadeeshan', 'School of Computing', '2016', 'Data Structure and Algo(credit3)', 4000, 'Programming(credit3)', 4000, 'Software Engineering(credit3)', 2500, 'Database(credit3)', 3500, 'Programming(credit3)', 4000, 'Data Structure and Algo(credit3)', 3500, 'Database(credit3)', 3500, 'Software Engineering(credit3)', 2500),
(6, 'K.D.Madushika', 'School of Computing', '2016', 'Data Structure and Algo', 3500, 'Discrete Mathematics', 2500, 'Foundation of Computer Seince', 3000, 'Computer Network', 3500, 'Discrete Mathematics', 2500, 'Statics', 2500, 'Automata', 3000, 'Software Engineering', 3500);

-- --------------------------------------------------------

--
-- Table structure for table `enrolledcourse2`
--

CREATE TABLE `enrolledcourse2` (
  `regId` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `depName` varchar(50) NOT NULL,
  `yearOfReg` varchar(4) NOT NULL,
  `semTwoSubOne` varchar(50) NOT NULL,
  `courseFiveFee` int(10) NOT NULL,
  `semTwoSubTwo` varchar(50) NOT NULL,
  `courseSixFee` int(10) NOT NULL,
  `semTwoSubThree` varchar(50) NOT NULL,
  `courseSevenFee` int(10) NOT NULL,
  `semTwoSubFour` varchar(50) NOT NULL,
  `courseEghitFee` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enrolledcourse2`
--

INSERT INTO `enrolledcourse2` (`regId`, `name`, `depName`, `yearOfReg`, `semTwoSubOne`, `courseFiveFee`, `semTwoSubTwo`, `courseSixFee`, `semTwoSubThree`, `courseSevenFee`, `semTwoSubFour`, `courseEghitFee`) VALUES
(2, 'A.W.Himasangi', 'School of Computing', '2016', 'Programming(credit3)', 4000, 'Data Structure and Algo(credit3)', 4000, 'Database(credit3)', 3500, 'Software Engineering(credit3)', 2500),
(7, 'S.S.Imalsha', 'School of Computing', '2016', 'Programming', 4000, 'Statics', 2500, 'Database', 4000, 'Foundation of Computer Seince', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `examresult`
--

CREATE TABLE `examresult` (
  `regId` int(15) NOT NULL,
  `stuName` varchar(50) NOT NULL,
  `depName` varchar(50) NOT NULL,
  `cozId` varchar(15) NOT NULL,
  `gradeofLec` varchar(5) NOT NULL,
  `gradeofReport` varchar(5) NOT NULL,
  `gradeofExam` varchar(5) NOT NULL,
  `grafeofPracticalAss` varchar(5) NOT NULL,
  `gradeofProject` varchar(5) NOT NULL,
  `gradeofPracticalExam` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `examresult`
--

INSERT INTO `examresult` (`regId`, `stuName`, `depName`, `cozId`, `gradeofLec`, `gradeofReport`, `gradeofExam`, `grafeofPracticalAss`, `gradeofProject`, `gradeofPracticalExam`) VALUES
(1, 'A.A.Sathsarani', 'School of Computing', '2101', 'A', 'B', 'C', 'A', 'B', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `examresultsheet`
--

CREATE TABLE `examresultsheet` (
  `regId` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `subone` varchar(100) NOT NULL,
  `resultone` varchar(10) NOT NULL,
  `subtwo` varchar(100) NOT NULL,
  `resulttwo` varchar(10) NOT NULL,
  `subthree` varchar(100) NOT NULL,
  `resultthree` varchar(10) NOT NULL,
  `semonesubone` varchar(100) NOT NULL,
  `resultfour` varchar(10) NOT NULL,
  `semonesubtwo` varchar(100) NOT NULL,
  `resultfive` varchar(10) NOT NULL,
  `semonesubthree` varchar(100) NOT NULL,
  `resultsix` varchar(10) NOT NULL,
  `semonesubfour` varchar(100) NOT NULL,
  `resultseven` varchar(10) NOT NULL,
  `semtwosubone` varchar(100) NOT NULL,
  `resulteight` varchar(10) NOT NULL,
  `semtwosubtwo` varchar(100) NOT NULL,
  `resultnine` varchar(10) NOT NULL,
  `semtwosubthree` varchar(100) NOT NULL,
  `resultten` varchar(10) NOT NULL,
  `semtwosubfour` varchar(100) NOT NULL,
  `resulteleven` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `examresultsheet`
--

INSERT INTO `examresultsheet` (`regId`, `name`, `subone`, `resultone`, `subtwo`, `resulttwo`, `subthree`, `resultthree`, `semonesubone`, `resultfour`, `semonesubtwo`, `resultfive`, `semonesubthree`, `resultsix`, `semonesubfour`, `resultseven`, `semtwosubone`, `resulteight`, `semtwosubtwo`, `resultnine`, `semtwosubthree`, `resultten`, `semtwosubfour`, `resulteleven`) VALUES
(1, 'A.A.Sathsarani', 'Automata', 'B-', 'Operating System', 'B+', 'Progarmming Concept', 'A-', 'Data Structure and Algo-Cre(3)', 'C+', 'Discrete Mathematics-Cre(2)', 'A-', 'Software Engineering-Cre(2)', 'B+', 'Computer Network-Cre(2)', 'B', 'Programming-Cre(3)', 'B-', 'Statics-Cre(2)', 'B-', 'Automata-Cre(2)', 'B', 'Computer System-Cre(2)', 'A'),
(2, 'A.W.Himasangi', 'Automata', 'A-', 'Operating System', 'B+', 'Progarmming Concept', 'B', '', '', '', '', '', '', '', '', 'Programming(credit3)', 'B', 'Data Structure and Algo(credit3)', 'B-', 'Database(credit3)', 'C+', 'Software Engineering(credit3)', 'B'),
(3, 'A.P.Nadeeshan', 'Automata', 'A-', 'Operating System', 'B', 'Progarmming Concept', 'B-', 'Data Structure and Algo(credit3)', 'C+', 'Programming(credit3)', 'A', 'Software Engineering(credit3)', 'B+', 'Database(credit3)', 'A-', 'Programming(credit3)', 'B-', 'Data Structure and Algo(credit3)', 'B-', 'Database(credit3)', 'B', 'Software Engineering(credit3)', 'C+'),
(4, 'M.A.L.Viranga', 'Automata', 'A', 'Operating System', 'B+', 'Progarmming Concept', 'B', '', '', '', '', '', '', '', '', 'Programming-Cre(3)', 'A+', 'Statics-Cre(2)', 'A-', 'Computer Network-Cre(2)', 'A', 'Software Engineering-Cre(2)', 'B+'),
(8, 'K.N.Shihani', 'Automata', 'A', 'Operating System', 'A-', 'Progarmming Concept', 'B+', 'Statics', 'A-', 'Discrete Mathematics', 'A', 'Foundation of Computer Seince', 'B+', 'Computer Network', 'A', 'Programming', 'B+', 'Statics', 'B+', 'Computer Network', 'A+', 'Software Engineering', 'C+');

-- --------------------------------------------------------

--
-- Table structure for table `instructordetails`
--

CREATE TABLE `instructordetails` (
  `instructId` int(10) NOT NULL,
  `instructName` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telNo` varchar(10) NOT NULL,
  `depName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructordetails`
--

INSERT INTO `instructordetails` (`instructId`, `instructName`, `address`, `email`, `telNo`, `depName`) VALUES
(1, 'Lakshika Perera', 'Kaluwara\nNo/2\nHorana', 'lct@gmail.com', '0717894567', 'School of Computing'),
(2, 'Akila Withrana', 'No 16/A\nUcsc\nColombo 7', 'akilauv@gmail.com', '0712346789', 'School of Business');

-- --------------------------------------------------------

--
-- Table structure for table `lecturedetails`
--

CREATE TABLE `lecturedetails` (
  `lecId` int(10) NOT NULL,
  `lecName` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telNo` varchar(10) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `depName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturedetails`
--

INSERT INTO `lecturedetails` (`lecId`, `lecName`, `address`, `email`, `telNo`, `designation`, `depName`) VALUES
(3, 'Dr.Kasunda de Silva', 'UCSC \nColombo 7\nRead Avenue	', 'kdsvle@gmail.com', '0712345672', 'Doctor', 'Shcool of Computting'),
(4, 'Dr.Malik', 'No 12\nUcsc\nColombo 7\n\n\n', 'malikuv@gmail.com', '0112345342', 'Doctor', 'School of Business'),
(5, 'Mrs.Silva', 'No 7\nUcsc\nColombo 7', 'silvauv@gmail.com', '0112456234', 'Sir', 'School of Computing');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Asangi', 'abcbcs');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduatedetails`
--

CREATE TABLE `postgraduatedetails` (
  `regId` int(5) NOT NULL,
  `instituteName` varchar(100) NOT NULL,
  `degreeName` varchar(100) NOT NULL,
  `year` int(10) NOT NULL,
  `gpa` varchar(10) NOT NULL,
  `colification` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduatedetails`
--

INSERT INTO `postgraduatedetails` (`regId`, `instituteName`, `degreeName`, `year`, `gpa`, `colification`) VALUES
(2, 'SLIT', 'Bsc', 2015, '2.675', 'Acwinade(Bsc)'),
(3, 'SLIT', 'Bsc', 2014, '2.456', 'CS(Degreee)'),
(6, 'NSBM', 'Computer Degree', 2014, '3.12', 'CIMA'),
(7, 'NSBM', 'Computer', 2014, '3.231', 'CIMA');

-- --------------------------------------------------------

--
-- Table structure for table `registerdetailspart1`
--

CREATE TABLE `registerdetailspart1` (
  `regId` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `pAddress` varchar(200) NOT NULL,
  `tAddress` varchar(200) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `DOB` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `telNo` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `age` int(2) NOT NULL,
  `civilStatus` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registerdetailspart1`
--

INSERT INTO `registerdetailspart1` (`regId`, `name`, `fullName`, `pAddress`, `tAddress`, `NIC`, `DOB`, `gender`, `telNo`, `email`, `religion`, `age`, `civilStatus`) VALUES
(1, 'A.A.Sathsarani', 'Asangi Sathsarani', 'Rathnapriya\nKinchigune\nMedamulana', 'No/4\nSunethradewi\nKohuwala', '957891467v', '15/10/1995', 'Female', '0761234567', 'asangisathsarani@gmail.com', 'Buddhist', 22, 'Unmarried'),
(2, 'A.W.Himasangi', 'A.Wenuri Himasangi', 'Rathnapriya\nKinchigune\nMedamulana', 'Sunethradewi\nSunethradewi\nKohuwala\n', '957891489v', '1995.06.04', 'Female', '0716782345', 'wenurihimasangi@gmail.com', 'Buddhist', 22, 'Unmarried'),
(3, 'A.P.Nadeeshan', 'A.Pasindu Nadeeshan', 'Rathnapriya\nKincgigune\nMedamulana', 'No/A\nSunethradewi\nKohuwala', '953457890v', '1995.01.01', 'Male', '0712345678', 'pasindunadeeshan@gmail.com', 'Buddhist', 22, 'Married'),
(4, 'M.A.L.Viranga', 'M.A.Lakshan Viranga', 'Rathnapriya\nKinchigune\nMedamulana', 'No/A/8\nSunethradewi\nKohuwala', '954563456v', '1995.04.23', 'Male', '0712345678', 'lakshanviranga0000@gmail.com', 'Buddhist', 23, 'Unmarried'),
(5, 'A.Samarawickrama', 'Amith Samarawickrama', 'Amila\nDeniyaya\nAkurassa', 'No/7\nKatubadda\nMoratuwa', '941236789v', '12/10/1994', 'Male', '0712345671', 'amith@gmail.com', 'Buddhist', 24, 'Unmarried'),
(6, 'K.D.Madushika', 'Kankanam Dilini Madushika', 'No 78/2\nPanawela\nKatiyaya', 'No 56/4\nKohuwala\n', '945678922v', '12/7/1994', 'Female', '0713451234', 'dilini@gmail.com', 'Buddhist', 24, 'Unmarried'),
(7, 'S.S.Imalsha', 'Senarath Sanduni Imalsha', 'No 56/8\nNuupe\nMatara', 'No 67/A\nKohuwala', '957896534v', '7/8/1995', 'Female', '0712345671', 'sanduni@gmail.com', 'Buddhist', 23, 'Unmarried'),
(8, 'K.N.Shihani', 'Kodikara Nadeesha Shihani', 'No 76/3\nAluthgoda\nTangalle', 'No 76/A\nSunethradewi\nKohuwala', '957896578v', '12/3/1995', 'Female', '0713456781', 'nadeeshashihani@gmail.com', 'Buddhist', 23, 'Unmarried');

-- --------------------------------------------------------

--
-- Table structure for table `registerdetailspart2`
--

CREATE TABLE `registerdetailspart2` (
  `regId` int(10) NOT NULL,
  `alIndexNo` int(10) NOT NULL,
  `year` int(10) NOT NULL,
  `school` varchar(50) NOT NULL,
  `district` varchar(50) NOT NULL,
  `iRank` int(5) NOT NULL,
  `dRank` int(4) NOT NULL,
  `sub1` varchar(50) NOT NULL,
  `grade1` varchar(2) NOT NULL,
  `sub2` varchar(50) NOT NULL,
  `grade2` varchar(2) NOT NULL,
  `sub3` varchar(50) NOT NULL,
  `grade3` varchar(2) NOT NULL,
  `medium` varchar(15) NOT NULL,
  `zcore` varchar(10) NOT NULL,
  `attempt` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registerdetailspart2`
--

INSERT INTO `registerdetailspart2` (`regId`, `alIndexNo`, `year`, `school`, `district`, `iRank`, `dRank`, `sub1`, `grade1`, `sub2`, `grade2`, `sub3`, `grade3`, `medium`, `zcore`, `attempt`) VALUES
(1, 207896789, 2015, 'H/D.A.Rajapaksha', 'Hambantota', 2344, 117, 'Mathematics', 'B', 'Physics', 'C', 'Chemistry', 'A', 'Sinhala', '1.5978', 2),
(4, 209876545, 2015, 'H/Rajapaksha centrel', 'Hambantota', 1123, 41, 'Mathematics', 'A', 'Physics', 'A', 'Chemistry', 'B', 'sinhala', '1.897', 2),
(5, 205012345, 2015, 'Thelijjavila centrel', 'Matara', 2167, 98, 'Mathematics', 'A', 'Physics', 'B', 'Chemistry', 'C', 'Sinhala', '1.675', 3);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduateenrolledcourse`
--

CREATE TABLE `undergraduateenrolledcourse` (
  `regId` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `depName` varchar(100) NOT NULL,
  `yearOfReg` varchar(10) NOT NULL,
  `semOneSubOne` varchar(50) NOT NULL,
  `courseOneFee` int(5) NOT NULL,
  `semOneSubTwo` varchar(50) NOT NULL,
  `courseTwoFee` int(5) NOT NULL,
  `semOneSubThree` varchar(50) NOT NULL,
  `courseThreeFee` int(5) NOT NULL,
  `semOneSubFour` varchar(50) NOT NULL,
  `courseFourFee` int(5) NOT NULL,
  `semTwoSubOne` varchar(50) NOT NULL,
  `courseFiveFee` int(5) NOT NULL,
  `semTwoSubTwo` varchar(50) NOT NULL,
  `courseSixFee` int(5) NOT NULL,
  `semTwoSubThree` varchar(50) NOT NULL,
  `courseSevenFee` int(5) NOT NULL,
  `semTwoSubFour` varchar(50) NOT NULL,
  `courseEghitFee` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduateenrolledcourse`
--

INSERT INTO `undergraduateenrolledcourse` (`regId`, `name`, `depName`, `yearOfReg`, `semOneSubOne`, `courseOneFee`, `semOneSubTwo`, `courseTwoFee`, `semOneSubThree`, `courseThreeFee`, `semOneSubFour`, `courseFourFee`, `semTwoSubOne`, `courseFiveFee`, `semTwoSubTwo`, `courseSixFee`, `semTwoSubThree`, `courseSevenFee`, `semTwoSubFour`, `courseEghitFee`) VALUES
(1, 'A.A.Sathsarani', 'School of Computing', '2016', 'Data Structure and Algo-Cre(3)', 4000, 'Discrete Mathematics-Cre(2)', 2500, 'Software Engineering-Cre(2)', 2500, 'Computer Network-Cre(2)', 3000, 'Programming-Cre(3)', 4000, 'Statics-Cre(2)', 2500, 'Automata-Cre(2)', 2500, 'Computer System-Cre(2)', 2500),
(5, 'A.Samarawikrama', 'School of Business', '2016', 'Data Structure and Algo-Cre(3)', 3500, 'Discrete Mathematics-Cre(2)', 2500, 'Software Engineering-Cre(2)', 2500, 'Computer Network-Cre(2)', 2500, 'Discrete Mathematics-Cre(2)', 2500, 'Statics-Cre(2)', 2500, 'Database-Cre(3)', 4000, 'Software Engineering-Cre(2)', 2500),
(8, 'K.N.Shihani', 'School of Computing', '2016', 'Statics', 2500, 'Discrete Mathematics', 2500, 'Foundation of Computer Seince', 3000, 'Computer Network', 3500, 'Programming', 4000, 'Statics', 2500, 'Computer Network', 3500, 'Software Engineering', 3500),
(9, 'S.Chathurangi', 'School of Computing', '2016', 'Data Structure and Algo', 3500, 'Discrete Mathematics', 2500, 'Software Engineering', 3500, 'Computer Network', 3500, 'Laboratary', 3000, 'Mathematical Method', 3000, 'Computer Network', 3500, 'Foundation of Computer Seince', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduateenrolledcourse2`
--

CREATE TABLE `undergraduateenrolledcourse2` (
  `regId` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `depName` varchar(100) NOT NULL,
  `yearOfReg` varchar(10) NOT NULL,
  `semTwoSubOne` varchar(50) NOT NULL,
  `courseFiveFee` int(5) NOT NULL,
  `semTwoSubTwo` varchar(50) NOT NULL,
  `courseSixFee` int(5) NOT NULL,
  `semTwoSubThree` varchar(50) NOT NULL,
  `courseSevenFee` int(5) NOT NULL,
  `semTwoSubFour` varchar(50) NOT NULL,
  `courseEghitFee` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduateenrolledcourse2`
--

INSERT INTO `undergraduateenrolledcourse2` (`regId`, `name`, `depName`, `yearOfReg`, `semTwoSubOne`, `courseFiveFee`, `semTwoSubTwo`, `courseSixFee`, `semTwoSubThree`, `courseSevenFee`, `semTwoSubFour`, `courseEghitFee`) VALUES
(4, 'M.A.L.Viranga', 'School of Computing', '2016', 'Programming-Cre(3)', 4000, 'Statics-Cre(2)', 3500, 'Computer Network-Cre(2)', 3000, 'Software Engineering-Cre(2)', 2500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coursedetails`
--
ALTER TABLE `coursedetails`
  ADD PRIMARY KEY (`cozId`);

--
-- Indexes for table `departmentdetails`
--
ALTER TABLE `departmentdetails`
  ADD PRIMARY KEY (`depCode`);

--
-- Indexes for table `enrolledcourse`
--
ALTER TABLE `enrolledcourse`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `enrolledcourse2`
--
ALTER TABLE `enrolledcourse2`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `examresult`
--
ALTER TABLE `examresult`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `examresultsheet`
--
ALTER TABLE `examresultsheet`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `instructordetails`
--
ALTER TABLE `instructordetails`
  ADD PRIMARY KEY (`instructId`);

--
-- Indexes for table `lecturedetails`
--
ALTER TABLE `lecturedetails`
  ADD PRIMARY KEY (`lecId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `postgraduatedetails`
--
ALTER TABLE `postgraduatedetails`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `registerdetailspart1`
--
ALTER TABLE `registerdetailspart1`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `registerdetailspart2`
--
ALTER TABLE `registerdetailspart2`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `undergraduateenrolledcourse`
--
ALTER TABLE `undergraduateenrolledcourse`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `undergraduateenrolledcourse2`
--
ALTER TABLE `undergraduateenrolledcourse2`
  ADD PRIMARY KEY (`regId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `enrolledcourse`
--
ALTER TABLE `enrolledcourse`
  MODIFY `regId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `instructordetails`
--
ALTER TABLE `instructordetails`
  MODIFY `instructId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `lecturedetails`
--
ALTER TABLE `lecturedetails`
  MODIFY `lecId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `registerdetailspart1`
--
ALTER TABLE `registerdetailspart1`
  MODIFY `regId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `undergraduateenrolledcourse`
--
ALTER TABLE `undergraduateenrolledcourse`
  MODIFY `regId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `undergraduateenrolledcourse2`
--
ALTER TABLE `undergraduateenrolledcourse2`
  MODIFY `regId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
