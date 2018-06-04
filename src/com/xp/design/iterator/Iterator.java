package com.xp.design.iterator;

/**
 * @类描述：抽象迭代器接口
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 15:16
 * @修改人：
 * @修改时间：2018/6/4 0004 15:16
 * @修改备注：
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
