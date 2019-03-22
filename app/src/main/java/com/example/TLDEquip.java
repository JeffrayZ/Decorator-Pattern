package com.example;

/**
 * 屠龙刀是武器的一种，具备攻击力，不具备防御力
 * */
public class TLDEquip implements IArmEquip {
    @Override
    public String description() {
        return "屠龙刀";
    }

    @Override
    public int caculateAttack() {
        return 5;
    }
}
