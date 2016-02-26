import java.util.ArrayList;

public class NumberCar {


    public static ArrayList<String> RogueNumberInit(ArrayList<String> number) {

        for (int i = 1; i < 1000; i++) {

            number.add("А" + String.format("%03d", i) + "АА");
            number.add("Е" + String.format("%03d", i) + "ЕЕ");
            number.add("К" + String.format("%03d", i) + "КК");
            number.add("К" + String.format("%03d", i) + "ММ");
            number.add("К" + String.format("%03d", i) + "МР");
            number.add("К" + String.format("%03d", i) + "ОО");
            number.add("М" + String.format("%03d", i) + "ММ");
            number.add("М" + String.format("%03d", i) + "МР");
            number.add("Н" + String.format("%03d", i) + "НН");
            number.add("О" + String.format("%03d", i) + "ОО");
            number.add("О" + String.format("%03d", i) + "МР");
            number.add("С" + String.format("%03d", i) + "АС");
            number.add("С" + String.format("%03d", i) + "ММ");
            number.add("С" + String.format("%03d", i) + "СС");
            number.add("Т" + String.format("%03d", i) + "МР");
            number.add("У" + String.format("%03d", i) + "МР");
            number.add("У" + String.format("%03d", i) + "УУ");
            number.add("Х" + String.format("%03d", i) + "ХХ");
        }
        return number;

    }
    public static void FoundNumber(ArrayList<String> number, String str) {
        int i;
        for (i = 0; i < number.size(); i++) {
            if (str.equals(number.get(i)))
                break;
        }
        if (i == number.size())
            System.out.print("False");
        else
            System.out.print("True");


    }


}
