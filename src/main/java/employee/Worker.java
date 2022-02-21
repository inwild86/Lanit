package employee;
import animals.*;
import food.*;

public class Worker {

    public void feed(Animal animal, Food food){
    animal.eat(food);
        System.out.println( animal.getNameAnimal()+ " покормлен");
    }
    public void getVoice(Voice  animal) {
        System.out.println(animal.getVoice());
    }

}
