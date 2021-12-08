package com.mandiri.entity;

public class Hero extends Punchable {

    public String name;
    public Integer hp;
    public Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void punch(Punchable opponent){
        opponent.gettingPunch(this.damage);
        //opponent.hp = opponent.hp - this.damage;
    }

    @Override
    public void gettingPunch (Integer damagePuncher){
        this.hp = this.hp - damagePuncher;
    }

    //overloading = 2 method yang sama dengan parameter berbeda
    public void punch(Hero opponent, String comment){

    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }

}
