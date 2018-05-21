package com.xp.design.decorate;

/**
 * @类描述：装饰类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/21 0021 11:16
 * @修改人：
 * @修改时间：2018/5/21 0021 11:16
 * @修改备注：
 */
public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (null != component) {
            component.Operation();
        }
    }
}
