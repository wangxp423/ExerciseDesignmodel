package com.xp.design.visitor;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 16:47
 * @修改人：
 * @修改时间：2018/6/6 0006 16:47
 * @修改备注：
 */
public class Success extends Action {
    private String typeName = "成功";

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.name + typeName + "时，" + "背后多半有一个伟大的女人！");
    }

    @Override
    public void getWomanConclusion(Woman man) {
        System.out.println(man.name + typeName + "时，" + "背后多半有一个不成功的男人！");
    }
}
