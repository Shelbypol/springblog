show databases;

use spring_db;

# use posts_db;
show tables;

# DROP DATABASE IF EXISTS spring_db;
# Drop table posts;
# Drop table posts;
describe posts;
describe comments;
describe users;
describe tags;
describe post_tag;

select * from posts;
select * from comments;
select * from users;

INSERT INTO posts (id, title, post, user_id)
VALUES
(1, 'Snickers', 'This is the post', 9),
(2, 'Chuckers', 'This is the post', 9),
(3, 'Budlight', 'This is the post', 3),
(4, 'Fredinator', 'This is the post', 4),
(5, 'Redblue Green', 'This is the post', 2),
(6, 'Barneys', 'This is the post', 2),
(7, 'Baileys', 'This is the post', 7),
(8, 'LexiePlexie', 'This is the post', 6),
(9, 'Bowsers', 'This is the post', 1);
#
use comments;
INSERT INTO comments (content, post_id)
VALUES
('comment 1', 1),
('comment 2', 1),
('comment 3', 1),
('comment 4', 2),
('comment 5', 2),
('comment 6', 3)


insert into users (id, username, email, password) values (1, 'rpermain0', 'cmouat0@disqus.com', 'Jz2o5SVqbqlL');
insert into users (id, username, email, password) values (2, 'spalister1', 'pburner1@ask.com', 'QaRHbuYbg');
insert into users (id, username, email, password) values (3, 'jyushachkov2', 'kwrettum2@pcworld.com', 'TJKABVBaVayw');
insert into users (id, username, email, password) values (4, 'cfarrin3', 'mhens3@umich.edu', 'HVsRiIONt2');
insert into users (id, username, email, password) values (5, 'pkmietsch4', 'rpaulmann4@cnet.com', 'JrJoMH');
insert into users (id, username, email, password) values (6, 'abexon5', 'lmcmillian5@slate.com', 'P7gL6P');
insert into users (id, username, email, password) values (7, 'apauleit6', 'ibassil6@multiply.com', 'bUuFFrYf');
insert into users (id, username, email, password) values (8, 'dmccurt7', 'rhenbury7@google.it', '4W43zGKTyv4d');
insert into users (id, username, email, password) values (9, 'izarfati8', 'rpirolini8@dyndns.org', 'pLFPHEKjA');
