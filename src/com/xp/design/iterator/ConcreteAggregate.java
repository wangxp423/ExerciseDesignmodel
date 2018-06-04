package com.xp.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 15:21
 * @修改人：
 * @修改时间：2018/6/4 0004 15:21
 * @修改备注：
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.size();
    }

    public Object getIndex(int index) {
        return items.get(index);
    }

    public void add(Object obj) {
        items.add(obj);
    }

    public void remove(Object obj) {
        items.remove(obj);
    }
}
