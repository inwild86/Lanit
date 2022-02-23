package animals;
import food.*;


public abstract class Herbivore extends Animal {

    Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException{
        try{//проверяет, что бы тип еды был Grass
            if (food instanceof Grass)
                throw new WrongFoodException("Ошибка, не та еда!", food);
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());

    }catch (WrongFoodException e) {
            System.out.println(e + " травоядное животное, не ест мясо");
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