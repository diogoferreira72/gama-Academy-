use myproject;

create table mtb310_ag_financeiro(
   id_agente integer not null auto_increment,  
   nome_agente varchar(100),
   volume_transacional float,
   constraint pk_agente primary key (id_agente)
);

create table mtb310_transaction(
    id_transacao integer not null auto_increment,
    data_hora datetime,
    dispositivo integer,
    valor_solic float,
    valor_aut  float,
    status integer,
    ag_financeiro integer not null,
    constraint pk_trans primary key (id_transacao),
    constraint fk_agente foreign key (ag_financeiro) references mtb310_ag_financeiro(id_agente)
);


insert into mtb310_ag_financeiro values 
    (null, 'MAGALU Financeira', 1231),
    (null, 'SANTANDER Cartoes', 81212),
    (null, 'ITAU/Uniclass Cards', 9912),
    (null, 'SUBMARINO Cartoes',63421),
    (null, 'HIPERCARD',98273),
    (null, 'ITAU Virtual',12129),
    (null, 'PICPAY Cartoes',812),
    (null, 'SAMS CLUB Mastercard',965),
    (null, 'EXTRA Cartoes VISA',112909),
    (null, 'CARREFOUR Credito Master',191218);
    
    
    