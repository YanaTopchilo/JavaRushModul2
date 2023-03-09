package com.javarush.topchilo.island.species;

import com.javarush.topchilo.island.models.Animal;
import com.javarush.topchilo.island.models.Cell;
import com.javarush.topchilo.island.models.Herbivore;
import com.javarush.topchilo.island.models.Species;

public class Mouse extends Herbivore{

    public Mouse() {
        super(Species.MOUSE);
    }

    public Mouse(Cell cell) {
        super(cell, Species.MOUSE);
    }

    @Override
    public Animal born() {
        return new Mouse(getCell());
    }

}
