package com.javarush.topchilo.island.simulation;


public class BreedThread extends Thread {
    Simulation simulation;

    public BreedThread(Simulation simulation) {
        this.simulation = simulation;
    }

    @Override
    public void run() {
        for (int i = 0; i < Simulation.COUNT_OF_STEPS; i++) {
                simulation.animalsBreed ();
                try {
                    Thread.sleep(simulation.DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        }
    }

