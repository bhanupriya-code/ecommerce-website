public class fibonacci {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number" + " ");
//        int n = scanner.nextInt();
//        System.out.println(fibonacci(n));
//    }
//
//    public static int fibonacci(int n) {
//        if(n <= 1 ){
//            return n;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

    public static int fibonacci(int n) {

        if (n <= 1)

            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String args[]) {

        int n = 5;

        System.out.println(fibonacci(n));

    }
}
