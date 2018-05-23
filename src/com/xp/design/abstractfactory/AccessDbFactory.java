package com.xp.design.abstractfactory;

/**
 * @类描述：应用常量类
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/23 0023 15:42
 * @修改人：
 * @修改时间：2018/5/23 0023 15:42
 * @修改备注：
 */
public class AccessDbFactory implements IDbFactory {
    @Override
    public IDbUser createDbUser() {
        return new AccessDbUser();
    }
}
