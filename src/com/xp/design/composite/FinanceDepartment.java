package com.xp.design.composite;

/**
 * @类描述：财务部
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 10:59
 * @修改人：
 * @修改时间：2018/6/4 0004 10:59
 * @修改备注：
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depthChar("- ", depth) + name);
    }

    @Override
    public void lineDuty() {
        System.out.println(name + "   公司财务收支管理");
    }
}
