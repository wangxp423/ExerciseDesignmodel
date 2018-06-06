package com.xp.design.interpreter;

/**
 * @类描述：音调类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 15:15
 * @修改人：
 * @修改时间：2018/6/6 0006 15:15
 * @修改备注：
 */
public class Scale extends Expression {
    @Override
    public void excute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                break;
        }
        System.out.print(scale + " ");
    }
}
