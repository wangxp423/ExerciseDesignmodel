package com.xp.design.state;

/**
 * @类描述：工作
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/31 0031 10:47
 * @修改人：
 * @修改时间：2018/5/31 0031 10:47
 * @修改备注：
 */
public class Work {
    private double hour;
    private State current;
    private boolean isFinish;

    public Work() {
        current = new ForenoonState();
    }

    public void working() {
        current.workStatus(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
