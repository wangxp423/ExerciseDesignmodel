package com.xp.design.command;

/**
 * @类描述：烤鸡翅命令
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 11:22
 * @修改人：
 * @修改时间：2018/6/5 0005 11:22
 * @修改备注：
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }
}
