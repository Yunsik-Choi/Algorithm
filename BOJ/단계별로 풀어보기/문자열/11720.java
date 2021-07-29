import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int sum = 0;
        for(char i : a.toCharArray()){
            sum+=i-'0';
        }
        System.out.println(sum);
    }
}
//문제: 숫자 자릿수 n과 숫자가 주어지면 숫자의 자릿수 별로 더한 합을 계산하라.
//풀이: 문자열로 숫자를 하나씩 읽어 숫자 값으로 바꿔주기 위해 문자 0을 빼준 후 합을 구한다.