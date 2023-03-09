package com.javarush.topchilo.island.simulation;

import com.javarush.topchilo.island.models.*;
import com.javarush.topchilo.island.species.*;

public class Simulation {
    // Размеры острова
    public static final int X = 10;
    public static final int Y = 10;
    public static final int COUNT_OF_STEPS = 2; // число ходов
    // задержка между ходами
    public static final int DELAY = 3;  // лучше не менять. При 3 нагляднее
    // Количество растений
    public static final int COUNT_OF_PLANT = 100;
    //Количество животных
    public static final int COUNT_OF_WOLF = 30;
    public static final int COUNT_OF_BOA = 10;
    public static final int COUNT_OF_FOX = 20;
    public static final int COUNT_OF_EAGLE = 30;
    public static final int COUNT_OF_BEAR = 10;
    public static final int COUNT_OF_RABBIT = 50;
    public static final int COUNT_OF_HORSE = 15;
    public static final int COUNT_OF_DEER = 15;
    public static final int COUNT_OF_MOUSE = 50;
    public static final int COUNT_OF_GOAT = 15;
    public static final int COUNT_OF_SHEEP = 30;
    public static final int COUNT_OF_BOAR = 30;
    public static final int COUNT_OF_BUFFALO = 15;
    public static final int COUNT_OF_DUCK = 10;
    public static final int COUNT_OF_CATERPILLAR = 20;

    public Simulation() {
        new Island(X, Y);
        for (int i=0; i < COUNT_OF_PLANT; i++)
            new Plant();
        for (int i=0; i < COUNT_OF_WOLF; i++)
            new Wolf();
        for (int i=0; i < COUNT_OF_RABBIT; i++)
            new Rabbit();
        for (int i=0; i < COUNT_OF_BOA; i++)
            new Boa();
        for (int i=0; i < COUNT_OF_FOX; i++)
            new Fox();
        for (int i=0; i < COUNT_OF_HORSE; i++)
            new Horse();
        for (int i=0; i < COUNT_OF_MOUSE; i++)
            new Mouse();
        for (int i=0; i < COUNT_OF_EAGLE; i++)
            new Eagle();
        for (int i=0; i < COUNT_OF_DEER; i++)
            new Deer();
        for (int i=0; i < COUNT_OF_GOAT; i++)
            new Goat();
        for (int i=0; i < COUNT_OF_SHEEP; i++)
            new Sheep();
        for (int i=0; i < COUNT_OF_BEAR; i++)
            new Bear();
        for (int i=0; i < COUNT_OF_BOAR; i++)
            new Boar();
        for (int i=0; i < COUNT_OF_DEER; i++)
            new Deer();
        for (int i=0; i < COUNT_OF_BUFFALO; i++)
            new Buffalo();
        for (int i=0; i < COUNT_OF_DUCK; i++)
            new Duck();
        for (int i=0; i < COUNT_OF_CATERPILLAR; i++)
            new Caterpillar();
        System.out.println("Создан остров размером " +
                X + "x" + Y + " с " + Island.plants.size() +
                " растениями,  " + countOfHerbivor() + " травоядными и "
                + countOfPredtor() + " хищниками" );
    }


    public int countOfHerbivor () {
        int count = 0;
        for (int i =0; i<Island.animals.size(); i++){
            if (Island.animals.get(i) instanceof Herbivore)
                count++;
        }
        return  count;
    }

    public int countOfPredtor() {
        int count = 0;
        for (int i =0; i<Island.animals.size(); i++){
            if (Island.animals.get(i) instanceof Predator)
                count++;
        }
        return  count;
    }

    public synchronized void animalsMove (){
        for (int i=0; i < Island.animals.size(); i++) {
            Island.animals.get(i).move();
        }
    }

    public synchronized void animalsEatPlant (){
        for (int j = 0; j < Island.animals.size(); j++) {
            if (Island.animals.get(j) instanceof Herbivore)
                Island.animals.get(j).eat();
    }}

    public synchronized void animalsEatAnimal (){
        for (int j = 0; j < Island.animals.size(); j++) {
            if (Island.animals.get(j) instanceof Predator)
                Island.animals.get(j).eat();
        }}


    public synchronized void animalsBreed (){
        for (int i=0; i < Island.animals.size(); i++) {
            Island.animals.get(i).breed();
        }
    }

    public void getStatistic(){
        System.out.println(
                "На острове сейчас: " + Island.plants.size() +
                        " растений, " + countOfHerbivor() + " травоядных и "
                        + countOfPredtor() + " хищника" );
    }
}

