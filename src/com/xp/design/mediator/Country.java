package com.xp.design.mediator;

/**
 * @类描述：国家类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 17:04
 * @修改人：
 * @修改时间：2018/6/5 0005 17:04
 * @修改备注：
 */
public abstract class Country {
    protected UniteNations nations;

    public Country(UniteNations nations) {
        this.nations = nations;
    }
}
