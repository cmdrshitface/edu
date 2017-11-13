public class diagsum {
    public static void main(String[] args) {
        int[][] arr = {{3, 14, 22, 1, 6},
                {44, 74, 32, 8, 6},
                {65, 22, 34, 0, 17},
                {51, 6, 8, 1, 42, 35},
                {34, 67, 22, 9, 46}};
        System.out.println(calculate(arr));
    }

    public static int calculate(int[][] arr) {
        int a = 0, b = 0, c = 0, i, j;
        for (i = 0; i < arr.length; i++) {
            a = a + arr[i][i];
            System.out.println(a);
        }


        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if ((i + j) == (arr.length - 1)) {
                    b = b + arr[i][j];
                    System.out.println(b);
                }
            }
        }
        c = a - b;
        return c;
    }
}

