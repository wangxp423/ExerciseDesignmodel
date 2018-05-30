package com.xp.design.observer.boss;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述：主题类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 11:02
 * @修改人：
 * @修改时间：2018/5/30 0030 11:02
 * @修改备注：
 */
public abstract class Subject {
    //创建一个员工观察老板回来的例子
    private List<Observer> observerList = new ArrayList<Observer>();
    protected String subjectStatus;

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void dttach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
