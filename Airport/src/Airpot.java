import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
/*
При вводе  команды  “exitAll”  программа  должна  распечатать  номера  самолётов
в порядке покидания стоянки (и удалить их все из памяти). При вводе “exitLast” ­  должна
распечатать и  удалить из памяти  только  тот самолёт,  который  сейчас выезжает.
Если  стоянка заполнена  полностью,  следующему  самолёту должно быть отказано во въезде.
*/


public class Airpot {
    private static final int LIMIT_SPACE = 5;
    protected static ArrayList<String> airoplaneNumber = new ArrayList<>();
    private static final String exitAll = "exitAll";
    private static final String exitLast = "exitLast";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(airoplaneNumber.toString());
        System.out.println("Команда  -  exitLast отправка самолета ");
        System.out.println("Команда  -  exitAll вывод очереди покидания стоянки самолетами ");


        //String str = br.readLine();
        int i = 0;
        for (; ; ) {
            System.out.println("Введите бортовой номер самолета, 4 цифры:  или комнады отправки  самолета или для очистки стоянки\n: ");
            if (airoplaneNumber.size() >= LIMIT_SPACE) {
                System.out.println(" Стоянка заполнена! Для отправки самолета введите exitLast, для осводождения стоянки введите exiltAll  ");
            }

            String str = br.readLine();
            str = str.trim();

            if (str.equals(exitLast) && airoplaneNumber.size() > 0) {
                 i = airoplaneNumber.size()-1;
                System.out.println(airoplaneNumber.get(i));
                airoplaneNumber.remove(i);
                i --;
                continue;
            }

            if (str.equals(exitAll) && airoplaneNumber.size() > 0){
                            i = airoplaneNumber.size() -1;
                for (int j = i ;j >= 0;j--){
                    System.out.println(airoplaneNumber.get(j));
                }
                airoplaneNumber.removeAll(airoplaneNumber);
                i=0;
                continue;

            } else {

            /*String reg = "^([0-9]){4}$";
            boolean boolInputStringRegex = str.matches(reg);

            if (!boolInputStringRegex) {
                System.out.println("Вы ввели не бортовой номер самолета! ");
                break;
            }*/

                str = str.replaceAll("[\\s]+", "");
                //System.out.println(str);
                airoplaneNumber.add(str);

                i++;
                //   System.out.println(airoplaneNumber.get(i));

/*
                for (String number : airoplaneNumber) {

                    System.out.println("На стоянке находятся борт № " + number);
                }*/

            }
        }


    }
}
