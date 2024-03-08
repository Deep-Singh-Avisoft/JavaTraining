create database Assignment_08_03_24;
show databases;
use assignment_08_03_24;

create table World(
	Name varchar(255),
    continent varchar(255),
    area INT(255),
    population INT(255),
    gdp INT(255)
);

insert into World(
	Name,
    continent,
    area,
    population,
    gdp
)
VALUES
	(
		"Afganistan",
        "Asia",
        652230,
        25500100,
        20343000
	),
    (	
		"Albania",
        "Europe",
        28748,
        2831741,
        12960000
    ),
    ("Algeria", "Africa", 2381741, 37100000, 188681000),
    ("Andorra", "Europe", 468, 78115, 3712000),
    ("Angola", "Africa", 1246700, 20609294, 100990000);
select * from World;

select Name, population, area from World where population > 25000000 or area > 3000000;

create table Person(
	PersonId INT primary key,
    FirstName varchar(255),
    LastName varchar(255)
);
create table Address(
	AddressId INT primary key,
    PersonId INT,
    City varchar(255),
    State varchar(255)
);

insert into Person(
	PersonId, 
    FirstName, 
    LastName
)
values
    (123, "Himanshu", "Chaudhary"),
    (124, "Kshitij", "Vats"),
    (125, "Gavin", "Chandel");
    
    select * from Person;
    
insert into Address(
	AddressId,
    PersonId,
    City,
    State
)values
(510, 123, "shimla", "Himachal"),
(511, 126, "kanpur", "up"),
(512, 124, "Una", "Himachal");

select FirstName, LastName, City, State from Person left join Address on Person.PersonId = Address.PersonId;

create table ActorDirector(
	actor_id int,
    director_id int,
    timestamp int primary key
);

insert into ActorDirector(
	actor_id,
    director_id,
    timestamp)
values
	(1,1,0),
    (1,1,1),
    (1,1,2),
    (1,2,3),
    (1,2,4),
    (2,1,5),
    (2,1,6);

select * from ActorDirector;

select actor_id, director_id from ActorDirector group by actor_id, director_id having count(*) >= 3;

create table Score(
	Id int,
    Score float
);

insert into Score(
	Id,
    Score
)
values
(1, 3.50),
(2, 3.65),
(3, 4.00),
(4, 3.85),
(5, 4.00),
(6, 3.65);

select s1.Score, 
(select count(distinct Score) 
from Score s2 WHERE s2.Score >= s1.Score) as 'Rank'
from Score s1
order by s1.Score desc;


    
