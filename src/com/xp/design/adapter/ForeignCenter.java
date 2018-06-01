package com.xp.design.adapter;

/**
 * @类描述：外籍中锋(姚明)
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/1 0001 10:20
 * @修改人：
 * @修改时间：2018/6/1 0001 10:20
 * @修改备注：
 */
public class ForeignCenter {
    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void yAttack() {
        System.out.println("外籍球员：" + name + "，进攻！");
    }

    public void yDefense() {
        System.out.println("外籍球员：" + name + "，防守！");
    }
}
