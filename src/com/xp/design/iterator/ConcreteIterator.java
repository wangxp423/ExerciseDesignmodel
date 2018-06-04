package com.xp.design.iterator;

/**
 * @类描述：具体迭代实现
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 15:19
 * @修改人：
 * @修改时间：2018/6/4 0004 15:19
 * @修改备注：
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getIndex(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.getCount()) {
            ret = aggregate.getIndex(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getIndex(current);
    }
}
