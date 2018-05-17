package com.xp.design.strategy;

/**
 * @类描述：返利
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 16:18
 * @修改人：
 * @修改时间：2018/5/16 0016 16:18
 * @修改备注：
 */
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double condition, double mreturn) {
        this.moneyCondition = condition;
        this.moneyReturn = mreturn;
    }

    @Override
    public double acceptMoney(double money) {
        if (money >= moneyCondition) {
            return money - moneyReturn;
        }
        return money;
    }
}
