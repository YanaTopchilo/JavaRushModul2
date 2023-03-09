package com.javarush.topchilo.island.models;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int x;
    private int y;
    private List<Animal> animalsInCell = new ArrayList<>();
    private List<Plant> plantsInCell = new ArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cell(int x, int y, List<Animal> animalsInCell, List<Plant> plantsInCell) {
        this.x = x;
        this.y = y;
        this.animalsInCell = animalsInCell;
        this.plantsInCell = plantsInCell;
    }



    public int countOfSpecies (Species species) {
        int count = 0;
        for (int i =0; i<animalsInCell.size(); i++){
             if (animalsInCell.get(i).equals(species))
                 count++;
        }
        return  count;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Animal> getAnimalsInCell() {
        return animalsInCell;
    }

    public void setAnimalsInCell(List<Animal> animalsInCell) {
        this.animalsInCell = animalsInCell;
    }

    public List<Plant> getPlantsInCell() {
        return plantsInCell;
    }

    public void setPlantsInCell(List<Plant> plantsInCell) {
        this.plantsInCell = plantsInCell;
    }


    @Override
    public String toString() {
        return " {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}



