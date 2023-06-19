## 整合 Redis
整合时间遇到问题：
```text
java.lang.ClassNotFoundException: org.apache.commons.pool2.impl.GenericObjectPoolConfig
```
> 原因：启动连接redis时报错 因为spring-boot-starter-data-redis 升级后将 commons-pool2 踢出去了

解决办法：添加依赖
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-pool2</artifactId>
    <version>2.6.2</version>
</dependency>
```