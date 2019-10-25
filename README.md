## springboot-module-mybatis

springboot模块化+集成mybatis连接mysql 框架

### module模块
三个模块：api、model、server   
+ 相互依赖api<--model<--server   
+ model集成mybatis连mysql
    - dao接口在com.keyvin.demo.model.dao
    - mybatis映射xml文件在model/resources/mappers   
+ server作为service层调用dao

##版本
| 框架 | 版本 |   
| --- |----|    
springboot | 2.1.7.RELEASE |
mybatis | 1.3.2 |
mysql-connector-java | 5.1.39 |
alibaba druid | 1.1.10 |