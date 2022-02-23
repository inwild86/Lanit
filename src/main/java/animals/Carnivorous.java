package animals;
import food.*;
import food.WrongFoodException;
public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

    @Override
    public void  eat(Food food) throws WrongFoodException{

            //проверяет, что бы тип еды был Meat
            if (food instanceof Meat){
                if(hunger < 2) {
                hunger += getSatiety();
                satiety+=7;
            System.out.println(getName()  + " Поел: " + food.getClass().getSimpleName());}
                else { System.out.println(getName() + " не голоден");} }
         else {
                throw new WrongFoodException("плотоядное животное не будет есть траву");
            }


}}

        /*
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

    }*/

