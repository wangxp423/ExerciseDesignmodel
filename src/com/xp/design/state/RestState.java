package com.xp.design.state;

/**
 * @类描述：下班状态
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:59
 * @修改人：
 * @修改时间：2018/5/31 0031 10:59
 * @修改备注：
 */
public class RestState extends State {
    @Override
    public void workStatus(Work wrok) {
        System.out.println("当前时间：" + wrok.getHour() + "点，下班回家！");
    }
}
