package com.javarush.topchilo.island.models;

import java.util.Random;

public abstract  class Animal extends Organism {
   private Sex sex;
   private int maxSpeed;
   private int maxCountInCell;
   private double weightForSatiety;
   private double satiety;

    public Animal(Species species) {
        super(species);
        int i =  new Random().nextInt(2);
        if (i == 1) {
            sex = Sex.FEMALE ;
        }
        else  sex = Sex.MALE;
        this.maxSpeed = species.getMaxSpeed();
        this.maxCountInCell = species.getMaxCountInCell();
        this.weightForSatiety = species.getWeightForSatiety();
        this.satiety = species.getSatiety();
        Island.cellList.get(indexOfCell).getAnimalsInCell().add(Animal.this);
        Island.animals.add(Animal.this);
    }

    public Animal(Cell cell, Species species) {
        super(cell, species);
        int i =  new Random().nextInt(2);
        if (i == 1) {
            sex = Sex.FEMALE ;
        }
        else  sex = Sex.MALE;
        this.maxSpeed = species.getMaxSpeed();
        this.maxCountInCell = species.getMaxCountInCell();
        this.weightForSatiety = species.getWeightForSatiety();
        this.satiety = species.getSatiety();
        Island.cellList.get(indexOfCell).getAnimalsInCell().add(Animal.this);
        Island.animals.add(Animal.this);
    }

   public synchronized void  breed (){   //размножение
       Animal child;
        if (sex.equals(Sex.FEMALE) &
                Island.cellList.get(indexOfCell).countOfSpecies(getSpecies())
                        < maxCountInCell) {
        for (int i = 0; i<getCell().getAnimalsInCell().size(); i++){
              Animal couple = getCell().getAnimalsInCell().get(i);
                if (couple.getSex().equals(Sex.MALE)) {
                   child = born();
                   i = getCell().getAnimalsInCell().size()+1;
                   System.out.println(getName() + " произвела на свет " + child.getName() );
                }

            }
        }
    }

    public abstract Animal born (); // Рождение потомства
    public abstract void eat();     // Питание

    @Override  // Животное умирают от голода
    public void die () {
        if (satiety <= 0) {
            Island.animals.remove(Animal.this);
            getCell().getAnimalsInCell().remove(Animal.this);
            System.out.println(getName() + " погиб от голода");
        }
    }

   public synchronized void move(){         // Движение
       int speed = new Random().nextInt(maxSpeed) + 1 ;  // Задаем скорость
       int direction = new Random().nextInt(4);  // Задаем направление
       int x = getCell().getX();
       int y = getCell().getY();
       int indexOfCell = ((Island.xLenght) * (y-1) + x) - 1; // Рассчитываем индекс текущей ячейки в списке
       switch (direction){
           case 0  -> // вправо
                 x = getCell().getX() + speed ;
           case 1  -> // влево
               x = getCell().getX() - speed;
           case 2 -> // вниз
               y = getCell().getY() + speed;
           case 3 -> // вверх
               y = getCell().getY() - speed;
       }
       if (x<=1)
           x = 1;
       if (x > Island.xLenght)
           x = Island.xLenght;
       if (y<=1)
           y = 1;
       if (y > Island.yLenght)
           y = Island.yLenght;
       int newIndex = ((Island.xLenght) * (y-1) + x) - 1;   // Рассчитываем индекс новой ячейки в списке
       if (Island.cellList.get(newIndex).countOfSpecies(getSpecies())
          < maxCountInCell ){
       // удаляем из списка животных прежней ячейки
       Island.cellList.get(indexOfCell).getAnimalsInCell().remove(Animal.this);
       // присваиваем новое положение
       setCell(Island.cellList.get(newIndex) );
       // добавляем в список животных новой ячейки
       Island.cellList.get(newIndex).getAnimalsInCell().add(Animal.this);
       if (newIndex == indexOfCell )
          System.out.println(getName() + " не переместился. Некуда идти "  );   // в выбранном направлении край острова
       else System.out.println(getName() + " переместился в ячейку " + getCell() );}
       else System.out.println(getName() + " не переместился. Слишком тесно "  ); // слишком много животных в ячейке
       if (newIndex != indexOfCell )
           setSatiety(getSatiety() - (getSatiety()*0.1*speed));
       die();
   }


   public Sex getSex() {
      return sex;
   }

   public void setSex(Sex sex) {

      this.sex = sex;
   }



   public int getMaxSpeed() {

      return maxSpeed;
   }

   public void setMaxSpeed(int maxSpeed) {

       this.maxSpeed = maxSpeed;
   }

   public int getMaxCountInCell() {

       return maxCountInCell;
   }

   public void setMaxCountInCell(int maxCountInCell) {

       this.maxCountInCell = maxCountInCell;
   }

   public double getWeightForSatiety() {

       return weightForSatiety;
   }

   public void setWeightForSatiety(double weightForSatiety) {

      this.weightForSatiety = weightForSatiety;
   }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

  // public boolean isKilled() {
     //   return isKilled;
   // }

  //  public void setKilled(boolean killed) {
    //    isKilled = killed;
   // }

    @Override
    public String toString() {
        return getName() + "  "  + getCell()+
                " пол =" + sex + ", вес=" + getWeight() +
                ", сытость=" + satiety +
                '}';
    }
}

