import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        StringTokenizer st = new StringTokenizer(sb.reverse().toString());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
//문제: 숫자 두개가 주어지면 숫자를 뒤집어 둘 중 어떤 숫자가 큰지 출력하라
//풀이: 주어진 문장을 뒤집고 숫자를 비교하여 답을 구한다.