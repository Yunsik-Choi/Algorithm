import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = n;i>0;i--){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
//문제 : N이 주어지면 N부터 1까지 출력하기
//풀이 : 주어진 N을 입력받아 for문을 N부터 1씩 감소하면서 출력한다.