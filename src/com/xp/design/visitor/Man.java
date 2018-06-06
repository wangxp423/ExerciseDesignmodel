package com.xp.design.visitor;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 16:46
 * @修改人：
 * @修改时间：2018/6/6 0006 16:46
 * @修改备注：
 */
public class Man extends Person {
    public String name = "男人";

    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
