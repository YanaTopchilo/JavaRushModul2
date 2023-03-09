package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.*;

import java.util.Random;

import static com.javarush.topchilo.island.models.Species.CATERPILLAR;

public class Duck extends Herbivore {

    public Duck() {
        super(Species.DUCK);
    }

    public Duck(Cell cell) {
        super(cell, Species.DUCK);
    }

    @Override
    public synchronized void eat() {
        if (getSatiety() < getWeightForSatiety()) {
            for (int i = 0; i < getCell().getPlantsInCell().size(); i++) {
                if (getSatiety() < getWeightForSatiety()){
                Plant plant = getCell().getPlantsInCell().get(i);
                double oldSatiety = getSatiety();
                double newSatiety = oldSatiety + plant.getWeight();
                if (newSatiety > getWeightForSatiety())
                    newSatiety = getWeightForSatiety();
                setSatiety(newSatiety);
                if (newSatiety != oldSatiety)
                    plant.setWeight(newSatiety - oldSatiety);
                System.out.println(getName() + " погрыз " + plant.getName());
                plant.die();
            }}

            for (int i = 0; i < getCell().getAnimalsInCell().size(); i++) {
                int j = new Random().nextInt(100) + 1;
                Animal food = getCell().getAnimalsInCell().get(i);
                int chance = chanceOfEat(food.getSpecies());
                if (j <= chance) {
                    double newSatiety = getSatiety() + food.getWeight();
                    if (newSatiety > getWeightForSatiety())
                        newSatiety = getWeightForSatiety();
                    setSatiety(newSatiety);
                  //  food.setKilled(true);
                   Island.animals.remove(food);
                    getCell().getAnimalsInCell().remove(food);
                    System.out.println(getName() + " съел " + food.getName());
                }
            }
        }     }


    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case CATERPILLAR  -> chance = 90;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Duck(getCell());
    }
}
