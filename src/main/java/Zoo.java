import employee.*;
import animals.*;
import food.*;
import  model.*;

public class Zoo {

    //вальеры
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary(Size.SMALL);



    public static void main(String[] args) throws WrongFoodException{
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
        System.out.println(getCarnivorous("fish1"));

        fillHerbivoreAviary();
        System.out.println(getHerbivore("duck").toString());

    }
     //создаем массив животных из пруда
    public static Swim[] createPond() {
        Duck duck=new Duck("Утя");
        Fish fish=new Fish("РЫба");
        Snake snake =new Snake("Змейка");
        Swim[] mas = new Swim[3];

         GrupAnimal<Swim> pond = new GrupAnimal<>(mas);
        pond.add(0, duck);
        pond.add(1,fish);

        return pond.getArr();
    }
    /*
    создает обьекты животных Хищники для вальера carnivorousAviary
    и пытается добавить их в вальер
    */
    private static void fillCarnivorousAviary() {
        Fish fish1 = new Fish("fish1");
        Kotik kot1 = new Kotik("kot1");
        carnivorousAviary.addAnimal(kot1);


    }
    /*
         создает обьекты животных Травоядные для вальера herbivoreAviary
        и пытается добавить их в вальер
        */
    private static void fillHerbivoreAviary() {
        Duck duck1 = new Duck("duck");
        Snake snake1 = new Snake("Змея");
        herbivoreAviary.addAnimal(duck1);
        //herbivoreAviary.addAnimal(snake1);
    }
    /*
       принимает хначение имени животного и возвращает экземпляр класса Carnivorous из коллекции carnivorousAviary,
      хранящийся в вальере carnivorousAviary
      */
    private static Carnivorous getCarnivorous( String name) {
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
