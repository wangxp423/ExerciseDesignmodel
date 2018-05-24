package com.xp.design.prototype;

/**
 * @类描述：工作经历
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/24 0024 10:54
 * @修改人：
 * @修改时间：2018/5/24 0024 10:54
 * @修改备注：
 */
public class WorkExperience implements Cloneable {
    public String workDate, company;

    @Override
    public WorkExperience clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;
    }
}
