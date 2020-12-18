create database myproject;

use myproject;

SELECT * FROM myproject.mtb310_transaction;

SELECT * FROM myproject.mtb310_ag_financeiro;

create table myproject.mtb310_usuario select * from aula08.user;

select * from mtb310_usuario;

update mtb310_usuario set racf = 'fulano' where id = 1;
update mtb310_usuario set racf = 'mary' where id = 2;
update mtb310_usuario set racf = 'fred' where id = 3;
update mtb310_usuario set racf = 'frederi'  where id = 4;
update mtb310_usuario set racf = 'bruce' where id = 5;
update mtb310_usuario set racf = 'abc' where id = 6;


alter table mtb310_usuario add column racf char(8) not null;
alter table mtb310_usuario add column linkfoto varchar(300) ;

SELECT * FROM myproject.mtb310_ag_financeiro order by  volume_transacional desc;


SELECT 
    status, count(*) AS qtde
FROM
    myproject.mtb310_transaction
WHERE
    ag_financeiro = 3
GROUP BY status;
