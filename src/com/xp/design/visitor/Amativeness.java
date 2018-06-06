package com.xp.design.visitor;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 16:47
 * @修改人：
 * @修改时间：2018/6/6 0006 16:47
 * @修改备注：
 */
public class Amativeness extends Action {
    private String typeName = "恋爱";

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.name + typeName + "时，" + "凡事不懂也要装懂！");
    }

    @Override
    public void getWomanConclusion(Woman man) {
        System.out.println(man.name + typeName + "时，" + "遇事懂也装不懂！");
    }
}
