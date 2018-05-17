package com.xp.design.strategy;

/**
 * @类描述：正常模式
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 16:10
 * @修改人：
 * @修改时间：2018/5/16 0016 16:10
 * @修改备注：
 */
public class CashNormal implements CashSuper {
    public CashNormal() {
    }

    @Override
    public double acceptMoney(double money) {
        return money;
    }
}
