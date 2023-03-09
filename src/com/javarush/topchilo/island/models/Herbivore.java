package com.javarush.topchilo.island.models;


public abstract class Herbivore extends Animal {

    public Herbivore(Species species) {
        super(species);
    }

    public Herbivore(Cell cell, Species species) {
        super(cell, species);
    }

    @Override
    public synchronized void eat() {
            if (getSatiety() < getWeightForSatiety())
            for (int i = 0; i < getCell().getPlantsInCell().size(); i++) {
                if (getSatiety() < getWeightForSatiety()) {
                Plant food = getCell().getPlantsInCell().get(i);
                    double oldSatiety =  getSatiety();
                    double newSatiety = oldSatiety + food.getWeight();
                    if (newSatiety > getWeightForSatiety())
                        newSatiety = getWeightForSatiety();
                    setSatiety(newSatiety);
                    if (newSatiety != oldSatiety)
                    food.setWeight(food.getWeight() - (newSatiety - oldSatiety));
                    System.out.println(getName() + " погрыз " + food.getName() );
                    food.die();           //растение погибнет, если вес станет <=0
            }
        }
    }

}