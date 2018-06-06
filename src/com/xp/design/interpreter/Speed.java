package com.xp.design.interpreter;

/**
 * @类描述：音速类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 15:15
 * @修改人：
 * @修改时间：2018/6/6 0006 15:15
 * @修改备注：
 */
public class Speed extends Expression {
    @Override
    public void excute(String key, double value) {
        String speed = "";
        if (value < 500) {
            speed = "低速";
        } else if (value >= 1000) {
            speed = "慢速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
