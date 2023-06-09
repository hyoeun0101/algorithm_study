import java.util.Scanner;
 
public class Main {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 

	public static void hanoi(int N, int from, int mid, int to) {
		if (N == 1) {
			sb.append(from + " " + to + "\n");
			return;
		}
 
		hanoi(N - 1, from, to, mid);
		sb.append(from + " " + to + "\n");
		hanoi(N - 1, mid, from, to);
 
	}
}