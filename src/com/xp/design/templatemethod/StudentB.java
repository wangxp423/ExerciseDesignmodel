package com.xp.design.templatemethod;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/25 0025 10:41
 * @修改人：
 * @修改时间：2018/5/25 0025 10:41
 * @修改备注：
 */
public class StudentB extends TestPaper {
    public StudentB() {
        System.out.println("学生B开始答题：");
    }

    @Override
    public String TestAnswerA() {
        return "A";
    }

    @Override
    public String TestAnswerB() {
        return "D";
    }
}
