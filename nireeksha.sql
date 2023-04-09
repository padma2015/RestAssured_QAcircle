use padma;
create table persons( personid int,
personname varchar(50),
personno varchar(25),
persondesignation varchar(400));
insert into persons
values('1','sonu','9742815658','mangalore')

 insert into persons values('2','chari','9739991411','mysore');
insert into persons values('3','chethan','9620873357','bangalore');
alter table persons
alter persondesignation personaddress var(100);
update persons set persondesignation='kunigal', 
where personid='
update persons 
set personname='smitha',
personno='63640445045'
where personid=4;
select*from persons



update persons
set persondesignation='tester'
where personid=3;
delete from persons
where personid='4';
select*from persons;




