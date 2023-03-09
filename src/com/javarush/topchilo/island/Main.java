
package com.javarush.topchilo.island;

import com.javarush.topchilo.island.simulation.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

       Simulation island = new Simulation();
       MoveThread moveThread = new MoveThread(island);   // животные двигаются
       moveThread.start();
       EatAnimalThread eatThread = new EatAnimalThread(island);  // хищники едят
       eatThread.start();
       EatPlantThread eatPlantThread = new EatPlantThread(island); // травоядные едят
       eatPlantThread .start();
       PlantThread plantThread = new PlantThread(island);    // трава растет
       plantThread.start();
       BreedThread breedThread = new BreedThread(island);   // животные размножаются
       breedThread.start();

       moveThread.join();
       eatThread.join();
       plantThread.join();
       breedThread.join();

       island.getStatistic();            // итоговая статистика

    }
}

