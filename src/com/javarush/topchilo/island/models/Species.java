package com.javarush.topchilo.island.models;

public enum Species {
    WOLF ("Волк", 50, 3, 30, 8, 4),
    BOA ("Удав", 15, 1, 30,3, 1.5),
    FOX ("Лиса", 8, 2, 30, 2, 1),
    EAGLE ("Орел", 6, 3, 20, 1, 0.5),
    BEAR ("Медведь", 500, 2, 5, 80, 40),

    RABBIT ("Кролик", 2, 2, 150, 0.45 ,0.225 ),
    HORSE ("Лошадь", 400, 4, 20, 60, 30),
    DEER ("Олень", 300, 4, 20, 50, 25),
    MOUSE ("Мышь", 0.05, 1, 500, 0.01, 0.005),
    GOAT ("Коза", 60, 3, 140, 10, 5),
    SHEEP ("Овца", 70, 3, 140, 15, 7.50),
    BOAR ("Кабан", 400, 2, 50, 50, 25),
    BUFFALO ("Буйвол", 700, 3, 10, 100, 50),
    DUCK ("Утка", 1, 4, 200, 0.15, 0.075),
    CATERPILLAR ("Гусеница", 0.01, 0, 1000, 0, 0),

    PLANT ("Растение", 1, 0, 200, 0 ,0);

    private final String name;
    private final double weight;
    private final int maxSpeed;
    private final int maxCountInCell;
    private final double weightForSatiety;
    private double satiety;

    Species(String name, double weight, int maxSpeed, int maxCountInCell, double weightForSatiety, double satiety) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.maxCountInCell = maxCountInCell;
        this.weightForSatiety = weightForSatiety;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxCountInCell() {
        return maxCountInCell;
    }

    public double getWeightForSatiety() {
        return weightForSatiety;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }
}


