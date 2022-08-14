import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }

    private static long fact(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
