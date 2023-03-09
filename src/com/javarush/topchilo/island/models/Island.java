package com.javarush.topchilo.island.models;

import java.util.*;

public class Island {
    public static int xLenght;
    public static int yLenght;
    public static List<Cell> cellList = new ArrayList<>();
    public static  List <Animal> animals = new ArrayList<>();
    public static  List <Plant> plants = new ArrayList<>();

    public Island(int xLenght, int yLenght) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        for (int i = 1; i<=yLenght; i++){
            for (int j = 1; j<=xLenght; j++){
                Cell cell = new Cell(j, i);
                cellList.add(cell);
            }
        }
    }

    @Override
    public String toString() {
        return "Island{" +
                "xLenght=" + xLenght +
                ", yLenght=" + yLenght +
                ", cellList=" + cellList +
                '}';
    }
}

