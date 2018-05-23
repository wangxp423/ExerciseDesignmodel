package com.xp.design.methodfactory;

import com.xp.design.simplefactory.Operation;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/23 0023 10:43
 * @修改人：
 * @修改时间：2018/5/23 0023 10:43
 * @修改备注：
 */
public interface IFactory {
    //工厂方法模式 基于 简单工厂中的加减乘除运算来
    Operation createOperation(); //创建一个运算
}
