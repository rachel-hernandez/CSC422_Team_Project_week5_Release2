/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hernandez.zombiewar;

/**
 *
 * @author Rachel
 */
class Teacher extends Survivor {

    

    public Teacher(int id) {
        this.id = id;
        health = 50;
        attack = 5;
        name = "Teacher";
    }

    @Override
    protected int getID() {
        return id;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int attack) {
        this.health = health - attack;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void attack(Zombie zombie, int attack) {
        zombie.setHealth(attack);
    }
    
    @Override
     public String getName(){
        return name + " " + id;
    }
}