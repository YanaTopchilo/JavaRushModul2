package com.javarush.topchilo.island.models;

import java.util.Random;

public abstract class Predator extends Animal {

    int chance;

    public Predator(Species species) {
        super(species);
    }

    public Predator(Cell cell, Species species) {
        super(cell, species);
    }

    public int chanceOfEat (Species species) {
        return chance;
    }

    @Override
    public synchronized void eat() {
           if (getSatiety() < getWeightForSatiety()){
            for (int i =0; i<getCell().getAnimalsInCell().size(); i++){
                if (getSatiety() < getWeightForSatiety()){
                int j =  new Random().nextInt(100) + 1;
                Animal food = getCell().getAnimalsInCell().get(i);
                chance = chanceOfEat (food.getSpecies());
                if (j <= chance){
                    double newSatiety = getSatiety() + food.getWeight();
                    if (newSatiety > getWeightForSatiety())
                        newSatiety = getWeightForSatiety();
                    setSatiety(newSatiety);
                    Island.animals.remove(food);
                    getCell().getAnimalsInCell().remove(food);
                    System.out.println(getName() + " съел " + food.getName() );
                }
            }}
        }
    }
}
