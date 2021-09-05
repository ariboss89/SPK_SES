# Host: localhost  (Version: 5.5.5-10.4.17-MariaDB)
# Date: 2021-09-06 02:04:19
# Generator: MySQL-Front 5.3  (Build 4.81)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "tb_barang"
#

DROP TABLE IF EXISTS `tb_barang`;
CREATE TABLE `tb_barang` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_barang` varchar(255) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

#
# Data for table "tb_barang"
#

INSERT INTO `tb_barang` VALUES (1,'Semen Tiga Roda','SEMEN');

#
# Structure for table "tb_hasil"
#

DROP TABLE IF EXISTS `tb_hasil`;
CREATE TABLE `tb_hasil` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `id_riwayat` varchar(50) DEFAULT NULL,
  `tanggal` varchar(255) DEFAULT NULL,
  `dari` varchar(50) DEFAULT NULL,
  `sampai` varchar(50) DEFAULT NULL,
  `nama_barang` varchar(255) DEFAULT NULL,
  `nilai_alpha` varchar(255) DEFAULT NULL,
  `mse` varchar(255) DEFAULT NULL,
  `hasil` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4;

#
# Data for table "tb_hasil"
#

INSERT INTO `tb_hasil` VALUES (26,'R001','2021-09-05','2020','2021','Semen Tiga Roda','0.9','31.10%','119.61'),(27,'R002','2021-09-05','2020','2021','Semen Tiga Roda','0.9','31.10%','119.61'),(28,'R003','2021-09-05','2020','2021','Semen Tiga Roda','0.9','31.10%','119.61');

#
# Structure for table "tb_pengadaan"
#

DROP TABLE IF EXISTS `tb_pengadaan`;
CREATE TABLE `tb_pengadaan` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `bulan` varchar(255) DEFAULT NULL,
  `tahun` varchar(255) DEFAULT NULL,
  `jumlah` varchar(255) DEFAULT NULL,
  `barang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4;

#
# Data for table "tb_pengadaan"
#

INSERT INTO `tb_pengadaan` VALUES (17,'JANUARI','2020','50','Semen Tiga Roda'),(18,'FEBRUARI','2020','60','Semen Tiga Roda'),(19,'MARET','2020','65','Semen Tiga Roda'),(20,'APRIL','2020','75','Semen Tiga Roda'),(21,'MEI','2020','80','Semen Tiga Roda'),(22,'JUNI','2020','60','Semen Tiga Roda'),(23,'JULI','2020','120','Semen Tiga Roda'),(24,'AGUSTUS','2020','90','Semen Tiga Roda'),(25,'SEPTEMBER','2020','95','Semen Tiga Roda'),(26,'OKTOBER','2020','86','Semen Tiga Roda'),(27,'NOVEMBER','2020','77','Semen Tiga Roda'),(28,'DESEMBER','2020','120','Semen Tiga Roda');

#
# Structure for table "tb_pengguna"
#

DROP TABLE IF EXISTS `tb_pengguna`;
CREATE TABLE `tb_pengguna` (
  `username` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Data for table "tb_pengguna"
#

INSERT INTO `tb_pengguna` VALUES ('admin','123456','ADMIN'),('desi','123456','SUPERADMIN');

#
# Structure for table "tb_riwayat"
#

DROP TABLE IF EXISTS `tb_riwayat`;
CREATE TABLE `tb_riwayat` (
  `id_riwayat` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_riwayat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Data for table "tb_riwayat"
#

INSERT INTO `tb_riwayat` VALUES ('R001'),('R002'),('R003');
