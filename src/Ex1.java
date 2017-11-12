public class Ex1 {
    public static void main(String[] args) {
        fizzBuzz(46);
    }

    public static void fizzBuzz(int n) {
        for (int j = 1; j <= n; j++) {
            if (j % 15 == 0) {
                System.out.print("fizzbuzz ");
            } else if (j % 5 == 0) {
                System.out.print("buzz ");
            } else if (j % 3 == 0) {
                System.out.print("fizz ");
            } else {
                System.out.print(j + " ");
            }

        }
    }
}