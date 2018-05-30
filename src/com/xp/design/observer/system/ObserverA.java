package com.xp.design.observer.system;

import java.util.Observable;
import java.util.Observer;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 13:12
 * @修改人：
 * @修改时间：2018/5/30 0030 13:12
 * @修改备注：
 */
public class ObserverA implements Observer {
    public ObserverA(Observable observable) {
        super();
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ObserverA 观察到数据变化，然后也要更新啦");
    }
}
