public class Chess {
    public static void main(String[] args) {

        String[][] chess = new String[8][8];

        Character letter = 'A';
        Character number = '1';

        int codeLettre = (int) letter;
        int codeNumber = (int) number;

        for (int i = 0; i < chess.length; i++) {

            number = '1';
            codeNumber = (int) number;

            for (int j = 0; j < chess.length; j++) {

                chess[i][j] = Character.toString(letter) + Character.toString(number);
                System.out.print(chess[i][j] + " ");
                codeNumber++;
                number = (char) codeNumber;
            }

            System.out.println();
            codeLettre++;
            letter = (char) codeLettre;
        }
    }

}
