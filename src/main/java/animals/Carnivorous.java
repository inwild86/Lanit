package animals;
import animals.*;
import food.*;
public abstract class Carnivorous extends Animal {

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            if(hunger < 2) {
                hunger += getSatiety();
                System.out.println(getNameAnimal() + " плотоядное животное - ему нравится " + ((Meat) food).getNameFood() + " теперь сыт");
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        } else {
            System.out.println(getNameAnimal() + " плотоядное животное не будет есть траву");
        }
        return hunger;
    }


}
