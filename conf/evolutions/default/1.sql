# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbl_actividades (
  act_id                    bigint not null,
  act_nombre                varchar(255),
  act_responsable           varchar(255),
  act_descripcion           varchar(256),
  act_secuencia             integer,
  act_comentarios           varchar(256),
  act_impedimentos          varchar(255),
  act_complejidad           varchar(255),
  act_estimacionoriginal    integer,
  act_trabajocompletado     integer,
  act_trabajorestante       integer,
  act_enlacedocumento       varchar(255),
  act_fechainicio           timestamp,
  act_fechafin              timestamp,
  activi_pro_id             bigint,
  constraint pk_tbl_actividades primary key (act_id))
;

create table estados (
  est_id                    bigint not null,
  est_nombre                varchar(255),
  constraint pk_estados primary key (est_id))
;

create table tbl_numeracioninformes (
  num_id                    bigint not null,
  num_codigoinforme         varchar(255),
  num_fecha                 timestamp,
  num_titulo                varchar(255),
  num_requiriente           varchar(255),
  num_referente             varchar(256),
  num_realizado             varchar(255),
  num_revisado              varchar(255),
  num_aprobado              varchar(255),
  num_observaciones         varchar(256),
  num_correonotificar       varchar(255),
  constraint pk_tbl_numeracioninformes primary key (num_id))
;

create table tbl_persona (
  per_id                    bigint not null,
  per_nombre                varchar(255),
  per_apellido              varchar(255),
  per_correo                varchar(255),
  per_celular               varchar(255),
  per_notificacion          varchar(255),
  constraint pk_tbl_persona primary key (per_id))
;

create table tbl_proyectos (
  pro_id                    bigint not null,
  pro_nombre                varchar(255),
  pro_descripcion           varchar(256),
  pro_costo                 float,
  pro_responsable           varchar(255),
  pro_prioridad             varchar(255),
  constraint pk_tbl_proyectos primary key (pro_id))
;

create sequence tbl_actividades_seq;

create sequence estados_seq;

create sequence tbl_numeracioninformes_seq;

create sequence tbl_persona_seq;

create sequence tbl_proyectos_seq;

alter table tbl_actividades add constraint fk_tbl_actividades_Activi_1 foreign key (activi_pro_id) references tbl_proyectos (pro_id);
create index ix_tbl_actividades_Activi_1 on tbl_actividades (activi_pro_id);



# --- !Downs

drop table if exists tbl_actividades cascade;

drop table if exists estados cascade;

drop table if exists tbl_numeracioninformes cascade;

drop table if exists tbl_persona cascade;

drop table if exists tbl_proyectos cascade;

drop sequence if exists tbl_actividades_seq;

drop sequence if exists estados_seq;

drop sequence if exists tbl_numeracioninformes_seq;

drop sequence if exists tbl_persona_seq;

drop sequence if exists tbl_proyectos_seq;

