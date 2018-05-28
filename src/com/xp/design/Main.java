package com.xp.design;

import com.xp.design.abstractfactory.IDbFactory;
import com.xp.design.abstractfactory.IDbUser;
import com.xp.design.abstractfactory.SqlDbFactory;
import com.xp.design.abstractfactory.User;
import com.xp.design.decorate.ConcreteComponent;
import com.xp.design.decorate.ConcreteDecoratorA;
import com.xp.design.decorate.ConcreteDecoratorB;
import com.xp.design.decorate.person.*;
import com.xp.design.facade.Facade;
import com.xp.design.methodfactory.IFactory;
import com.xp.design.methodfactory.SubOperationFactory;
import com.xp.design.prototype.Resume;
import com.xp.design.proxy.Girl;
import com.xp.design.proxy.Proxy;
import com.xp.design.simplefactory.Operation;
import com.xp.design.simplefactory.OperationFactory;
import com.xp.design.strategy.CashContext;
import com.xp.design.strategy.CashRebate;
import com.xp.design.strategy.CashReturn;
import com.xp.design.templatemethod.StudentA;
import com.xp.design.templatemethod.StudentB;
import com.xp.design.templatemethod.TestPaper;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:01
 * @修改人：
 * @修改时间：2018/5/16 0016 11:01
 * @修改备注：
 */
public class Main {
    public static void simpleFactory() {
        Operation operation = OperationFactory.creatOperation("/");
        operation.setNumA(1);
        operation.setNumB(2);
        System.out.println("getResult = " + operation.getResult());
    }

    public static void methodFactory() {
//        IFactory factory = new AddOperationFactory();//加法工厂
        IFactory factory = new SubOperationFactory();//减法工厂
        //修改运算只需要修改 new 的工厂即可
        Operation oper = factory.createOperation();
        oper.setNumA(2);
        oper.setNumB(3);
        System.out.println("getResult = " + oper.getResult());
    }

    public static void abstractFactory() {
        User user = new User();
        IDbFactory dbFactory = new SqlDbFactory();
//        IDbFactory dbFactory = new AccessDbFactory();
        IDbUser dbUser = dbFactory.createDbUser();
        dbUser.inster(user);
        dbUser.getUser(user.id);
    }

    public static void strategyModel() {
        CashContext context;
        context = new CashContext(new CashRebate(0.5));
        context.excute(100);
        context = new CashContext(new CashReturn(300, 100));
        context.excute(500);
    }

    public static void decorateModel() {
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
    }

    public static void proxyModel() {
        Girl girl = new Girl();
        girl.name = "娇娇";
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

    public static void prototypeModel() {
        //基础原型模式
        Resume resume = new Resume("小菜");
        resume.setPersonInfo("男", "27");
        resume.setWorkExperience("1998 - 2000", "XX公司");
        Resume resumeB = resume.clone();
        resumeB.setWorkExperience("1998 - 2000", "XX企业");
        Resume resumeC = resume.clone();
        resumeC.setPersonInfo("男", "24");
        resume.display();
        resumeB.display();
        resumeC.display();
        //原型模式浅复制和深复制
        Resume qresume = new Resume("小菜");
        qresume.setPersonInfo("男", "27");
        qresume.setWorkExperience("1998 - 2000", "XX公司");
        Resume qresumeB = qresume.clone();
        qresumeB.setWorkExperience("1998 - 2000", "XX企业");
        Resume qresumeC = qresume.clone();
        qresumeC.setPersonInfo("男", "24");
        qresume.display();
        qresumeB.display();
        qresumeC.display();
    }

    public static void templateMethod() {
        TestPaper studentA = new StudentA();
        studentA.TestQuestionA();
        studentA.TestQuestionB();
        TestPaper studentB = new StudentB();
        studentB.TestQuestionA();
        studentB.TestQuestionB();
    }

    public static void facadeModel() {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

    public static void main(String[] args) {
        //简单工厂模式
//        simpleFactory();
        //工厂方法模式
//        methodFactory();
        //抽象工厂模式
//       abstractFactory();
        //策略模式
//        strategyModel();
        //装饰模式
//        decorateModel();
        //代理模式
//        proxyModel();
        //原型模式
//        prototypeModel();
        //模板方法模式
//        templateMethod();
        //外观模式
        facadeModel();
    }
}
