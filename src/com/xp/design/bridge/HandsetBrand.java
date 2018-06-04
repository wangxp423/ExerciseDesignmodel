package com.xp.design.bridge;

/**
 * @类描述：手机品牌
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/4 0004 17:44
 * @修改人：
 * @修改时间：2018/6/4 0004 17:44
 * @修改备注：
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
