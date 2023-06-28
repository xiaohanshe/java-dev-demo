CREATE TABLE gen_datasource
(
    id          varchar(50)       NOT NULL,
    db_type     varchar(200),
    conn_name   varchar(200) NOT NULL,
    conn_url    varchar(500),
    username    varchar(200),
    password    varchar(200),
    create_time TIMESTAMP,
    primary key (id)
);

CREATE TABLE gen_field_type
(
    id           varchar(50) NOT NULL,
    column_type  varchar(200),
    attr_type    varchar(200),
    package_name varchar(200),
    create_time  TIMESTAMP,
    primary key (id)
);

CREATE TABLE gen_base_class
(
    id           varchar(50) NOT NULL,
    package_name varchar(200),
    code         varchar(200),
    fields       varchar(500),
    remark       varchar(200),
    create_time  TIMESTAMP,
    primary key (id)
);

CREATE TABLE gen_table
(
    id             varchar(50) NOT NULL,
    table_name     varchar(200),
    class_name     varchar(200),
    table_comment  varchar(200),
    author         varchar(200),
    email          varchar(200),
    package_name   varchar(200),
    version        varchar(200),
    generator_type int,
    backend_path   varchar(500),
    frontend_path  varchar(500),
    module_name    varchar(200),
    function_name  varchar(200),
    form_layout    int,
    datasource_id  varchar(50),
    baseclass_id   varchar(50),
    create_time    TIMESTAMP,
    primary key (id)
);

CREATE TABLE gen_table_field
(
    id              varchar(50) NOT NULL,
    table_id        varchar(50),
    field_name      varchar(200),
    field_type      varchar(200),
    field_comment   varchar(200),
    attr_name       varchar(200),
    attr_type       varchar(200),
    package_name    varchar(200),
    sort            int,
    auto_fill       varchar(20),
    primary_pk      int,
    base_field      int,
    form_item       int,
    form_required   int,
    form_type       varchar(200),
    form_dict       varchar(200),
    form_validator  varchar(200),
    grid_item       int,
    grid_sort       int,
    query_item      int,
    query_type      varchar(200),
    query_form_type varchar(200),
    query_dict      varchar(200),
    primary key (id)
);

CREATE TABLE gen_project_modify
(
    id                     varchar(50) NOT NULL,
    project_name           varchar(100),
    project_code           varchar(100),
    project_package        varchar(100),
    project_path           varchar(200),
    modify_project_name    varchar(100),
    modify_project_code    varchar(100),
    modify_project_package varchar(100),
    exclusions             varchar(200),
    modify_suffix          varchar(200),
    modify_tmp_path        varchar(100),
    create_time            TIMESTAMP,
    PRIMARY KEY (id)
);


CREATE TABLE gen_test_member
(
    member_id   varchar(50) NOT NULL,
    name        varchar(50),
    gender      int,
    age         int,
    occupation  varchar(100),
    create_time TIMESTAMP,
    PRIMARY KEY (member_id)
);

CREATE TABLE gen_test_student
(
    id          varchar(50) NOT NULL,
    name        varchar(50),
    gender      int,
    age         int,
    class_name  varchar(50),
    version     int,
    deleted     int,
    creator     varchar(50),
    create_time TIMESTAMP,
    updater     varchar(50),
    update_time TIMESTAMP,
    PRIMARY KEY (id)
);

create table general_enum_test(
  id          varchar(50) NOT NULL,
  name        varchar(50),
  db_type         int,
  url         varchar(50) NOT NULL,
  driver         varchar(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE sys_datasource_config (
    id varchar(50) NOT NULL,
    code varchar(20) DEFAULT NULL,
    pool_name varchar(20) DEFAULT NULL,
    url varchar(200) DEFAULT NULL,
    username varchar(20) DEFAULT NULL,
    password varchar(20) DEFAULT NULL,
    driver_class_name varchar(50) DEFAULT NULL,
    PRIMARY KEY (id)
);