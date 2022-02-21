package animals;
import animals.*;
import food.*;


public abstract class Herbivore extends Animal {

    @Override
    public int eat(Food food) {
        if (food instanceof Grass){
            if(hunger < 2) {
                hunger += getSatiety();
                System.out.println(getNameAnimal() + " травоядное животное, покормлен " + ((Grass) food).getNameFood());
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        } else {
            System.out.println(getNameAnimal() + " травоядное животное, не ест мясо");
        }
        return hunger;
    }
}
