import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Notary {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> visitorsName = new ArrayList<>();

        for (;;){
            System.out.println("Пожалуста, введите ваше имя: ");
            String name = reader.readLine().trim();
            visitorsName.add(name);
            if(visitorsName.size() > 3){
                String nextVisitors = visitorsName.remove(0);
                System.out.println(" Нотариус принял:  "+nextVisitors + " слудющий");
            }
        }
    }
}
