package com.xp.design.interpreter;

/**
 * @类描述：音符类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 15:15
 * @修改人：
 * @修改时间：2018/6/6 0006 15:15
 * @修改备注：
 */
public class Note extends Expression {
    @Override
    public void excute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
            default:
                break;
        }
        System.out.print(note + " ");
    }
}
