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
    public int getEnergy() {
        return 7;
    }


}
