package com.xp.design.responsibility;

/**
 * @类描述：申请
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 15:42
 * @修改人：
 * @修改时间：2018/6/5 0005 15:42
 * @修改备注：
 */
public class Request {
    private String requestType; //请求类型
    private String requestContent; //请求内容
    private int number; //请求数量

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
