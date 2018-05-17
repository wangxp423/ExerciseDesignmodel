package com.xp.design;

import com.xp.design.simplefactory.Operation;
import com.xp.design.simplefactory.OperationFactory;
import com.xp.design.strategy.CashContext;
import com.xp.design.strategy.CashRebate;
import com.xp.design.strategy.CashReturn;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:01
 * @修改人：
 * @修改时间：2018/5/16 0016 11:01
 * @修改备注：
 */
public class Main {
    public static void main(String[] args) {
        //简单工厂模式
        Operation operation = OperationFactory.creatOperation("/");
        operation.setNumA(1);
        operation.setNumB(2);
        System.out.println("getResult = " + operation.getResult());
        //策略模式
        CashContext context;
        context = new CashContext(new CashRebate(0.5));
        context.excute(100);
        context = new CashContext(new CashReturn(300, 100));
        context.excute(500);
    }
}
