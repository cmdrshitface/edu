
import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        char[][] field = getField();

        /* game process and input */

        boolean win = false;
        boolean full = false;
        Scanner scan = new Scanner(System.in);
        do {
        /* x turn */
            System.out.println("It's x turn!");
            int rowX = scan.nextInt();
            int columnX = scan.nextInt();
            if ((columnX > 2 || columnX < 0) || (rowX > 2 || rowX < 0)) {
                System.out.println("Incorrect. Use only 0, 1 or 2.");
                return;
            } else {
                field[rowX][columnX] = 'x';
            }
            printField(field);
        /* x turn win check */
            boolean sameColumn = false;
            boolean sameRow = false;
            for (int i = 0; i < 3; i++) {
                sameRow = ((field[0][i] == field[1][i]) && (field[1][i] == field[2][i]) && ((field[0][i] == 'x' || field[1][i] == 'x' || field[2][i] == 'x') || (field[0][i] == 'o' || field[1][i] == 'o' || field[2][i] == 'o')));
                sameColumn = ((field[i][0] == field[i][1]) && (field[i][1] == field[i][2]) && ((field[i][0] == 'x' || field[i][1] == 'x' || field[i][2] == 'x') || (field[i][0] == 'o' || field[i][1] == 'o' || field[i][2] == 'o')));
            }
            boolean sameDiag = ((field[0][0] == field[1][1]) && (field[1][1] == field[2][2])) && ((field[0][0] == 'x') || (field[0][0] == 'o'));
            boolean sameDiag2 = ((field[2][0] == field[1][1]) && (field[1][1] == field[0][2])) && ((field[2][0] == 'x') || (field[2][0] == 'o'));

            if ((sameRow || sameColumn || sameDiag || sameDiag2) && ((field[1][0] == 'x') || (field[0][1] == 'x') || (field[0][0] == 'x') || (field[0][2] == 'x'))) {
                win = true;
                System.out.println("A winner is x!");
            } else if ((sameRow || sameColumn || sameDiag || sameDiag2) && ((field[1][0] == 'o') || (field[0][1] == 'o') || (field[0][0] == 'o') || (field[0][2] == 'o'))) {
                win = true;
                System.out.println("A winner is o!");
            } else {
                System.out.println("Nobody wins. It's a draw!");
            }
            /* o turn */
            System.out.println("It's o turn!");
            int rowO = scan.nextInt();
            int columnO = scan.nextInt();
            if ((columnO > 2 || columnO < 0) || (rowO > 2 || rowO < 0)) {
                System.out.println("Incorrect. Use only 0, 1 or 2.");
                return;
            } else {
                field[rowO][columnO] = 'o';
            }
            printField(field);


            for (int i = 0; i < 3; i++) {
                sameRow = ((field[0][i] == field[1][i]) && (field[1][i] == field[2][i]) && ((field[0][i] == 'x' || field[1][i] == 'x' || field[2][i] == 'x') || (field[0][i] == 'o' || field[1][i] == 'o' || field[2][i] == 'o')));
                sameColumn = ((field[i][0] == field[i][1]) && (field[i][1] == field[i][2]) && ((field[i][0] == 'x' || field[i][1] == 'x' || field[i][2] == 'x') || (field[i][0] == 'o' || field[i][1] == 'o' || field[i][2] == 'o')));
            }
            sameDiag = ((field[0][0] == field[1][1]) && (field[1][1] == field[2][2])) && ((field[0][0] == 'x') || (field[0][0] == 'o'));
            sameDiag2 = ((field[2][0] == field[1][1]) && (field[1][1] == field[0][2])) && ((field[2][0] == 'x') || (field[2][0] == 'o'));

            if ((sameRow || sameColumn || sameDiag || sameDiag2) && ((field[1][0] == 'x') || (field[0][1] == 'x') || (field[0][0] == 'x') || (field[0][2] == 'x'))) {
                win = true;
                System.out.println("A winner is x!");
            } else if ((sameRow || sameColumn || sameDiag || sameDiag2) && ((field[1][0] == 'o') || (field[0][1] == 'o') || (field[0][0] == 'o') || (field[0][2] == 'o'))) {
                win = true;
                System.out.println("A winner is o!");
            } else {
                System.out.println("Nobody wins. It's a draw!");
            }
        } while (win || full) ;

        printField(field);
    }




    private static char[][] getField() {
        char[][] field = new char[3][3];
        for (char[] row : field) {
            for (int i = 0; i < row.length; i++) {
                row[i] = '.';
            }
        }
        return field;
    }

    private static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(String.valueOf(cell) + ' ');
            }
            System.out.println();
        }
    }
}