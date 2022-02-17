package animals;

public class Kotik {

    private String name;
    private String voice;
    private int satiety = 0;
    private double weight;
    private static int count = 0;
    private static final int METHODS = 5;

    public int getCount() {
        return count;
    }

    public  String getName() {
        return name;
    }

    public  String getVoice() {
        return voice;
    }

    public  int getSatiety() {
        return satiety;
    }

    public  double getWeight() {
        return weight;
    }

    //конструктор в порядке: name, voice, satiety, weight
    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    // конструктор без параметров
    public Kotik() {
        count++;
    }

    public void setKotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println("Котик моется");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean eat(int amountSatiety) {
        this.satiety += amountSatiety;
        return true;
    }

    public boolean eat(int amountSatiety, String nameFood) {
        this.satiety += amountSatiety;
        System.out.println("Было съедено " + amountSatiety + " " + nameFood);
        return true;
    }

    public boolean eat() {
        eat(2, "рыбы");
        return true;
    }

    public boolean isKotikFull() {
        if (getSatiety() != 0) return true;
        else return false;
    }

    //вщзвращает массив действий
    public String[] liveAnotherDay() {
        String[] action = new String[23];

        for (int i = 0; i < 23; i++) {
            if (isKotikFull()) { int choise = (int) (Math.random() * METHODS) + 1;
                switch (choise) {
                    case 1:
                        play();
                        action[i] = "играл";
                        break;
                    case 2:
                        sleep();
                        action[i] = "спал";
                        break;
                    case 3:
                        wash();
                        action[i] = "мылся";
                        break;
                    case 4:
                        walk();
                        action[i] = "гулял";
                        break;
                    case 5:
                        hunt();
                        action[i] = "охотился";
                        break;
                }
            }else {
                eat(3, "сосиски"); i--;

            }
        }
        return action;
    }

}
