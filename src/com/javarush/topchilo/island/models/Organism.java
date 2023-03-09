package com.javarush.topchilo.island.models;

import  java.util.Random;

public abstract class Organism {
    private Cell cell;
    private double weight;
    private String name;
    private Species species;
    public int x, y;
    public int indexOfCell;

    public Organism(Species species) {
        this.species = species;
         x = (new Random().nextInt(Island.xLenght)) + 1;
         y = (new Random().nextInt(Island.yLenght)) + 1;
         indexOfCell = ((Island.xLenght) * (y-1) + x) - 1;
        this.cell =  Island.cellList.get(indexOfCell);
        this.weight = species.getWeight();
        this.name = species.getName() + hashCode();

    }

    public Organism(Cell cell, Species species) {
        this.cell = cell;
        this.weight =species.getWeight();
        this.name = species.getName() + hashCode();
        this.species = species;
        x = cell.getX();
        y = cell.getY();
        indexOfCell = ((Island.xLenght) * (y-1) + x) - 1;
    }

    public abstract void die();

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return   name +
                ", cell=" + cell +
                ", weight=" + weight +
                ", species=" + species +
                '}';
    }
}
