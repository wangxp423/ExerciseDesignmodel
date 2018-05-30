package com.xp.design.observer.boss;

/**
 * @类描述：看股票的同事
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 11:15
 * @修改人：
 * @修改时间：2018/5/30 0030 11:15
 * @修改备注：
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(sub.subjectStatus + name + "关闭股票行情，继续工作");
    }
}
