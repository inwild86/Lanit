package animals;
import food.*;


public abstract class Herbivore extends Animal {

    Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException{

            if (food instanceof Grass) {
                if(hunger < 2) {
                hunger += getSatiety();
                satiety+=5;
                System.out.println(getName()+" Поел: " + food.getClass().getSimpleName());}
                else { System.out.println(getName() + " не голоден");}
            }
 else {

                throw new WrongFoodException("травоядное животное, не ест мясо");
        }
}}
 /*   public void eat(Food food) {
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

    }*/