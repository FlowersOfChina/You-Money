import MySQLdb

'''
    数据库实例目前部署一台就可以了，然后通过这个脚本进行数据的同步操作
    插入测试数据 每次开发完成新的模块 使用这个脚本 动态的添加数据 
    
'''
# 重新创建模式 为 create 追加数据使用 append 删除并且重新添加 为 refresh
DB_OP_MODE = "append"

# 数据库链接用户名
MYSQL_CONN_NAME = "mysqlname"
#数据库远程链接地址
MYSQL_CONN_ADDR = "mysqllinkpath"
#数据库登录密码
MYSQL_CONN_PASSWORD = "mysqlpassword"
#数据库默认的链接编码
MYSQL_CONN_CHARSET = "utf8"

# 默认的数据库名称
CREATE_DB_NAME = "you_money"




def check_db_exists(db_name,db):
    '''
    检查当前数据库是否已经存在
    :param db_name:
    :return:
    '''
    cursor = db.cursor()

    cursor.execute("SHOW DATABASES")

    rows = cursor.fetchall();

    for row in rows:
        tmp = '%2s'%row
        if tmp == CREATE_DB_NAME:
            return True

    return False

#TODO 创建数据库脚本未完成
def drop_db(db):
    '''
    创建数据库
    :return:
    '''
    cursor = db.cursor()
    cursor.execute("DROP DATABASE IF EXISTS " + CREATE_DB_NAME)
    cursor.execute("CREATE DATABASE IF NOT EXISTS " + CREATE_DB_NAME)


def create_table(tab_name,engine,charset):
    '''
    创建表函数
    :param tab_name:
    :param engine:
    :param charset:
    :return:
    '''
    pass


def append_data(sql_query):
    '''
    追加数据
    :param sql_query:
    :return:
    '''
    pass

def clean_table(tab_name):
    '''
    清理表数据
    :param tab_name:
    :return:
    '''
    pass



if __name__ == '__main__':

    db = MySQLdb.connect(MYSQL_CONN_ADDR,
                         MYSQL_CONN_NAME,
                         MYSQL_CONN_PASSWORD,
                         MYSQL_CONN_CHARSET
                         )

    if check_db_exists(CREATE_DB_NAME,db):
        pass

    db.close()