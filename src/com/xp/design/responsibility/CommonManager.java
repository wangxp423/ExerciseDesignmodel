package com.xp.design.responsibility;

/**
 * @类描述：经理
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 15:48
 * @修改人：
 * @修改时间：2018/6/5 0005 15:48
 * @修改备注：
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name + "：" + request.getRequestContent() + "，数量：" + request.getNumber() + "，被批准！");
        } else {
            if (null != superior) {
                superior.requestApplication(request);
            }
        }
    }
}
