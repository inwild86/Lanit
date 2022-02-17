package animals;

public class Kotik {

    private String name;
    private String voice;
    private int satiety = 0;
    private int weight;
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

    public  int getWeight() {
        return weight;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public  void setVoice(String voice) {
        this.voice = voice;
    }
    public  void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public  void setWeight(int weight) {
        this.weight = weight;
    }


    //конструктор в порядке: name, voice, satiety, weight
    public Kotik(String name, String voice, int satiety, int weight) {
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

    public void setKotik(String name, String voice, int satiety, int weight) {
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

    public void eat(int amountSatiety) {
        this.satiety += amountSatiety;

    }

    public void eat(int amountSatiety, String nameFood) {
        this.satiety += amountSatiety;
        System.out.println("Было съедено " + amountSatiety + " " + nameFood);
    }

    public void eat() {
        eat(2, "рыбы");
    }


    //вщзвращает массив действий
    public String[] liveAnotherDay() {
        String[] action = new String[24];

        for (int i = 0; i < 24; i++) {

                switch ((int) (Math.random() * METHODS) + 1) {
                    case 1:
                       if( play())
                        action[i] =i +" - играл";
                       else {action[i]=i +" - ел"; eat();}
                       break;
                    case 2:
                        if( sleep())
                        action[i] =i +" - спал";
                        else {action[i]=i +" - ел"; eat();}
                        break;
                    case 3:
                        if (wash())
                        action[i] =i +" - умывался";
                        else {action[i]=i +" - ел"; eat();}
                        break;
                    case 4:
                        if (walk())
                        action[i] =i +" - гулял";
                        else {action[i]=i +" - ел"; eat();}
                        break;
                    case 5:
                        if(hunt())
                        action[i] =i +" - охотился";
                        else {action[i]=i +" - ел"; eat();}
                        break;
                }
        }
        return action;
    }
}
