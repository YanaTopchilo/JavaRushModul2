package com.javarush.topchilo.island.simulation;

import com.javarush.topchilo.island.models.Island;
import com.javarush.topchilo.island.models.Plant;


public class PlantThread extends Thread {
    Simulation simulation;

    public PlantThread(Simulation simulation) {
        this.simulation = simulation;
    }

    @Override
    public void run() {
        for (int i = 0; i < Simulation.COUNT_OF_STEPS; i++) {
            for (int j=0; j < Simulation.COUNT_OF_PLANT; j++) {
                if (Island.plants.size() < Simulation.COUNT_OF_PLANT)
                    new Plant();
                try {
                    Thread.sleep(simulation.DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        }
    }
}
