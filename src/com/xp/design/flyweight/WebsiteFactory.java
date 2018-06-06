package com.xp.design.flyweight;

import java.util.Hashtable;

/**
 * @类描述：工厂
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 10:16
 * @修改人：
 * @修改时间：2018/6/6 0006 10:16
 * @修改备注：
 */
public class WebsiteFactory {
    private Hashtable<String, Website> flyweight = new Hashtable();

    public Website getWebsiteCategory(String key) {
        if (!flyweight.containsKey(key)) {
            flyweight.put(key, new ConcreteWebsite(key));
        }
        return flyweight.get(key);
    }

    public int getWebsitCount() {
        return flyweight.size();
    }
}
