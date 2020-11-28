/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hernandez.zombiewar;

import java.util.Random;

/**
 *
 * @author Rachel
 */
public class ZombieWar {

    static Survivor[] survivors;
    static Zombie[] zombies;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        survivors = generateSurvivors();
        zombies = generateZombies();

        //I added the class startWar to clean up the Main Class
        startWar newWar = new startWar(survivors, zombies);

        newWar.Start();
    }

    /**
     *
     * @return
     */
    static Survivor[] generateSurvivors() {
        Random rand = new Random();
        int randSurvivors = rand.nextInt(9) + 1; // +1 to prevent zero bound (1-10 survivors)
        survivors = new Survivor[randSurvivors];
        int numSoldiers = rand.nextInt(randSurvivors);
        int numTeachers = rand.nextInt(randSurvivors - numSoldiers);
        int numChildren = randSurvivors - numSoldiers - numTeachers;

        int counter = 0;
        for (int x = 0; x < numSoldiers; x++) {
            survivors[counter] = new Soldier(x + 1); // +1 so ID starts at 1 versus zero
            counter++;
        }
        for (int x = 0; x < numTeachers; x++) {
            survivors[counter] = new Teacher(x + 1);
            counter++;
        }
        for (int x = 0; x < numChildren; x++) {
            survivors[counter] = new Child(x + 1);
            counter++;
        }

        return survivors;
    }

    /**
     *
     * @return
     */
    static Zombie[] generateZombies() {
        Random rand = new Random();
        int numZombies = rand.nextInt(9) + 1;
        zombies = new Zombie[numZombies];
        int numCommonInfected = rand.nextInt(numZombies);
        int numTanks = numZombies - numCommonInfected;

        int counter = 0;
        for (int x = 0; x < numCommonInfected; x++) {
            zombies[counter] = new CommonInfected(x + 1); // +1 so ID starts at 1 versus zero
            counter++;
        }
        for (int x = 0; x < numTanks; x++) {
            zombies[counter] = new Tank(x + 1);
            counter++;
        }

        return zombies;
    }    
   

   
}
