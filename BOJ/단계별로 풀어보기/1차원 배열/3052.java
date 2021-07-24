import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            set.add(n%42);
        }
        System.out.println(set.size());
    }
}
//문제: 숫자 10개가 주어지고 각 숫자를 42로 나눈 나머지의 숫자가 다른 경우가 몇개가 있는지 출력하라.
//풀이: set에 42로 나눈 나머지를 추가해준 후 set의 사이즈를 출력한다.