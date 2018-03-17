package cn.leemaster.flowers.be.core.senquence;

/**
 * @author leemaster
 * @Title: BaseSenquence
 * @Package cn.leemaster.flowers.be.core.senquence
 * @Description:
 * 序列的抽象类 基础类
 *
 * 我们对 nextId 操作来进行包装，同时暴露程序实现接口，来快速实现
 *
 * 需要在这里设置一个具体的策略选择，基于反射来进行设置，实现一个伪代理方案
 *
 * @date 2018/3/18上午1:54
 */
public abstract class BaseSenquence implements Senquence {
}
