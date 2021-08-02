import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }
}
//문제: 문장이 주어지면 몇개의 단어로 이루어진 문장인지 출력하라
//풀이: StringTokenizer로 토큰의 개수를 출력한다.