package com.xp.design.state;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:46
 * @修改人：
 * @修改时间：2018/5/31 0031 10:46
 * @修改备注：
 */
public abstract class State {
    //根据不同的工作时间，展示不同的工作状态
    public abstract void workStatus(Work wrok);
}
