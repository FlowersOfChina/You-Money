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

    String getAsString();

    Date getAsDate();

    Integer getAsInteger();

    BigDecimal getAsBigDecimal();

    List getAsList();

    Timestamp getAsTimestamp();

    Boolean getAsBoolean();

    /**
     * 当前端的请求传来字符串的时候将String 存储在DTO 中
     *
     * @param json
     */
    void setDefaultJson(String json);

    String getJsonString();
}
