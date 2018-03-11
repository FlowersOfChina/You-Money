# You-Money

有钱网后端，DTO VO PO DAO  多种MVC 模式进行解耦合 同时使用 eureka 将服务注册
到分布式的服务上！


## DTO
设计并且实现 从 单纯的 Http 请求中将数据拿到，同时建立AOP 对数据进行拦截
并且注入多种参数供service 使用


## controller
所有的controller 会继承一个 base controller 用来进行一个特别的操作，
使用模板方法来将各种复杂的业务进行解耦


