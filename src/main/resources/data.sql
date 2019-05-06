Insert into person (id, name) values ('A','Stefanny Rodriguez');
Insert into person (id, name) values ('B', 'Andrew White');
Insert into person (id, name) values ('C', 'Cassie Lang');
Insert into person (id, name) values ('D', 'Robert Downey Jr');

Insert into relationship (id, person1_id, person2_id, acquaintance) values (1001,'A','A', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (1002,'A','B', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (1003,'A','C', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (1004,'A','D', 1);

Insert into relationship (id, person1_id, person2_id, acquaintance) values (2001,'B','A', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (2002,'B','B', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (2003,'B','C', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (2004,'B','D', 1);

Insert into relationship (id, person1_id, person2_id, acquaintance) values (3001,'C','A', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (3002,'C','B', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (3003,'C','C', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (3004,'C','D', 1);

Insert into relationship (id, person1_id, person2_id, acquaintance) values (4001,'D','A', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (4002,'D','B', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (4003,'D','C', 0);
Insert into relationship (id, person1_id, person2_id, acquaintance) values (4004,'D','D', 0);