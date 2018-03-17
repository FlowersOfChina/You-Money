package cn.leemaster.flowers.be.core.senquence;

import java.util.Map;

/**
 * @author leemaster
 * @Title: Senquence
 * @Package cn.leemaster.flowers.be.core.senquence
 * @Description:
 * 序列生成器接口
 * @date 2018/3/18上午1:23
 */
public interface Senquence<T> {

    /**
     * 直接获取 id
     * 使用范型 确保 有的地方是 long  有个地方是 integer 的问题
     * @return
     */
    public T nextId();

    /**
     * 系统启动的时候 会拉起来这个函数来进行 cache 层的初始化
     * @param keyName
     * @param value
     */
    public void initCache(String keyName , T value);

    /**
     * 设置当前的生成策略，系统运行过程的时候会动态的选择这个东西
     * 设计 可能需要把这个东西抽象到 模板类内部
     * @param stragyClass
     */
    public void setStragy(Class<T> stragyClass);

    /**
     * 初始化缓存的策略
     * @param map
     */
    public void initCache(Map<String , T> map);
}
