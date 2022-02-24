package animals;
import food.*;
import model.*;

public abstract  class Animal {
 public String name;
    protected int satiety;
    public int hunger;

    Animal(String name) {
        this.name = name;
    }
    public abstract void eat(Food food) throws WrongFoodException;
    //public abstract String getNameAnimal();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }
    public abstract Size getSize();
    public void setSatiety(int satiety) {
        this.satiety += satiety;
    }

}
