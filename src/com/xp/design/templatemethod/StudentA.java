package com.xp.design.templatemethod;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/25 0025 10:41
 * @修改人：
 * @修改时间：2018/5/25 0025 10:41
 * @修改备注：
 */
public class StudentA extends TestPaper {
    public StudentA() {
        System.out.println("学生A开始答题：");
    }

    @Override
    public String TestAnswerA() {
        return "C";
    }

    @Override
    public String TestAnswerB() {
        return "D";
    }
}
