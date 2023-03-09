package com.javarush.topchilo.island.simulation;


public class EatAnimalThread extends Thread {
    Simulation simulation;

    public EatAnimalThread(Simulation simulation) {
        this.simulation = simulation;
    }

    @Override
    public void run() {
        for (int i = 0; i < Simulation.COUNT_OF_STEPS; i++) {
                 simulation.animalsEatAnimal();
                try {
                    Thread.sleep(simulation.DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        }
    }

