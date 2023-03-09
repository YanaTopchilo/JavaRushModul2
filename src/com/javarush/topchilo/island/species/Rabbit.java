package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.*;

public class Rabbit extends Herbivore{

    public Rabbit() {
        super(Species.RABBIT);
    }

    public Rabbit(Cell cell) {
        super(cell, Species.RABBIT);
    }

    @Override
    public Animal born() {
        return new Rabbit (getCell());
    }

}
