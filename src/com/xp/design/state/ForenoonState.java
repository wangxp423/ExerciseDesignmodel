package com.xp.design.state;

/**
 * @类描述：上午状态
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:59
 * @修改人：
 * @修改时间：2018/5/31 0031 10:59
 * @修改备注：
 */
public class ForenoonState extends State {
    @Override
    public void workStatus(Work wrok) {
        if (wrok.getHour() < 12) {
            System.out.println("当前时间：" + wrok.getHour() + "点，上午工作，精神百倍！");
        } else {
            wrok.setCurrent(new NoonState());
            wrok.working();
        }
    }
}
