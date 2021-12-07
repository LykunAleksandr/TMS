package les01.hw;

public class KaktoVStileFuturambI {

    public static String name = "Александр";
    public static String secondName = "Владимирович";
    public static String lastName = "Лукин";
    public static String sex = "мужской";
    public static boolean trustability = false;
    public static String enough = "Хватит";
    public static int videoGrade = 8;


    public static void main(String[] args) {
        System.out.println(lastName + " " + name + " " + secondName + " пол: " + sex);
        System.out.println("кредитоспособность = " + trustability);
        System.out.println(enough);
        System.out.println("Оценка видео: " + videoGrade);
    }
}
