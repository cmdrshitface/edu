public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRec(10));
        System.out.println(fibonacciIter(10));
    }

    private static int fibonacciIter(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }

    private static int fibonacciRec(int n) {
        //  System.out.println("Going to start calculate fibonacci for n = " + n);
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int left = fibonacciRec(n - 1);
//        System.out.println("Left result for n = " + n + " is calculated");
        int right = fibonacciRec(n - 2);
//        System.out.println("Right result for n = " + n + " is calculated");
        return left + right;
    }


}