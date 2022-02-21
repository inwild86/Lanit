package animals;

public class Puma extends Carnivorous  implements Voice, Run{
    public Puma(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + " хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " бежит");
        }
    }
    @Override
    public String getVoice() {
        if (hunger <= 0){
            return getName() + "хочет есть";
        } else {
            hunger --;
            return getName() + " мррр мрррр";
        }
    }

    public String getNameAnimal() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

}
