package model;
import animals.*;
import model.Size;
import java.util.HashMap;
// обобщенный (generic) класс Aviary<> - вольер для животных
public class Aviary <T extends Animal>{

    private  Size size;
    private HashMap <String, T> aviaryMap;

    public Aviary(Size size) {
        aviaryMap = new HashMap<>();
        this.size = size;
    }
    /* метод добавляет животного в вальер с проверкой размера животного и значение размера вальера.

    */
    public void addAnimal(T animal) {
        if (animal.getSize().equals(size)) {
            aviaryMap.put(animal.getName(), animal);
        } else{
            throw new WrongSizeException(" животного размер не совпадает с размером вальера", animal.getSize());
        }
    }

    //возвращает объект животного из вальера по имени
    public T getAnimal(String name) {
        return aviaryMap.get(name);
    }



    public boolean removeAnimal(String name) {
        return aviaryMap.remove(name, aviaryMap.get(name));
    }

}
