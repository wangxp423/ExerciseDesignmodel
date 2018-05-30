package com.xp.design.observer.system;

import java.util.Observable;

/**
 * @类描述：数据管理类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 13:09
 * @修改人：
 * @修改时间：2018/5/30 0030 13:09
 * @修改备注：
 */
public class DataManager extends Observable {
    //系统自带观察者
    public void setDataChange() {
        setChanged();
        notifyObservers();
    }
}
