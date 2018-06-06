package com.xp.design.interpreter;

/**
 * @类描述：表达式类
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/6 0006 15:03
 * @修改人：
 * @修改时间：2018/6/6 0006 15:03
 * @修改备注：
 */
public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        } else {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            excute(playKey, playValue);
        }
    }

    public abstract void excute(String key, double value);
}
