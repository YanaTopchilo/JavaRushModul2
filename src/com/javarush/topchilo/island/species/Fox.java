package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Predator;
import com.javarush.topchilo.island.models.Species;

public class Fox extends Predator {

    public Fox() {
        super(Species.FOX);
    }

    public Fox(Cell cell) {
        super(cell, Species.FOX);
    }

    @Override
    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case RABBIT  -> chance = 70;
            case MOUSE -> chance = 90;
            case DUCK -> chance = 60;
            case CATERPILLAR -> chance = 40;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Fox(getCell());
    }
}
