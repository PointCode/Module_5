public class RainbowColor {

    public static void main(String[] args) {
//--- иницилиируем массив цветами радуги
        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple"};

//---создаем класс реализующий стэк массива цвитов радуги и заполняем его
        StackRainbow stackRainbow = new StackRainbow(rainbow.length);
            for (int i = 0; i <rainbow.length; ++i) {
                stackRainbow.addElement(rainbow[i]);
            }
//---радуга на небе
        System.out.printf("");
        for (int i = 0; i < rainbow.length;++i ) {
            System.out.println(stackRainbow.readElement(i));
        }
//--- раудга растворяется
        while (!stackRainbow.isEmpty()) {
            System.out.print(stackRainbow.readTop());
            stackRainbow.deleteElement();
            System.out.print(" ");
        }

        System.out.println();

        if(stackRainbow.isEmpty()){
        System.out.println("Радуги нет");
    }
  }
}
