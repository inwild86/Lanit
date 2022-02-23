package animals;
import food.*;
public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }


    @Override
    public void  eat(Food food) throws WrongFoodException{
        try{
            //проверяет, что бы тип еды был Meat
            if (food instanceof Meat)
                throw new WrongFoodException ("Ошибка, не та еда", food);
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());
        } catch (WrongFoodException e){
            System.out.println(e + "  плотоядное животное не будет есть траву");
        }
        }


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
}
