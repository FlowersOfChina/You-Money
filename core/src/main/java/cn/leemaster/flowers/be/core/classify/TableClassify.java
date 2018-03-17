package cn.leemaster.flowers.be.core.classify;

import java.util.List;

/**
 * @author leemaster
 * @Title: TabelClassify
 * @Package cn.leemaster.flowers.be.core.classify
 * @Description:
 * 创建无限分类方案的接口方法，这个方法最后生成的 bean 会成为单例对象注入在 spring 的context 对象内部
 * @date 2018/3/18上午1:11
 */
//TODO need to complete this interface and will use this interface

public interface TableClassify {

    /**
     * 使用id 值获取类的名称
     * @param id
     * @return
     */
    public String getClassifyById(Integer id);

    /**
     * 使用区间方案获取一个节点下面的子节点
     * @param left
     * @param right
     * @return
     */
    public List<String> getClassifyBetween(Integer left,Integer right);

    /**
     * 获取一个节点下某个级别的全部节点
     * @param leavel
     * @return
     */
    public List<String> getClassifyByLeavel(Integer leavel,Integer id);

    /**
     * 创建一个新的分类根节点
     * @param classifyName
     * @return
     */
    public boolean setClassifyRoot(String classifyName);

    /**
     * 在一个节点下创建一个新的节点
     * @param classifyName
     * @param parentId
     * @return
     */
    public boolean setClassifyChild(String classifyName,Integer parentId);

    /**
     * 删除节点
     * 节点删除的时候仅仅对status字段进行一个不可用标记
     * 因为对应的表中为了加快查询速度，加了很多索引删除的话太浪费时间了
     * 默认的情况下在系统启动的时候会开启一个ScheduldExecutorService在每天的凌晨业务不繁忙的时候执行删除工作
     * @param id
     * @return
     */
    public boolean deleteClassifyById(Integer id);
}
