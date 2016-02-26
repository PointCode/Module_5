import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class NumberCarRogue {
    public static void main(String[] args) throws IOException {

        ArrayList<String> number = new ArrayList<>();
        NumberCar.RogueNumberInit(number);
        NumberCar.RogueNumberInitТNext(number);
        System.out.println("Всего номеров в базе: " + number.size());

        System.out.println("Введите проверяемый номер автомодиля в формате 'А001АА01': ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String carNumberInput = reader.readLine().trim();


     /*   for (int j = 0; j < number.size(); j++) { // для вывода номеров в базе
            System.out.println(number.get(j));
        }*/


        //      int count = Collections.frequency(number, "О999ОО");

        long begin = System.currentTimeMillis();
        NumberCar.FoundNumber(number, carNumberInput);

        long end = System.currentTimeMillis();
        long finals = end - begin;

        System.out.println(" " + finals + " ms");
    }

}
