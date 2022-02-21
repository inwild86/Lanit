package animals;
import food.*;

public abstract  class Animal {
 String name;
    protected int satiety = 5;
    public int hunger = satiety;

    public abstract void eat(Food food);


    public abstract String getNameAnimal();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSatiety() {
        return satiety;
    }

}
