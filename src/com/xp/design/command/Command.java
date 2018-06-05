package com.xp.design.command;

/**
 * @类描述：抽象命令
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 11:19
 * @修改人：
 * @修改时间：2018/6/5 0005 11:19
 * @修改备注：
 */
public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void excuteCommand();
}
