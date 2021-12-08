package com.mandiri.entity;

public class Monster extends Punchable {

    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public void gettingPunch(Integer damagePuncher) {
        this.hp = this.hp - damagePuncher;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
