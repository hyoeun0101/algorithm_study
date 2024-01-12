import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        while(M-- > 0) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, target)).append("\n");
        }
        System.out.println(sb);
    }

    static int binarySearch(int[] arr, int target) {
        int midIdx;
        int firstIdx = 0;
        int lastIdx = arr.length - 1;

        while(firstIdx <= lastIdx) {

            midIdx = (firstIdx + lastIdx) / 2;
            if (arr[midIdx] == target) {
                return 1;
            } else if (arr[midIdx] > target) {
                lastIdx = midIdx - 1;
            } else {
                firstIdx = midIdx + 1;
            }
        }
        return 0;
    }
}