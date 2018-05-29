package com.xp.design.builder;

/**
 * @类描述：构建指挥者
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/29 0029 10:31
 * @修改人：
 * @修改时间：2018/5/29 0029 10:31
 * @修改备注：
 */
public class PersonDirector {
    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void creatPerson() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    }
}
