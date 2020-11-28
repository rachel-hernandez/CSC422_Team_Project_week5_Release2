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
public interface ICharacters {
      
    
    /**
     * 
     * @return 
     */
    public int getHealth();
    
    /**
     * 
     * @param attack 
     */
    public void setHealth(int attack);
    
    
    /**
     * 
     * @return 
     */
    public int getAttack();
    
    
    
    /**
     * 
     * @param health 
     */
    public void isDead(int health);
    
    
}
