package employee;
import animals.*;
import food.*;
import model.*;

public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);

        } catch (Exception e) {
            System.out.println("Не получилось покормить");
            e.printStackTrace();
        }

    }
    public void getVoice(Voice animal) {
        System.out.println(animal.getVoice());
    }
}
