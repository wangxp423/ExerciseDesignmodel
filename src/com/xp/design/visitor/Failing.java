package com.xp.design.visitor;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 16:47
 * @修改人：
 * @修改时间：2018/6/6 0006 16:47
 * @修改备注：
 */
public class Failing extends Action {
    private String typeName = "失败";

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.name + typeName + "时，" + "闷头喝酒，谁也不用劝！");
    }

    @Override
    public void getWomanConclusion(Woman man) {
        System.out.println(man.name + typeName + "时，" + "眼泪汪汪，谁劝也没用！");
    }
}
