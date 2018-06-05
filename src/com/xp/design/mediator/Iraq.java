package com.xp.design.mediator;

/**
 * @类描述：伊拉克
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 17:06
 * @修改人：
 * @修改时间：2018/6/5 0005 17:06
 * @修改备注：
 */
public class Iraq extends Country {
    public Iraq(UniteNations nations) {
        super(nations);
    }

    public void declare(String message) {
        nations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
