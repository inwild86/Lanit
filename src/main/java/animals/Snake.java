package animals;
import model.*;

public class Snake extends Carnivorous  implements Voice, Swim{

    public Snake(String name) {
        super (name);
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
            return getName() + " хочет есть";
        } else {
            hunger--;
            return getName() + " CCCCCCCC";
        }
    }


    @Override
    public Size getSize() {
        Size s = Size.SMALL;
        return s;

}}
