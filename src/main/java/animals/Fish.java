package animals;

public class Fish extends Herbivore  implements Swim{
    public Fish(String name) {
        this.name = name;
    }
    public Fish() {

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        if (hunger <= 0){
            System.out.println(getName() + "хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " плавает");
        }
    }

    @Override
    public String getNameAnimal() {
        return getName();
    }

}
