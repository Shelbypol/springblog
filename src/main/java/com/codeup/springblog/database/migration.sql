show databases;

use spring_db;


show tables;

DROP DATABASE IF EXISTS spring_db;
# Drop table posts;
Drop table posts;
describe posts;
describe comments;

select * from posts;

USE posts_db;
INSERT INTO posts (id, title, post)
VALUES
(1, 'Snickers', 'This is the post'),
(2, 'Chuckers', 'This is the post'),
(3, 'Budlight', 'This is the post'),
(4, 'Fredinator', 'This is the post'),
(5, 'Redblue Green', 'This is the post'),
(6, 'Barneys', 'This is the post'),
(7, 'Baileys', 'This is the post'),
(8, 'LexiePlexie', 'This is the post'),
(9, 'Bowsers', 'This is the post');
