CREATE SCHEMA `mbti` ;
drop table if exists `mbti`.`user`;
CREATE TABLE `mbti`.`user` (
  `id` VARCHAR(255) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);
drop table if exists `mbti`.`board`;
CREATE TABLE `mbti`.`board` (
  `board_id` INTEGER NOT NULL AUTO_INCREMENT,
  `board_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`board_id`)
);
drop table if exists `mbti`.`writing`;
CREATE TABLE `mbti`.`writing` (
  `writing_id` INTEGER NOT NULL AUTO_INCREMENT,
  `writing_subject` VARCHAR(100) NOT NULL,
  `writing_content` VARCHAR(300) NULL,
  `board_id` INTEGER NOT NULL,
  `writer_id` VARCHAR(45) NOT NULL,
  `hits` Integer NULL DEFAULT 0,
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`writing_id`)
);
drop table if exists `mbti`.`comment`;
CREATE TABLE `mbti`.`comment` (
  `comment_id` INTEGER NOT NULL AUTO_INCREMENT,
  `comment_content` VARCHAR(100) NOT NULL,
  `writing_id` INTEGER NOT NULL,
  `commenter_id` VARCHAR(45) NOT NULL,
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`comment_id`)
);