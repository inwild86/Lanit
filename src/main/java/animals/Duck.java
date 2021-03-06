package animals;
import food.*;
import model.*;


public class Duck extends Herbivore implements Fly, Run, Swim, Voice{
    public Duck(String name) {
        super (name);
    }

    @Override
    public void fly() {
        if (hunger <= 0){
            System.out.println(getName() + " хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " летит");
        }
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + " хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " гуляет");
        }
    }

    @Override
    public void swim() {
        if (hunger <= 0){
            System.out.println(getName() + " хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " плавает");
        }
    }

    @Override
    public String getVoice() {
        if (hunger <= 0){
            return getName() + "хочет есть";
        } else {
            hunger --;
            return getName() + "кря-кря";
        }
    }
    @Override
    public Size getSize() {
        Size s = Size.SMALL;
        return s;

   /* public String getNameAnimal() {
        return getName();
    }*/

   /* public void setName(String name) {
        this.name = name;
    }*/

    }
}
