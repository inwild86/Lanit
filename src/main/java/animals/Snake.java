package animals;

public class Snake extends Carnivorous  implements Voice, Swim{

    public Snake(String name) {
        this.name = name;
    }

    public  Snake(){

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
    public String getVoice(){
        if (hunger  <= 0) {
            return getNameAnimal() + " хочет есть";
        } else {
            hunger--;
            return getNameAnimal() + " CCCCCCCC";
        }
    }

    public String getNameAnimal() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

}
