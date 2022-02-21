package food;

public class Grass extends Food{

    private String name;

    public Grass (){

    }
    public Grass(String name) {
        this.name = name;
    }

    public String getNameFood() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return 5;
    }

    }


