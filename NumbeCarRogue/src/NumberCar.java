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

    public static ArrayList<String> RogueNumberInit(ArrayList<String> number) {

        // номер регионов http://www.nomerrus.ru/96.html
        //http://driveru.ru/story/363 список серий блатных номеров

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
// ----- для 134,136,138 регионов
        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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

        for (int i = 134; i <= 138; i = i+2) {
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




}
