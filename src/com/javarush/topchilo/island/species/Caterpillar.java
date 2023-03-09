package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Caterpillar extends Herbivore{

    public Caterpillar() {
        super(Species.CATERPILLAR);
    }

    public Caterpillar(Cell cell) {
        super(cell, Species.CATERPILLAR);
    }

    @Override
    public Animal born() {
        return new Caterpillar(getCell());
    }

    @Override
    public void move() {
    }
}
