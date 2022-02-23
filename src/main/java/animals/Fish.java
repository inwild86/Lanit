package animals;

import model.*;

public class Fish extends Herbivore implements Swim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        if (hunger <= 0) {
            System.out.println(getName() + "хочет есть");
        } else {
            hunger--;
            System.out.println(getName() + " плавает");
        }
    }

    @Override
    public Size getSize() {
        Size s = Size.MEDIUM;
        return s;
    }

}
