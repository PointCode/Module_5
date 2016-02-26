import java.util.ArrayList;

public class NumberCar {

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
    // номер регионов http://www.nomerrus.ru/96.html
    //http://driveru.ru/story/363 список серий блатных номеров

    public static ArrayList<String> RogueNumberInit(ArrayList<String> number) {
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 1; i <= 99; i++) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 1; i <= 99; i++) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 1; i <= 99; i++) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

        // ----------------------------для 102 региона Республика Башкортостан
        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 102));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 102));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 102));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 102));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 102));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 102));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 102));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 102));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 102));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 102));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 102));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 102));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 102));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 102));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 102));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 102));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 102));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 102));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 102));
        }

        // ----------------------------для 113 региона Республика Башкортостан
        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 113));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 113));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 113));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 113));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 113));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 113));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 113));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 113));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 113));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 113));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 113));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 113));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 113));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 113));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 113));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 113));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 113));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 113));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 113));
        }


        // ----------------------------для 116	 региона Республика Татарстан
        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 116));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 116));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 116));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 116));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 116));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 116));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 116));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 116));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 116));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 116));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 116));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 116));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 116));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 116));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 116));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 116));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 116));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 116));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 116));
        }

        // ----------------------------для 121 	Чувашская Республика
        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 121));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 121));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 121));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 121));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 121));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 121));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 121));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 121));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 121));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 121));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 121));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 121));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 121));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 121));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 121));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 121));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 121));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 121));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 121));
        }

// ----- для 123,124,125 126 регионов
        for (int i = 123; i <= 126; i = i + 1) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 123; i <= 126; i = i + 1) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 123; i <= 126; i = i + 1) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 123; i <= 126; i = i + 1) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

//---- регионов 134 136 138------------
        for (int i = 134; i <= 138; i = i + 2) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 134; i <= 138; i = i + 2) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 134; i <= 138; i = i + 2) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 134; i <= 138; i = i + 2) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

// ----- для 150,190 региона МО
        for (int i = 150; i <= 190; i = i + 40) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 150; i <= 190; i = i + 40) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 150; i <= 190; i = i + 40) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 150; i <= 190; i = i + 40) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }


// ----------------------------для 750 	МО
        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 750));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 750));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 750));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 750));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 750));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 750));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 750));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 750));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 750));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 750));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 750));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 750));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 750));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 750));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 750));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 750));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 750));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 750));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 750));
        }

 // ----------------------------для 152 	Нижегородская область
    for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 152));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 152));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 152));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 152));
        }
    for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 152));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 152));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 152));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 152));
        }
    for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 152));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 152));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 152));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 152));
        }
    for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 152));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 152));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 152));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 152));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 152));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 152));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 152));
        }

// -------------регион  159Пермский край
    for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            //  number.add(String.format("%03d", i) + String.format("%02d", j));
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 159));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 159));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 159));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 159));
        }
    for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 159));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 159));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 159));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 159));
        }
     for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 159));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 159));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 159));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 159));
        }
     for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 159));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 159));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 159));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 159));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 159));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 159));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 159));
        }

//------регион 161	Ростовская область
    for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 161));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 161));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 161));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 161));
        }
    for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 161));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 161));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 161));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 161));
        }
    for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 161));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 161));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 161));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 161));
        }
    for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 161));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 161));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 161));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 161));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 161));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 161));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 161));
        }

//-----------163	Самарская область 164	Саратовская область
    for (int i = 163; i <= 164; i++) {
          for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
    for (int i = 163; i <= 164; i++) {
         for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
    for (int i = 163; i <= 164; i++) {
          for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
    for (int i = 163; i <= 164; i++) {
          for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
       return number;
    }

    public static ArrayList<String> RogueNumberInitТNext(ArrayList<String> number){

 //---- 166, 196	Свердловская область
        for (int i = 166; i <= 196; i=i+30) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 166; i <= 196; i=i+30) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 166; i <= 196; i=i+30) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 166; i <= 196; i=i+30) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

 // ------ 197, 199 г. Москва

        for (int i = 197; i <= 199; i=i+2) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 197; i <= 199; i=i+2) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 197; i <= 199; i=i+2) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 197; i <= 199; i=i+2) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

 //------- 177 777 г.Москава
        for (int i = 177; i <= 777; i=i+600) {
            for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 177; i <= 777; i=i+600) {
            for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 177; i <= 777; i=i+600) {
            for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }
        for (int i = 177; i <= 777; i=i+600) {
            for (int j = 111; j <= 999; j = j + 111) { // номера с 111 до 999 с шагом 111
                number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", i));
                number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", i));
                number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", i));
                number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", i));
                number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", i));
                number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", i));
                number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", i));
            }
        }

//-----------регион ---178	г. Санкт-Петербург
    for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 178));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 178));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 178));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 178));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 178));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 178));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 178));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 178));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 178));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 178));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 178));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 178));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 178));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 178));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 178));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 178));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 178));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 178));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 178));
        }

//--------- регион 186 --Ханты-Мансийский автономный округ — Югра

        for (int j = 1; j <= 10; j = j + 1) { // номера с 001 до 010 шаг 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 186));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 186));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 186));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 186));
        }
        for (int j = 11; j <= 100; j = j + 1) { // номера с 011 до 100 с шагом 1
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 186));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 186));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 186));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 186));
        }
        for (int j = 110; j <= 990; j = j + 10) { // номера с 110 до 990 с шагом 10
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 186));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 186));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 186));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 186));
        }
        for (int j = 111; j <= 999; j = j + 111) { // номера с 100 до 999 с шагом 111
            number.add("А" + String.format("%03d", j) + "АА" + String.format("%02d", 186));
            number.add("Е" + String.format("%03d", j) + "ЕЕ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "КК" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("К" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("М" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("Н" + String.format("%03d", j) + "НН" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "ОО" + String.format("%02d", 186));
            number.add("О" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "АС" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "ММ" + String.format("%02d", 186));
            number.add("С" + String.format("%03d", j) + "СС" + String.format("%02d", 186));
            number.add("Т" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "МР" + String.format("%02d", 186));
            number.add("У" + String.format("%03d", j) + "УУ" + String.format("%02d", 186));
            number.add("Х" + String.format("%03d", j) + "ХХ" + String.format("%02d", 186));
        }

     return number;
    }
}