package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Buffalo extends Herbivore{

    public Buffalo() {
        super(Species.BUFFALO);
    }

    public Buffalo(Cell cell) {
        super(cell, Species.BUFFALO);
    }

    @Override
    public Animal born() {
        return new Buffalo(getCell());
    }

}
