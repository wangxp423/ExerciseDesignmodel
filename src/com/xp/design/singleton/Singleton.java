package com.xp.design.singleton;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 16:13
 * @修改人：
 * @修改时间：2018/6/4 0004 16:13
 * @修改备注：
 */
public class Singleton {
    private static Singleton INSTANCE;
//    private static Singleton INSTANCE = new Singleton();//饿汉式

    private Singleton() {
    }

    public static Singleton getInstance() {//饿汉式
        return INSTANCE;
    }

    public static synchronized Singleton getInstance1() {//懒汉式
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public static Singleton getInstance2() { //双重锁式
        if (null == INSTANCE) {
            synchronized (Singleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
