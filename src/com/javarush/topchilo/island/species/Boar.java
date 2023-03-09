package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Boar extends Herbivore{

    public Boar() {
        super(Species.BOAR);
    }

    public Boar(Cell cell) {
        super(cell, Species.BUFFALO);
    }

    @Override
    public Animal born() {
        return new Boar(getCell());
    }

}
