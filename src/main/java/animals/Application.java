package animals;

public class Application {

    public static void main(String[] args) {
        Kotik fiska = new Kotik("Фиска", "кс-кс", 2, 4.5);
        Kotik zigi = new Kotik();
        zigi.setKotik("Зиги", "кр-кр", 3, 2.5);
        String[] catsActivities = fiska.liveAnotherDay();
        for (String i : catsActivities) {
            System.out.println(i);
        }
        //Name and Weight:
        System.out.println(  fiska.getName() + " "+ fiska.getWeight());
       //Котики разговаривают одинаково?
        System.out.println(compareVoice(fiska.getVoice(), zigi.getVoice()));
       //Количество созданных котиков
        System.out.println(zigi.getCount());
    }

    static boolean compareVoice(String firstVoise, String secondVoice) {
        return firstVoise.equals(secondVoice);
    }

}
