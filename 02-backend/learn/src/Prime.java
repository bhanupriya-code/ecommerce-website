public class Prime {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}



