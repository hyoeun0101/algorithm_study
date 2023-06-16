import java.util.Scanner;

public class Main{
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] score = new int[N];
        for(int i=0; i<N; i++) {
          score[i] = s.nextInt();
        }        
        long sum = 0;
        long max = 0;

        for(int i=0; i<N; i++) {
          if(score[i] > max) {
            max=score[i];
          } 
          sum = sum + score[i];
        }
        System.out.println(sum*100.0/max/N);
    }
}