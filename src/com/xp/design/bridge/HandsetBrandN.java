package com.xp.design.bridge;

/**
 * @类描述：手机品牌N
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 17:46
 * @修改人：
 * @修改时间：2018/6/4 0004 17:46
 * @修改备注：
 */
public class HandsetBrandN extends HandsetBrand {
    @Override
    public void run() {
        System.out.print("手机品牌N,");
        soft.run();
    }
}
