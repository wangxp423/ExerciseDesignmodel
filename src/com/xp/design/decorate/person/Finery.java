package com.xp.design.decorate.person;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/21 0021 11:37
 * @修改人：
 * @修改时间：2018/5/21 0021 11:37
 * @修改备注：
 */
public abstract class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (null != component) {
            component.show();
        }
    }
}
