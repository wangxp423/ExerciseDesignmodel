package com.xp.design.flyweight;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 10:14
 * @修改人：
 * @修改时间：2018/6/6 0006 10:14
 * @修改备注：
 */
public class ConcreteWebsite extends Website {
    public String webName;

    public ConcreteWebsite(String name) {
        this.webName = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类：" + webName + "，用户：" + user.name);
    }
}
