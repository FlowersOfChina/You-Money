# 无限分类 

实现 YOU 钱 网的无限分类算法，用与多个地方的分类

* 理财产品的无限分类
* 资讯文章的无限分类
* 用户类别的无限分类

## 实现思路

    分类使用左右链接方案进行无限分类，
    同时在左右两个索引子段上添加普通索引，用于加快查询
    设计字段用于使用

## 分类表设计

    ym_money_classify_parent
        classify_id int unsigned primary key auto_increment,主键
        classify_lcls int not null,当前节点最左侧的值
        classify_rcls int not null,当前节点最右侧的值
        classify_lvl  int not null,当前分类的层次 主分类层次为0
        classify_status int(1) not null default 0,当前的节点状态
        classify_clsname varchar(50) not null 分类名称
        
        
    
## 分类的思路

    首先就是根据 classify_lvl选择第一层的节点，然后依次根据左右的线索进行检索
    