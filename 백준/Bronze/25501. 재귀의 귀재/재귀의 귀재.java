import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String[] inputs;
    static int T;
    static void input() {
        MyReader reader = new MyReader();
        T = reader.nextInt();
        inputs = new String[T];
        for(int i=0; i<T; i++) {
            inputs[i] = reader.nextLine();
        }
    }
    static class MyReader {
        BufferedReader br;
        StringTokenizer st;
        public MyReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static int recursion(String s){
        count++;
        if(s.length() <= 1) {
            return 1;
        } else {
            if(s.charAt(0) == s.charAt(s.length()-1)) {
                return recursion(s.substring(1,s.length()-1));
            }
            return 0;
        }

    }

    public static int isPalindrome(String s){
        count = 0;
        return recursion(s);
    }
    static int count;

    public static void main(String[] args){
        input();
        for(int i=0; i<T; i++) {
            System.out.println(isPalindrome(inputs[i]) + " " + count);
        }
    }

}
