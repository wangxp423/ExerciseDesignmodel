package com.xp.design.proxy;

/**
 * @类描述：代理人
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/22 0022 10:27
 * @修改人：
 * @修改时间：2018/5/22 0022 10:27
 * @修改备注：
 */
public class Proxy implements GiveGift {
    private Pursuit pursuit;

    public Proxy(Girl girl) {
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
