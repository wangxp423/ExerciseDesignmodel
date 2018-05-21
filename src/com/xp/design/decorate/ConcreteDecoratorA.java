package com.xp.design.decorate;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/21 0021 11:19
 * @修改人：
 * @修改时间：2018/5/21 0021 11:19
 * @修改备注：
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedStatus;

    @Override
    public void Operation() {
        super.Operation();
        addedStatus = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
