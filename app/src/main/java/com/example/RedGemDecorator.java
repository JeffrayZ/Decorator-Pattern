package com.example;

/**
 * 红宝石又是宝石的一种
 * <p>
 * 一个宝石只能被安装在一个装备上，但是一个装备可以有好多宝石
 */
public class RedGemDecorator implements IArmEquip {
    /**
     * 每个装饰品维护一个装备
     * <p>
     * 也就是一个宝石对应一个装备
     */
    private IArmEquip equip;

    public RedGemDecorator(IArmEquip equip) {
        this.equip = equip;
    }

    @Override
    public String description() {
        return equip.description() + "安装了红宝石";
    }

    @Override
    public int caculateAttack() {
        // 红宝石加10点攻击力
        return 10 + equip.caculateAttack();
    }
}
