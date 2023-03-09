package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Predator;
import com.javarush.topchilo.island.models.Species;

public class Boa extends Predator {

    public Boa() {
        super(Species.BOA);
    }

    public Boa(Cell cell) {
        super(cell, Species.BOA);
    }

    @Override
    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case FOX  -> chance = 15;
            case RABBIT  -> chance = 20;
            case MOUSE -> chance = 40;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Boa(getCell());
    }
}
