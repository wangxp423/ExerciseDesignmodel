package com.xp.design.state;

/**
 * @类描述：下午状态
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:59
 * @修改人：
 * @修改时间：2018/5/31 0031 10:59
 * @修改备注：
 */
public class AfternoonState extends State {
    @Override
    public void workStatus(Work wrok) {
        if (wrok.getHour() < 17) {
            System.out.println("当前时间：" + wrok.getHour() + "点，下午状态还不错，继续努力！");
        } else {
            wrok.setCurrent(new EveningState());
            wrok.working();
        }
    }
}
