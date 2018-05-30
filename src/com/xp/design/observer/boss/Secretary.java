package com.xp.design.observer.boss;

/**
 * @类描述：前台秘书类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/30 0030 11:07
 * @修改人：
 * @修改时间：2018/5/30 0030 11:07
 * @修改备注：
 */
public class Secretary extends Subject {
    public void setAction(String action) {
        subjectStatus = action;
    }
}
