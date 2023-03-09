package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Goat extends Herbivore{

    public Goat() {
        super(Species.GOAT);
    }

    public Goat(Cell cell) {
        super(cell, Species.GOAT);
    }

    @Override
    public Animal born() {
        return new Goat(getCell());
    }

}
