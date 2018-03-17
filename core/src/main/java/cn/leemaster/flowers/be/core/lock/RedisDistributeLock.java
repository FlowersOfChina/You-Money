package cn.leemaster.flowers.be.core.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author leemaster
 * @Title: RedisDistributeLock
 * @Package cn.leemaster.flowers.be.core.lock
 * @Description:
 * 基于 redis 的分布式锁
 * @date 2018/3/18上午1:22
 */
public class RedisDistributeLock implements Lock {
    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
