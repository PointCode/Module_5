import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Вася");
        list.add("Катя");
        list.add(0, "Петя");

        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        list.set(1, "Миша");
        for (String name:list){
            System.out.println(name);
        }
    }
}
