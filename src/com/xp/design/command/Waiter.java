package com.xp.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述：服务员
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 11:24
 * @修改人：
 * @修改时间：2018/6/5 0005 11:24
 * @修改备注：
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员：鸡翅没有了，请点其他烧烤！");
        } else {
            orders.add(command);
            System.out.println("日志：增加订单。时间：" + System.currentTimeMillis());
        }
    }

    public void removeOrder(Command command) {
        orders.remove(command);
    }

    public void notifyOrders() {
        for (Command command : orders) {
            command.excuteCommand();
        }
    }
}
