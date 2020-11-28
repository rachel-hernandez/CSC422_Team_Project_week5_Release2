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
class CommonInfected extends Zombie {

    

    public CommonInfected(int id) {
        this.id = id;
        health = 30;
        attack = 5;
        name = "CommonInfected";

    }

    @Override
    protected int getID() {
        return id;
        
    }

    @Override
    public int getHealth() {
        return this.health;
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
    public void attack(Survivor survivor, int attack) {
        survivor.setHealth(attack);
    }
    
    @Override
    public String getName() {
        return name + " " + id;
    }
}