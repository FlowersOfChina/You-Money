# You-Money project web 

web 系统通用数据结构 

Model 和 Mybatis 各种实体定义和 TypeHandlers 

操作 Hadoop 的各种 Dao 

# 数据库设计
# You-Money

# 数据库表设计
 - 用户  表
 - 平台  表 
 - 产品  表
 - 资讯  表
 - 产品收藏  表
 - 资讯收藏  表



* user 用户  表

        user_phonemun 用户手机号 user_phone varchar(11)
        user_password   用户密码 char(32)

* platform  平台 表 

        platform_name  平台名称  plat_name varchar(20)
        platform_logo  平台logo  plat_logo varchar(20)
        platform_yield  平台收益率 plat_yield float

* product  产品  表

        product_name 产品名称 pro_name varchar(20)
        product_Issuer 发行机构 pro_Issuer varchar(20)
        product_fund 资金规模 pro_fund  int  
        product_tens of thousands of earnings yesterday 昨日万份收益 pro_ttey  float  
        product_diurnal interest rate 日年化利率  pro_dir float  
        product_purchase amount 起购金额 pro_pa int  
        product_upper limit of single day extraction  单日提取上限 pro_ulisde int  
        product_speed up  提现速度 pro_su int //小时为单位  
        product_link 链接 pro_link varchar(20)  
        product_word of mouth 口碑 pro_wm varchar(20)  
        product_Rate of return 收益率pro_rt float  
        product_Raise the amount of cash 提现额度  pro_rac int  
        product_Financial time limit 理财期限 pro_ftl int//月为单位  
        product_Annual income 年化收益 pro_ai flost//  
        product_Annual income of 7 days 7日年化收益 pro_aisd flost  

* information  资讯  表 info

        information_title 资讯标题 info_title varchar(20)  
        information_data  日期 info_data date  
        information_author  作者 info_author varchar(20)   
        information_picture  图片 info_picture varchar(20)    
        information_content  内容 info_content text    
        information_type 资讯类别（限制为 "新闻"、"测评"、"百科"、"攻略" 共4种）info_type char(10)   

* product_collection  产品收藏 表(用户和产品的中间表)pro_collection
    
        user_phonenum 用户手机号 user_phone varchar(11)  
        product_name 产品名称 pro_name varchar(20)  

* information_collection 资讯收藏 表(用户和资讯的中间表) info_collection

        user_phonenum  用户手机号  user_phone varchar(11)  
        information_title 资讯标题 info_title varchar(20)  

  ***没有加到数据库表中的属性如下？？***

 网站地图
 版权信息
 友情链接
 数据视图？
 ![数据视图和友情链接](http://img.blog.csdn.net/20180309174212581?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzA2MjUzMTU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 还款方式？？
 ![还款方式](http://img.blog.csdn.net/20180309174029779?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzA2MjUzMTU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 30天和90天年化收益走势？？
 ![ 30天和90天年化收益走势？？](http://img.blog.csdn.net/2018030917390159?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzA2MjUzMTU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
