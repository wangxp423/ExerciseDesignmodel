package com.xp.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述：对象结构
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 16:54
 * @修改人：
 * @修改时间：2018/6/6 0006 16:54
 * @修改备注：
 */
public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
