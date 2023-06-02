import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(fibo(N));
    }

    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-2) + fibo(n-1);
    }

}
