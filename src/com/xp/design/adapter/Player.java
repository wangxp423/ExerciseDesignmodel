package com.xp.design.adapter;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/1 0001 10:14
 * @修改人：
 * @修改时间：2018/6/1 0001 10:14
 * @修改备注：
 */
public abstract class Player {
    //实现一个教练向球员发起战术，姚明表示我是中国人我听过不懂。
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();//进攻

    public abstract void defense();//防守
}
