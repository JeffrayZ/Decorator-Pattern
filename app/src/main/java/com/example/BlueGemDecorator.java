package com.example;

/**
 * 蓝宝石又是宝石的一种
 * <p>
 * 一个宝石只能被安装在一个装备上，但是一个装备可以有好多宝石
 */
public class BlueGemDecorator implements IArmEquip {
    /**
     * 每个装饰品维护一个装备
     * <p>
     * 也就是一个宝石对应一个装备
     */
    private IArmEquip equip;

    public BlueGemDecorator(IArmEquip equip) {
        this.equip = equip;
    }

    @Override
    public String description() {
        return equip.description() + "安装了蓝宝石";
    }

    @Override
    public int caculateAttack() {
        // 蓝宝石加5点攻击力
        return 5 + equip.caculateAttack();
    }
}
