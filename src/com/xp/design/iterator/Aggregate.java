package com.xp.design.iterator;

/**
 * @类描述：聚集抽象类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 15:18
 * @修改人：
 * @修改时间：2018/6/4 0004 15:18
 * @修改备注：
 */
abstract class Aggregate {
    public abstract Iterator createIterator();
}
