package cn.leemaster.flowers.be.core.classify;

/**
 * @author leemaster
 * @Title: TableClassifyMapper
 * @Package cn.leemaster.flowers.be.core.classify
 * @Description:
 * mybatis 无限分类表的映射mapper
 *
 * 在插入的时候需要使用 悲观锁对表进行锁定，
 * 为了应对这个问题，我们在查询的时候会加入一些cache 来进行缓存
 *
 * @date 2018/3/18上午1:20
 */
//TODO  need to complete this mapper to create the all classify
public interface TableClassifyMapper {
}
