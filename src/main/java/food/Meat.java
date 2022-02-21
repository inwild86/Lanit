package food;

public class Meat extends Food{
    private String name;

    public Meat (){

    }

    public Meat(String name) {
        this.name = name;
    }

    public String getNameFood() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  int getEnergy(Food food){
              return 5;
    }

}
