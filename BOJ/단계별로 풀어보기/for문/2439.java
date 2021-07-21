import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String star = "*";
        for(int i=1; i<=n; i++){
            for(int l=n;l>i;l--)
                sb.append(" ");
            for(int l = 0;l<i;l++)
                sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
//문제: n이 주어지면 n - 별의 개수의 공백과 1부터 n개의 별을 줄을 바꿔가면서 출력한다.
//풀이: 2중 for문을 사용해 내부 for문에서는 n - 별의 개수 공백을 더한 후 나머지 만큼 별을 더한다.
//번외: repeat을 사용하면 코드를 줄일 수 있지만 자바 11에 추가된 메서드이기 때문에 사용하지 말자.