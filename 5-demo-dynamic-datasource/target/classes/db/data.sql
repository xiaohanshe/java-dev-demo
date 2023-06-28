INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('1','datetime', 'Date', 'java.util.Date', now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('2','date', 'Date', 'java.util.Date', now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('3','tinyint', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('4','smallint', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('5','mediumint', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('6','int', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('7','integer', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('8','bigint', 'Long', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('9','float', 'Float', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('10','double', 'Double', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('11','decimal', 'BigDecimal', 'java.math.BigDecimal', now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('12','bit', 'Boolean', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('13','char', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('14','varchar', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('15','tinytext', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('16','text', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('17','mediumtext', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('18','longtext', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('19','timestamp', 'Date', 'java.util.Date', now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('20','NUMBER', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('21','BINARY_INTEGER', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('22','BINARY_FLOAT', 'Float', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('23','BINARY_DOUBLE', 'Double', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('24','VARCHAR2', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('25','NVARCHAR', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('26','NVARCHAR2', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('27','CLOB', 'String', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('28','int8', 'Long', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('29','int4', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('30','int2', 'Integer', NULL, now());
INSERT INTO gen_field_type (id,column_type, attr_type, package_name, create_time) VALUES ('31','numeric', 'BigDecimal', 'java.math.BigDecimal', now());

INSERT INTO gen_datasource ( id, db_type, conn_name, conn_url, username, password, create_time ) VALUES ('c591efb9f982183a25f49f310bc9b72a','Oracle','oracle-demo', 'jdbc:oracle:thin:@localhost:1521:xe', 'root', 'root','2022-12-26 13:33:32.955');
INSERT INTO gen_datasource ( id, db_type, conn_name, conn_url, username, password, create_time ) VALUES ('15f6cace176a8868b19c919a8cac8a94', 'MySQL', 'mysql-demo',  'jdbc:mysql://localhost:3306/maku_generator?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true', 'root', 'root', '2022-12-26 13:32:06.179');
INSERT INTO gen_datasource ( id, db_type, conn_name, conn_url, username, password, create_time ) VALUES ('15f622ace17628868b19c919a8cac8a94', 'MySQL', 'blog-demo',  'jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true', 'root', 'root', '2022-12-26 13:32:06.179');

INSERT INTO gen_base_class (id,package_name, code, fields, remark, create_time)
VALUES ('1','net.maku.framework.common.entity', 'BaseEntity', 'id,creator,create_time,updater,update_time,version,deleted', '使用该基类，则需要表里有这些字段', now());

INSERT INTO gen_project_modify (id,project_name, project_code, project_package, project_path, modify_project_name, modify_project_code, modify_project_package, exclusions, modify_suffix, create_time)
VALUES ('1','maku-boot', 'maku', 'net.maku', 'D:/makunet/maku-boot', 'baba-boot', 'baba', 'com.baba', '.git,.idea,target,logs', 'java,xml,yml,txt', now());
INSERT INTO gen_project_modify (id,project_name, project_code, project_package, project_path, modify_project_name, modify_project_code, modify_project_package, exclusions, modify_suffix, create_time)
VALUES ('2','maku-cloud', 'maku', 'net.maku', 'D:/makunet/maku-cloud', 'baba-cloud', 'baba', 'com.baba', '.git,.idea,target,logs', 'java,xml,yml,txt', now());

insert into general_enum_test(  id ,name,db_type,url,driver) values ('1','mysql',1,'mysql_url','org.jdbc.mysql'),('2','pgsql',2,'pgsql','org.jdbc.mysql');

INSERT INTO sys_datasource_config (id, code,pool_name,url, username,password,driver_class_name)
VALUES ('1', 'tongjiang', 'mysql_test', 'jdbc:mysql://localhost:3306/blog?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&serverTimezone=CTT&nullCatalogMeansCurrent=true', 'root', 'root', 'com.mysql.cj.jdbc.Driver');
