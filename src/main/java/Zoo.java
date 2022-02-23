import employee.*;
import animals.*;
import food.*;
import model.*;

public class Zoo {

    private static Aviary<Carnivorous> carnivorousAviary = new Aviary(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary(Size.SMALL);

    public static void main(String[] args) throws WrongFoodException {
        Bear bear = new Bear("Мишка");
        Duck duck = new Duck("Скрудж дак");
        Fish fish = new Fish("Рыба");
        Kotik kotik = new Kotik("Котя");
        Puma puma = new Puma("Пума");
        Snake snake = new Snake("Змеюка");

        Worker worker = new Worker();

        Meat meat = new Meat("Окорочок");
        Grass grass = new Grass("Зелень");

        worker.getVoice(duck);
        worker.feed(duck, meat);
        worker.feed(duck, grass);
        worker.getVoice(duck);
        worker.getVoice(kotik);
        worker.feed(kotik, grass);
        worker.getVoice(kotik);
        worker.feed(kotik, meat);

        Swim[] pond = createPond();
        for (Swim i : pond) {
            i.swim();
        }

        fillCarnivorousAviary();
        System.out.println(getCarnivorous("fish"));

        fillHerbivoreAviary();
        System.out.println(getHerbivore("duck").toString());

    }

    //создаем массив животных из пруда
    public static Swim[] createPond() {
        Swim[] pond = {
                new Duck("Утя"),
                new Fish("РЫба"),
                new Snake("Змейка")
        };
        return pond;

    }

    /*
    создает обьекты животных Хищники для вальера carnivorousAviary
    и пытается добавить их в вальер
    */
    private static void fillCarnivorousAviary() {
        Fish fish = new Fish("fish");
        Kotik kotik = new Kotik("kotik");
        carnivorousAviary.addAnimal(kotik);

    }

    /*
         создает обьекты животных Травоядные для вальера herbivoreAviary
        и пытается добавить их в вальер
        */
    private static void fillHerbivoreAviary() {
        Duck duck = new Duck("Утка");
        Snake snake = new Snake("Змея");
        herbivoreAviary.addAnimal(duck);
        //herbivoreAviary.addAnimal(snake1);
    }

    /*
       принимает хначение имени животного и возвращает экземпляр класса Carnivorous из коллекции carnivorousAviary,
      хранящийся в вальере carnivorousAviary
      */
    private static Carnivorous getCarnivorous(String name) {
        Carnivorous c = carnivorousAviary.getAnimal(name);
        return c;
    }

    /*
     принимает значение имени животного и возвращает экземпляр класса Herbivore из коллекции herbivoreAviary,
    хранящийся в вальере carnivorousAviary
    */
    private static Herbivore getHerbivore(String name) {
        Herbivore h = herbivoreAviary.getAnimal(name);
        return h;
    }

}
