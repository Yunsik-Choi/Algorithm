import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.readLine().charAt(0);
        System.out.println(a);
    }
}
//문제: 문자가 주어지면 아스키코드 값으로 출력하라.
//풀이: 읽어들인 문자를 int로 받아 값을 출력한다.