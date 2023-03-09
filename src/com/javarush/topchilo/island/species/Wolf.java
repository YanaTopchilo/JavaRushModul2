package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.*;

public class Wolf extends Predator {

    public Wolf() {
        super(Species.WOLF);
    }

    public Wolf(Cell cell) {
        super(cell, Species.WOLF);
    }

    @Override
    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case RABBIT  -> chance = 60;
            case HORSE  -> chance = 10;
            case DEER -> chance = 15;
            case MOUSE -> chance = 80;
            case GOAT -> chance = 60;
            case SHEEP -> chance = 70;
            case BOAR -> chance = 15;
            case BUFFALO -> chance = 10;
            case DUCK -> chance = 40;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Wolf(getCell());
    }
}
