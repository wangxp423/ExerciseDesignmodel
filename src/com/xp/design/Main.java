package com.xp.design;

import com.xp.design.abstractfactory.IDbFactory;
import com.xp.design.abstractfactory.IDbUser;
import com.xp.design.abstractfactory.SqlDbFactory;
import com.xp.design.abstractfactory.User;
import com.xp.design.adapter.Center;
import com.xp.design.adapter.Forwards;
import com.xp.design.adapter.Player;
import com.xp.design.adapter.TranslatorAdapter;
import com.xp.design.bridge.*;
import com.xp.design.builder.FatPerson;
import com.xp.design.builder.PersonDirector;
import com.xp.design.command.*;
import com.xp.design.composite.ConcreteCompany;
import com.xp.design.composite.FinanceDepartment;
import com.xp.design.composite.HrDepartment;
import com.xp.design.decorate.ConcreteComponent;
import com.xp.design.decorate.ConcreteDecoratorA;
import com.xp.design.decorate.ConcreteDecoratorB;
import com.xp.design.decorate.person.*;
import com.xp.design.facade.Facade;
import com.xp.design.flyweight.Website;
import com.xp.design.flyweight.WebsiteFactory;
import com.xp.design.interpreter.*;
import com.xp.design.iterator.ConcreteAggregate;
import com.xp.design.iterator.Iterator;
import com.xp.design.mediator.Iraq;
import com.xp.design.mediator.UniteNationsSecurityCouncil;
import com.xp.design.mediator.Usa;
import com.xp.design.memento.RoleGame;
import com.xp.design.memento.RoleStateCaretaker;
import com.xp.design.methodfactory.IFactory;
import com.xp.design.methodfactory.SubOperationFactory;
import com.xp.design.observer.boss.NbaObserver;
import com.xp.design.observer.boss.Secretary;
import com.xp.design.observer.boss.StockObserver;
import com.xp.design.observer.system.DataManager;
import com.xp.design.observer.system.ObserverA;
import com.xp.design.observer.system.ObserverB;
import com.xp.design.prototype.Resume;
import com.xp.design.proxy.Girl;
import com.xp.design.proxy.Proxy;
import com.xp.design.responsibility.CommonManager;
import com.xp.design.responsibility.GeneralManager;
import com.xp.design.responsibility.MajordomoManager;
import com.xp.design.responsibility.Request;
import com.xp.design.simplefactory.Operation;
import com.xp.design.simplefactory.OperationFactory;
import com.xp.design.singleton.Singleton;
import com.xp.design.state.Work;
import com.xp.design.strategy.CashContext;
import com.xp.design.strategy.CashRebate;
import com.xp.design.strategy.CashReturn;
import com.xp.design.templatemethod.StudentA;
import com.xp.design.templatemethod.StudentB;
import com.xp.design.templatemethod.TestPaper;
import com.xp.design.visitor.*;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:01
 * @修改人：
 * @修改时间：2018/5/16 0016 11:01
 * @修改备注：
 */
public class Main {
    //简单工厂模式
    public static void simpleFactory() {
        Operation operation = OperationFactory.creatOperation("/");
        operation.setNumA(1);
        operation.setNumB(2);
        System.out.println("getResult = " + operation.getResult());
    }

    //工厂方法模式
    public static void methodFactory() {
//        IFactory factory = new AddOperationFactory();//加法工厂
        IFactory factory = new SubOperationFactory();//减法工厂
        //修改运算只需要修改 new 的工厂即可
        Operation oper = factory.createOperation();
        oper.setNumA(2);
        oper.setNumB(3);
        System.out.println("getResult = " + oper.getResult());
    }

    //抽象工厂模式
    public static void abstractFactory() {
        User user = new User();
        IDbFactory dbFactory = new SqlDbFactory();
//        IDbFactory dbFactory = new AccessDbFactory();
        IDbUser dbUser = dbFactory.createDbUser();
        dbUser.inster(user);
        dbUser.getUser(user.id);
    }

    //策略模式
    public static void strategyModel() {
        CashContext context;
        context = new CashContext(new CashRebate(0.5));
        context.excute(100);
        context = new CashContext(new CashReturn(300, 100));
        context.excute(500);
    }

    //装饰模式
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

    //代理模式
    public static void proxyModel() {
        Girl girl = new Girl();
        girl.name = "娇娇";
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

    //原型模式
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

    //模板方法模式
    public static void templateMethod() {
        TestPaper studentA = new StudentA();
        studentA.TestQuestionA();
        studentA.TestQuestionB();
        TestPaper studentB = new StudentB();
        studentB.TestQuestionA();
        studentB.TestQuestionB();
    }

    //外观模式
    public static void facadeModel() {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

    //建造者模式
    public static void builderModel() {
        //构建一个瘦子
//        ThinPerson person = new ThinPerson();
        //构建一个胖子
        FatPerson person = new FatPerson();
        PersonDirector director = new PersonDirector(person);
        director.creatPerson();
    }

    //观察者模式
    public static void observerModel() {
        Secretary secretary = new Secretary();
        NbaObserver nbaObserver = new NbaObserver("老魏", secretary);
        StockObserver stockObserver = new StockObserver("小菜", secretary);
        secretary.attach(nbaObserver);
        secretary.attach(stockObserver);
        secretary.setAction("老板回来了!!");
        secretary.notifyObserver();

        //java自带观察者
        DataManager manager = new DataManager();
        ObserverA a = new ObserverA(manager);
        ObserverB b = new ObserverB(manager);
        manager.setDataChange();
    }

    //状态模式
    public static void stateModel() {
        Work work = new Work();
        work.setHour(9);
        work.working();
        work.setHour(10);
        work.working();
        work.setHour(12);
        work.working();
        work.setHour(13);
        work.working();
        work.setHour(14);
        work.working();
        work.setHour(17);
        work.setFinish(false);
        work.working();
        work.setHour(19);
//        work.setFinish(true);
        work.working();
        work.setHour(22);
        work.working();
    }

    //适配器模式
    public static void adapterModel() {
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Center("卡佩拉");
        m.defense();
        Player y = new TranslatorAdapter("姚明");
        y.defense();
    }

    //备忘录模式
    public static void mementoModel() {
        //大战boss前
        RoleGame role = new RoleGame();
        System.out.println("战斗前：");
        role.initState();
        role.displayState();
        //保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());
        //大战boss
        System.out.println("战斗后：");
        role.fight();
        role.displayState();
        //恢复状态
        System.out.println("恢复后：");
        role.recoverState(caretaker.getMemento());
        role.displayState();
    }

    //组合模式
    public static void compositeModel() {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company1 = new ConcreteCompany("上海华东分公司");
        company1.add(new HrDepartment("华东分公司人力资源部"));
        company1.add(new FinanceDepartment("华东分公司财务部"));
        root.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("南京办事处");
        company2.add(new HrDepartment("南京办事处人力资源部"));
        company2.add(new FinanceDepartment("南京办事处财务部"));
        company1.add(company2);

        ConcreteCompany company3 = new ConcreteCompany("杭州办事处");
        company3.add(new HrDepartment("杭州办事处人力资源部"));
        company3.add(new FinanceDepartment("杭州办事处财务部"));
        company1.add(company3);

        System.out.println("结构图:");
        root.display(1);

        System.out.println("\n职责：");
        root.lineDuty();
    }

    //迭代器模式
    public static void iteratorModel() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("大鸟");
        aggregate.add("小菜");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公交内部员工");
        aggregate.add("小偷");
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + "请买票！");
            iterator.next();
        }
    }

    //单例模式
    public static void singletonModel() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("两个对象是相同的实例！");
        }
    }

    //桥接模式
    public static void bridgeModel() {
        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }

    //命令模式
    public static void commandModel() {
        Barbecuer barbecuer = new Barbecuer();
        Command muttonCommand1 = new BakeMuttonCommand(barbecuer);
        Command muttonCommand2 = new BakeMuttonCommand(barbecuer);
        Command chickenCommand = new BakeChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();
        //顾客点餐
        waiter.setOrder(muttonCommand1);
        waiter.setOrder(muttonCommand2);
        waiter.setOrder(chickenCommand);
        waiter.notifyOrders();
    }

    //职责链模式
    public static void responsibilityModel() {
        CommonManager jingli = new CommonManager("经理");
        MajordomoManager zongjian = new MajordomoManager("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jingli.requestApplication(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(4);
        jingli.requestApplication(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("小菜加薪");
        request2.setNumber(500);
        jingli.requestApplication(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜加薪");
        request3.setNumber(1000);
        jingli.requestApplication(request3);
    }

    //中介者模式
    public static void mediatorModel() {
        UniteNationsSecurityCouncil unsc = new UniteNationsSecurityCouncil();
        Usa usa = new Usa(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setUsa(usa);
        unsc.setIraq(iraq);

        usa.declare("不准研制核武器，否则要发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略！");
    }

    //享元模式
    public static void flyweightModel() {
        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsiteCategory("产品展示");
        website1.Use(new com.xp.design.flyweight.User("小菜"));

        Website website2 = factory.getWebsiteCategory("产品展示");
        website2.Use(new com.xp.design.flyweight.User("大鸟"));

        Website website3 = factory.getWebsiteCategory("产品展示");
        website3.Use(new com.xp.design.flyweight.User("娇娇"));

        Website website4 = factory.getWebsiteCategory("博客");
        website4.Use(new com.xp.design.flyweight.User("老顽童"));

        Website website5 = factory.getWebsiteCategory("博客");
        website5.Use(new com.xp.design.flyweight.User("桃谷六仙"));

        Website website6 = factory.getWebsiteCategory("博客");
        website6.Use(new com.xp.design.flyweight.User("南海鳄神"));

        System.out.println("得到网站分类总数：" + factory.getWebsitCount());
    }

    //解释器模式
    public static void interpreterModel() {
        PlayContext context = new PlayContext();
        System.out.println("上海滩：");
        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //访问者模式
    public static void visitorModel() {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        Success success = new Success();
        structure.display(success);

        Failing failing = new Failing();
        structure.display(failing);

        Amativeness amativeness = new Amativeness();
        structure.display(amativeness);
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
//        facadeModel();
        //建造者模式
//        builderModel();
        //观察者模式
//        observerModel();
        //状态模式
//        stateModel();
        //适配器模式
//        adapterModel();
        //备忘录模式
//        mementoModel();
        //组合模式
//        compositeModel();
        //迭代器模式
//        iteratorModel();
        //单例模式
//        singletonModel();
        //桥接模式
//        bridgeModel();
        //命令模式
//        commandModel();
        //职责链模式
//        responsibilityModel();
        //中介者模式
//        mediatorModel();
        //享元模式
//        flyweightModel();
        //解释器模式
//        interpreterModel();
        //访问者模式
        visitorModel();
    }
}
