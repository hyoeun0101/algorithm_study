import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long N = s.nextLong();
        System.out.println(factorial(N));


    }
    public static long factorial(long n) {
        if(n > 1) {
            return n * factorial(n-1);
        }
        return 1;
    }

}
