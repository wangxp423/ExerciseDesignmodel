package com.xp.design.builder;


/**
 * @类描述：建造一个瘦人
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/29 0029 10:24
 * @修改人：
 * @修改时间：2018/5/29 0029 10:24
 * @修改备注：
 */
public class ThinPerson extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("画一个人头(瘦)");
    }

    @Override
    public void buildBody() {
        System.out.println("画一个身体(瘦)");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("画一个左胳膊(瘦)");
    }

    @Override
    public void buildArmRight() {
        System.out.println("画一个右胳膊(瘦)");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("画一个左腿(瘦)");
    }

    @Override
    public void buildLegRight() {
        System.out.println("画一个右腿(瘦)");
    }
}
