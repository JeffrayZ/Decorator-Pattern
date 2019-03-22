package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /**
         * 屠龙刀安装一个蓝宝石
         * */
        IEquip equip = new BlueGemDecorator(new TLDEquip());
        // 屠龙刀安装了蓝宝石
        System.out.println(equip.description() + ">>>攻击力变成了" + ((BlueGemDecorator) equip).caculateAttack());


        /**
         * 屠龙刀安装一个蓝宝石,一个红宝石
         * */
        IEquip equip1 = new BlueGemDecorator(new RedGemDecorator(new TLDEquip()));
        // 屠龙刀安装了红宝石安装了蓝宝石
        System.out.println(equip1.description() + ">>>攻击力变成了" + ((BlueGemDecorator) equip1).caculateAttack());


        aaa();
    }

    /**
     * 移出一个list里面的指定数据
     * */
    public static void aaa() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(10);
        list.add(12);
        list.add(11);
        list.add(13);


        for (int i :
                list) {
            System.out.println(i);
        }


//        for(int i = 0; i < list.size();i++){
//            if(list.get(i) % 2 == 0){
//                list.remove(i);
//                i--;
//            }
//        }

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        /*Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer % 2 == 0) {
                iterator.remove();
            }
        }*/

        System.out.println("=================================");
        System.out.println(list.size());
        System.out.println("=================================");
        for (Integer i :
                list) {
            System.out.println(i);
        }
    }
}
