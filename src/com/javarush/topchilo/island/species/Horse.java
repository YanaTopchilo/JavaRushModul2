package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Horse extends Herbivore{

    public Horse() {
        super(Species.HORSE);
    }

    public Horse(Cell cell) {
        super(cell, Species.HORSE);
    }

    @Override
    public Animal born() {
        return new Horse(getCell());
    }

}
