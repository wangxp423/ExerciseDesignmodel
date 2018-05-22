package com.xp.design.proxy;

/**
 * @类描述：追求者类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/22 0022 10:23
 * @修改人：
 * @修改时间：2018/5/22 0022 10:23
 * @修改备注：
 */
public class Pursuit implements GiveGift {
    private Girl mm;

    public Pursuit(Girl girl) {
        this.mm = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("追求者送洋娃娃给" + mm.name);
    }

    @Override
    public void giveFlowers() {
        System.out.println("追求者送鲜花给" + mm.name);
    }

    @Override
    public void giveChocolate() {
        System.out.println("追求者巧克力给" + mm.name);
    }
}
