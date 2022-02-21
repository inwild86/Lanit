import employee.*;
import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
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

        String[] pondAnimal = createPond();
        for (String i : pondAnimal) {
            System.out.println(i);
        }
    }

    static String[] createPond() {
        String[] pond = new String[]{"duck", "fish", "snake"};
        return pond;
    }
}
