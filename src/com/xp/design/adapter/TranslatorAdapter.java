package com.xp.design.adapter;

/**
 * @类描述：翻译适配器，给外籍球员做翻译
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/1 0001 10:22
 * @修改人：
 * @修改时间：2018/6/1 0001 10:22
 * @修改备注：
 */
public class TranslatorAdapter extends Player {
    private ForeignCenter foreignCenter;

    public TranslatorAdapter(String name) {
        super(name);
        foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.yAttack();
    }

    @Override
    public void defense() {
        foreignCenter.yDefense();
    }
}
