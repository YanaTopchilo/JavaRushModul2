package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Predator;
import com.javarush.topchilo.island.models.Species;

public class Bear extends Predator {

    public Bear() {
        super(Species.BEAR);
    }

    public Bear(Cell cell) {
        super(cell, Species.BEAR);
    }

    @Override
    public int chanceOfEat(Species species) {
        int chance;
        switch (species){
            case BOA  -> chance = 80;
            case HORSE  -> chance = 40;
            case DEER -> chance = 80;
            case RABBIT  -> chance = 80;
            case MOUSE -> chance = 90;
            case GOAT -> chance = 70;
            case SHEEP -> chance = 70;
            case BOAR -> chance = 50;
            case BUFFALO -> chance = 20;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Bear(getCell());
    }
}
