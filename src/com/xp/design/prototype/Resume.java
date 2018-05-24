package com.xp.design.prototype;

/**
 * @类描述：简历模板
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/24 0024 10:31
 * @修改人：
 * @修改时间：2018/5/24 0024 10:31
 * @修改备注：
 */
public class Resume implements Cloneable {
    private String name, sex, age, timeArea, company;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience work) {
        workExperience = work.clone();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
        workExperience.workDate = timeArea;
        workExperience.company = company;
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
//        System.out.println("工作经历：" + timeArea + " " + company);
        System.out.println("工作经历：" + workExperience.workDate + " " + workExperience.company);
    }

    @Override
    public Resume clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
            resume.workExperience = this.workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
}
