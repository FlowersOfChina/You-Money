package cn.leemaster.flowers.be.core.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author leemaster
 * @Title: Dto
 * @Package cn.leemaster.flowers.be.core.dto
 * @Description:
 * DTO接口 对前端的一切进行包装，然后封装成为一个DTO 对象，并且最后会将 Mybatis
 * 查询出来的Entity 封装进入 这个里面，通过反射技术
 * Cglib 技术进行 实验 ，初步的封装就是进行一个简单的反射
 * @date 2018/3/12上午1:21
 */

public interface Dto {

    /**
     * 按照key 获取一个String 类型的数据
     * @param dtoKey
     * @return
     */
    String getAsString(String dtoKey);

    /**
     * 按照key 获取一个 java.util.Date 类型
     * @param dtoKey
     * @return
     */
    Date getAsDate(String dtoKey);

    /**
     * 按照key 获取一个 Integer 类型的数据
     * @param dtoKey
     * @return
     */
    Integer getAsInteger(String dtoKey);

    /**
     * 按照 key 获取一个 BigDecimal 类型数据
     * @param dtoKey
     * @return
     */

    BigDecimal getAsBigDecimal(String dtoKey);

    /**
     * 按照key 获取一个 List 类型的数据
     * @param dtoKey
     * @return
     */
    List getAsList(String dtoKey);

    /**
     * 按照类型获取一个 Timestamp 类型的数据
     * @param dtoKey
     * @return
     */
    Timestamp getAsTimestamp(String dtoKey);

    /**
     * 按照类型获取一个 boolean 数据
     * @param dtoKey
     * @return
     */
    Boolean getAsBoolean(String dtoKey);

    /**
     * 当前端的请求传来字符串的时候将String 存储在DTO 中
     *
     * @param json
     */
    void setDefaultJson(String json);

    /**
     * 直接转换一个对象变成 String 类型
     * @param object
     * @return
     */
    String getJsonString(Object object);
}
