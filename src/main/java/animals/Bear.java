package animals;

public class Bear extends Carnivorous implements Voice, Run{

    public Bear(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + "хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " бежит");
        }
    }
    @Override
   public String getVoice(){
        if (hunger  <= 0) {
            return getNameAnimal() + " хочет есть";
        } else {
            hunger--;
            return getNameAnimal() + "РРРР";
        }
    }

    public String getNameAnimal() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

}
