import java.util.ArrayList;
import java.util.Collections;

//http://driveru.ru/story/363 список серий блатных номеров
public class NumberCarRogue {
    public static void main(String[] args) {

        ArrayList<String> number = new ArrayList<>();


        NumberCar.RogueNumberInit(number);


        for (int j = 0; j < number.size(); j++) {
            System.out.println(number.get(j));
        }

        System.out.println(number.size());

     //   int count = Collections.frequency(number, "О999ОО");

        String str = "О999ОО";

        long begin = System.currentTimeMillis();
             NumberCar.FoundNumber(number,str);

        long end = System.currentTimeMillis();
        long finals = end - begin;

        System.out.println(" " + finals + " ms");
    }

}
