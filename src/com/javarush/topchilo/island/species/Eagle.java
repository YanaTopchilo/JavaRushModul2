package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Predator;
import com.javarush.topchilo.island.models.Species;

public class Eagle extends Predator {

    public Eagle() {
        super(Species.EAGLE);
    }

    public Eagle(Cell cell) {
        super(cell, Species.EAGLE);
    }

    @Override
    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case FOX  -> chance = 10;
            case RABBIT  -> chance = 90;
            case MOUSE -> chance = 90;
            case DUCK  -> chance = 80;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Eagle(getCell());
    }
}
