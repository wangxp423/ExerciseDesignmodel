package com.xp.design.responsibility;

/**
 * @类描述：管理者类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 15:44
 * @修改人：
 * @修改时间：2018/6/5 0005 15:44
 * @修改备注：
 */
public abstract class Manager {
    protected String name; //管理者名字
    protected Manager superior; //管理者上级

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager manager) {
        this.superior = manager;
    }

    public abstract void requestApplication(Request request); //申请请求
}
