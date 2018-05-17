package com.xp.design.strategy;

/**
 * @类描述：打折
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 16:18
 * @修改人：
 * @修改时间：2018/5/16 0016 16:18
 * @修改备注：
 */
public class CashRebate implements CashSuper {
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptMoney(double money) {
        return money * rebate;
    }
}
