package com.xp.design.simplefactory;

/**
 * @类描述：简单工厂 创建类对象
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:25
 * @修改人：
 * @修改时间：2018/5/16 0016 11:25
 * @修改备注：
 */
public class OperationFactory {
    public static Operation creatOperation(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
