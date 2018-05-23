package com.xp.design.abstractfactory;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/23 0023 15:40
 * @修改人：
 * @修改时间：2018/5/23 0023 15:40
 * @修改备注：
 */
public class AccessDbUser implements IDbUser {
    @Override
    public void inster(User user) {
        System.out.println("用Access数据库插入数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("用Access数据库获取数据");
        return null;
    }
}
