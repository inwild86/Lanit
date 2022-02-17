import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik fiska = new Kotik("Фиска", "кс-кс", 2, 4);
        Kotik zigi = new Kotik();
        zigi.setKotik("Зиги", "кр-кр", 3, 2);

        String[] catsActivities = fiska.liveAnotherDay();
        for (String i : catsActivities) {
            System.out.println(i);

        }
        //Name and Weight:
        System.out.println(  fiska.getName() + " "+ fiska.getWeight());
        //Котики разговаривают одинаково?
        System.out.println(compareVoice(fiska, zigi));
        //Количество созданных котиков
        System.out.println(Kotik.getCount());
    }

    static boolean compareVoice( Kotik first, Kotik second) {
                return first.getVoice().equals(second.getVoice());
    }

}
