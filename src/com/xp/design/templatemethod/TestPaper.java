package com.xp.design.templatemethod;

/**
 * @类描述：考试测试卷
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/25 0025 10:32
 * @修改人：
 * @修改时间：2018/5/25 0025 10:32
 * @修改备注：
 */
public abstract class TestPaper {
    public void TestQuestionA() {
        System.out.println("你最喜欢的编程语言[ ]    A：JAVA  B：C++  C：IOS  D：Python");
        System.out.println("我的答案：" + TestAnswerA());
    }

    public void TestQuestionB() {
        System.out.println("你最头疼的编程语言[ ]    A：JAVA  B：C++  C：IOS  D：Python");
        System.out.println("我的答案：" + TestAnswerB());
    }

    public abstract String TestAnswerA();

    public abstract String TestAnswerB();
}
