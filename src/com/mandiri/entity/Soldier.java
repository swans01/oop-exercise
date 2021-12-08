package com.mandiri.entity;

public class Soldier extends Punchable {

    private Integer hp;
    private Integer damage;

    public Soldier(Integer hp, Integer damage) {
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public void gettingPunch(Integer damagePuncher) {
        this.hp = this.hp - damagePuncher;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
