package com.xp.design.decorate.person;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/21 0021 11:41
 * @修改人：
 * @修改时间：2018/5/21 0021 11:41
 * @修改备注：
 */
public class Tie extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("领带");
    }
}
