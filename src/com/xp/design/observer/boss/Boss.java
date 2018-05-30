package com.xp.design.observer.boss;

/**
 * @类描述：老板类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 11:24
 * @修改人：
 * @修改时间：2018/5/30 0030 11:24
 * @修改备注：
 */
public class Boss extends Subject {
    public void setAction(String action) {
        subjectStatus = action;
    }
}
