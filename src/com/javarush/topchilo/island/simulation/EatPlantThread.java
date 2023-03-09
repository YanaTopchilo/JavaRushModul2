package com.javarush.topchilo.island.simulation;


public class EatPlantThread extends Thread {
    Simulation simulation;

    public EatPlantThread(Simulation simulation) {
        this.simulation = simulation;
    }

    @Override
    public void run() {
        for (int i = 0; i < Simulation.COUNT_OF_STEPS; i++) {
                simulation.animalsEatPlant();
                try {
                    Thread.sleep(simulation.DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        }
    }

