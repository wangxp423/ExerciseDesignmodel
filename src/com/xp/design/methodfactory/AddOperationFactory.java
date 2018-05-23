package com.xp.design.methodfactory;

import com.xp.design.simplefactory.Operation;
import com.xp.design.simplefactory.OperationAdd;

/**
 * @类描述：加法运算工厂
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/23 0023 10:46
 * @修改人：
 * @修改时间：2018/5/23 0023 10:46
 * @修改备注：
 */
public class AddOperationFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
