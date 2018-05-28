package com.xp.design.facade;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/28 0028 11:54
 * @修改人：
 * @修改时间：2018/5/28 0028 11:54
 * @修改备注：
 */
public class Facade {
    //外观类
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        two.methodTwo();
        three.methodThree();
    }
}
