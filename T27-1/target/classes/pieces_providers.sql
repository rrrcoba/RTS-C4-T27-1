use heroku_c32affd8800ea8e;

DROP TABLE IF EXISTS `pieces`;
DROP TABLE IF EXISTS `providers`;
DROP TABLE IF EXISTS `supplies`;

CREATE TABLE `pieces` (
  `id` int NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `providers` (
  `id` int NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `supplies` (
  `id` int NOT NULL auto_increment,
  `id_piece` int NOT NULL,
  `id_provider` int NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `supplies_ibfk_1` FOREIGN KEY (`id_provider`) REFERENCES `providers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supplies_ibfk_2` FOREIGN KEY (`id_piece`) REFERENCES `pieces` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

INSERT INTO `pieces` (`name`) VALUES ('One Piece'),('Two Piece'),('Three Piece');
INSERT INTO `providers` (`name`) VALUES ('Eichiro Oda'),('Twochiro Oda'),('Threechiro Oda');
INSERT INTO `supplies` (`id_piece`, `id_provider`, `price`) VALUES ('1','1',2.5),('11','11',2.5),('21','21',2.5);

commit;