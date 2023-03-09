package com.javarush.topchilo.island.models;

public class Plant extends Organism  {

    public Plant () {
        super(Species.PLANT);
        Island.cellList.get(indexOfCell).getPlantsInCell().add(Plant.this);
        Island.plants.add(Plant.this);
    }


    @Override
    public void die() {
      if (getWeight() <= 0) {
            Island.plants.remove(Plant.this);
            getCell().getPlantsInCell().remove(Plant.this);
            System.out.println(getName() + " погиб");
       }
    }
}

