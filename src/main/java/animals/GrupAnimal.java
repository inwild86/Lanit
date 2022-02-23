package animals;

public class GrupAnimal <T>{

    private T[] grupAnimal;

    public GrupAnimal(T[] grupAnimal) {
        this.grupAnimal = grupAnimal;
    }

    public void add(int i, T var){
        grupAnimal[i] = var;
    }

    public T[] getArr() {
        return grupAnimal;
    }

}

