import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> myList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            myList.add(br.readLine());
        }
        //중복 제거
        myList = myList.stream().distinct().collect(Collectors.toList());

        List<String> answer = new ArrayList<>();
        for(String str : myList) {
            if(!isPrefix(str, myList)) {
                answer.add(str);
            }
        }
        System.out.println(answer.size());





    }
    public static boolean isPrefix(String str,List<String> list) {
        for(String s : list) {
            if(str.equals(s)) continue;
            if(str.length() < s.length() && s.substring(0,str.length()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}