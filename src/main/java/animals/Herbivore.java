package animals;
import food.*;
import employee.*;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            if(hunger < 2) {
                hunger += getSatiety();
                satiety+=5;
                System.out.println(getNameAnimal() + " травоядное животное, покормлен " + ((Grass) food).getNameFood());
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }

        } else {
            System.out.println(getNameAnimal() + " травоядное животное, не ест мясо");
        }

    }
}
