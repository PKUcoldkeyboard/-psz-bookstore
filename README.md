# rb
尝试采用spring boot重建之前用jsp写的RB项目，包含RabbitMQ，ElasticSearch，Mybatis、redis、thymeleaf、异步任务、分布式等组件，以实践为主。

## 1、Mybatis

所有的mapper.xml和实体类文件，Dao层文件都由Mybatis-generator自动生成，基本上一张表对应一个Mapper