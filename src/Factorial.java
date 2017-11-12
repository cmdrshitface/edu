public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRec(10));
        System.out.println(factorialIter(10));
    }

    private static int factorialRec(int n) {
//        System.out.println("Going to start calculate factorial for n = " + n);
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int result = n * factorialRec(n - 1);
//        System.out.println("Result for n = " + n + " calculated. Result = " + result);
        return result;
    }

    private static int factorialIter(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}