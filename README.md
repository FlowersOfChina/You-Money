# You-Money

# 数据库表设计
 - 用户  表
 - 平台  表
 - 产品  表
 - 资讯  表
 - 产品收藏  表
 - 资讯收藏  表
 


user 用户  表
      user_phonenum  用户手机号
      user_password   用户密码
      
platform  平台  表
      platform_name  平台名称
      platform_logo  平台logo
      platform_yield  平台收益率
      
product  产品  表
      product_name  产品名称
      product_Issuer  发行机构
      product_fund  资金规模
      product_tens of thousands of earnings yesterday  昨日万份收益
      product_diurnal interest rate  日年化利率
      product_purchase amount  起购金额
      product_upper limit of single day extraction  单日提取上限
      product_speed up  提现速度
      product_link  链接
      product_word of mouth  口碑
      product_Rate of return  收益率
      product_Raise the amount of cash  提现额度
      product_Financial time limit  理财期限
      product_Annual income  年化收益
      product_Annual income of 7 days  7日年化收益

information  资讯  表
      information_title 资讯标题
      information_data  日期
      information_author  作者
      information_picture  图片
      information_content  内容
      information_type 资讯类别（限制为 "新闻"、"测评"、"百科"、"攻略" 共4种）
      
      
 product_collection  产品收藏  表 【用户和产品的中间表】
      user_phonenum  用户手机号
      product_name  产品名称
      
information_collection  资讯收藏  表 【用户和资讯的中间表】
      user_phonenum  用户手机号
      information_title 资讯标题
