public class RainbowColor {

    public static void main(String[] args) {
//--- иницилиируем массив цветами радуги
        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple"};
        int length = rainbow.length;

//---создаем класс реализующий стэк массива цвито радуги и заполняем его
        StackRainbow stackRainbow = new StackRainbow(length);
            for (int i = 0; i < length; ++i) {
                stackRainbow.addElement(rainbow[i]);
            }
//---радуга на небе
        System.out.printf("");
        for (int i = 0; i < stackRainbow.mSize;++i ) {
            System.out.println(stackRainbow.readElement(i));
        }
//--- раудга растворяется
        while (!stackRainbow.isEmpty()) {
            String value = stackRainbow.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println();

        if(stackRainbow.isEmpty()){
        System.out.println("Радуги нет");
    }
  }
}
