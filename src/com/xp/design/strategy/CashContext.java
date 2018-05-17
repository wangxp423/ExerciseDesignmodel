package com.xp.design.strategy;

/**
 * @类描述：上下文类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 16:24
 * @修改人：
 * @修改时间：2018/5/16 0016 16:24
 * @修改备注：
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper mSuper) {
        this.cashSuper = mSuper;
    }

    public void excute(double money) {
        System.out.println("金额 = " + cashSuper.acceptMoney(money));
    }
}
