package com.xp.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述：具体子公司
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 10:47
 * @修改人：
 * @修改时间：2018/6/4 0004 10:47
 * @修改备注：
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(depthChar("- ", depth) + name);
        for (Company component : children) {
            component.display(depth + 2);
        }
    }

    @Override
    public void lineDuty() {
        for (Company component : children) {
            component.lineDuty();
        }
    }
}
