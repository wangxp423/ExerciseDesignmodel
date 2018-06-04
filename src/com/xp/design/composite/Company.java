package com.xp.design.composite;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 10:44
 * @修改人：
 * @修改时间：2018/6/4 0004 10:44
 * @修改备注：
 */
abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public String depthChar(String sChar, int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append(sChar);
        }
        return builder.toString();
    }

    public abstract void add(Company company);//增加

    public abstract void remove(Company company);//删除

    public abstract void display(int depth);//深度

    public abstract void lineDuty();//职责
}
