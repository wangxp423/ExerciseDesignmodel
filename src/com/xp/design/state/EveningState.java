package com.xp.design.state;

/**
 * @类描述：晚间状态
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:59
 * @修改人：
 * @修改时间：2018/5/31 0031 10:59
 * @修改备注：
 */
public class EveningState extends State {
    @Override
    public void workStatus(Work wrok) {
        if (wrok.isFinish()) {
            wrok.setCurrent(new RestState());
            wrok.working();
        } else {
            if (wrok.getHour() < 21) {
                System.out.println("当前时间：" + wrok.getHour() + "点，加班哦，疲惫至极！");
            } else {
                wrok.setCurrent(new SleepingState());
                wrok.working();
            }
        }
    }
}
