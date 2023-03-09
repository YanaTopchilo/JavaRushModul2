package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Sheep extends Herbivore{

    public Sheep() {
        super(Species.SHEEP);
    }

    public Sheep(Cell cell) {
        super(cell, Species.SHEEP);
    }

    @Override
    public Animal born() {
        return new Sheep(getCell());
    }

}
