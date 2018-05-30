package com.xp.design.observer.boss;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 11:03
 * @修改人：
 * @修改时间：2018/5/30 0030 11:03
 * @修改备注：
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
