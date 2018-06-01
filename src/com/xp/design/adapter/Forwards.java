package com.xp.design.adapter;

/**
 * @类描述：前锋球员
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/1 0001 10:16
 * @修改人：
 * @修改时间：2018/6/1 0001 10:16
 * @修改备注：
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋：" + name + "，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("前锋：" + name + "，防守！");
    }
}
