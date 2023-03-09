package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Deer extends Herbivore{

    public Deer() {
        super(Species.DEER);
    }

    public Deer(Cell cell) {
        super(cell, Species.DEER);
    }

    @Override
    public Animal born() {
        return new Deer(getCell());
    }

}
