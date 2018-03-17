# You-Money Project Web-api

用户业务逻辑api

主要定义各个controllers 和 文件上传API 部分 文件将直接接入 Hadoop HDFS 进行存储 

使用Spring Cloud 进行开发 

使用Netflix 全家桶 


## controller 
全部继承于 BaseController  用于实现RestFul 接口 
同时构建DTO 层 可以将 controller 的数据 分批的划入 service 层直接使用 
只需要从basecontroller 直接拉出来 并且 剥离数据就可以了