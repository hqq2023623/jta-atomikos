create database test;
use test;
drop table if exists `user`;
create table `user`(
id int auto_increment primary key,
username varchar(50) not null default ''
)

create database test2;
use test2;
drop table if exists `user`;
create table `user`(
id int auto_increment primary key,
username varchar(50) not null default ''
)