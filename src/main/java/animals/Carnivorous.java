package animals;
import animals.*;
import food.*;
public abstract class Carnivorous extends Animal {

    @Override
    public void  eat(Food food) {
        if (food instanceof Meat){
            if(hunger < 2) {
                hunger += getSatiety();
                satiety +=7;
                System.out.println(getNameAnimal() + " плотоядное животное - ему нравится " + ((Meat) food).getNameFood() + " теперь сыт");
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }

        } else {
            System.out.println(getNameAnimal() + " плотоядное животное не будет есть траву");
        }

    }


}
