public class Chess {
    public static void main(String[] args) {

        String[][] chess = new String[2][8];

        chess[0][0] = "A";
        chess[0][1] = "B";
        chess[0][2] = "C";
        chess[0][3] = "D";
        chess[0][4] = "E";
        chess[0][5] = "F";
        chess[0][6] = "G";
        chess[0][7] = "H";
        chess[1][0] = "1";
        chess[1][1] = "2";
        chess[1][2] = "3";
        chess[1][3] = "4";
        chess[1][4] = "5";
        chess[1][5] = "6";
        chess[1][6] = "7";
        chess[1][7] = "8";


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chess[0][i] + chess[1][j] +" ");
            }
            System.out.println();
        }
    }

}
