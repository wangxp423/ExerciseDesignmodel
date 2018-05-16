package com.xp.design.simplefactory;

/**
 * @类描述：运算操作父类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:15
 * @修改人：
 * @修改时间：2018/5/16 0016 11:15
 * @修改备注：
 */
public class Operation {
    private double numA;
    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
