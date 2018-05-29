package com.xp.design.builder;

/**
 * @类描述：人 构建者
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/29 0029 10:19
 * @修改人：
 * @修改时间：2018/5/29 0029 10:19
 * @修改备注：
 */
public abstract class PersonBuilder {
    //画一个人： 头 身体 左手 右手 左腿 右腿
    //建造人的过程是一样的，为了避免建造过程的马虎，我们需要先把过程固定
    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
