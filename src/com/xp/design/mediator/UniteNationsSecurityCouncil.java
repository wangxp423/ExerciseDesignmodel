package com.xp.design.mediator;

/**
 * @类描述：联合国安理会
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/5 0005 17:09
 * @修改人：
 * @修改时间：2018/6/5 0005 17:09
 * @修改备注：
 */
public class UniteNationsSecurityCouncil extends UniteNations {
    private Usa usa;
    private Iraq iraq;

    public void setUsa(Usa usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (country instanceof Usa) {
            iraq.getMessage(message);
        } else if (country instanceof Iraq) {
            usa.getMessage(message);
        }
    }
}
