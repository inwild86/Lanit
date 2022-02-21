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

        Swim[] pond = createPond();
        for (Swim i : pond) {
           i.swim();
        }
    }

    public static Swim[] createPond() {
        Swim[] pond = {
              new Duck("Утя"),
                new Fish("РЫба"),
              new Snake("Змейка")
        };

        return pond;
    }
}
