package com.xp.design.memento;

/**
 * @类描述：游戏角色
 * @创建人：Wangxiaopan
 * @创建时间：2018/6/1 0001 11:42
 * @修改人：
 * @修改时间：2018/6/1 0001 11:42
 * @修改备注：
 */
public class RoleGame {
    //保存游戏进度的备忘录
    private int vit; //生命力
    private int atk; //攻击力
    private int def; //防御力

    //初始化状态
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    //保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复状态
    public void recoverState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    //显示状态
    public void displayState() {
        System.out.println("角色当前状态：");
        System.out.println("生命力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
    }

    //战斗
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }
}
