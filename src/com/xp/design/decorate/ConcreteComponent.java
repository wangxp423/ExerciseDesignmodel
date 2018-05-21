package com.xp.design.decorate;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/21 0021 11:15
 * @修改人：
 * @修改时间：2018/5/21 0021 11:15
 * @修改备注：
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
