package com.xp.design;

import com.xp.design.decorate.ConcreteComponent;
import com.xp.design.decorate.ConcreteDecoratorA;
import com.xp.design.decorate.ConcreteDecoratorB;
import com.xp.design.decorate.person.*;
import com.xp.design.methodfactory.IFactory;
import com.xp.design.methodfactory.SubOperationFactory;
import com.xp.design.proxy.Girl;
import com.xp.design.proxy.Proxy;
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
        //工厂方法模式
//        IFactory factory = new AddOperationFactory();//加法工厂
        IFactory factory = new SubOperationFactory();//减法工厂
        //修改运算只需要修改 new 的工厂即可
        Operation oper = factory.createOperation();
        oper.setNumA(2);
        oper.setNumB(3);
        System.out.println("getResult = " + oper.getResult());
        //策略模式
        CashContext context;
        context = new CashContext(new CashRebate(0.5));
        context.excute(100);
        context = new CashContext(new CashReturn(300, 100));
        context.excute(500);
        //装饰模式
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();

        ConcretePersonA a = new ConcretePersonA();
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        sneakers.decorate(a);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);//装饰过程
        tShirts.show();
        ConcretePersonB b = new ConcretePersonB();
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        leatherShoes.decorate(b);
        tie.decorate(leatherShoes);
        suit.decorate(tie); //装饰过程
        suit.show();
        //代理模式
        Girl girl = new Girl();
        girl.name = "娇娇";
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
