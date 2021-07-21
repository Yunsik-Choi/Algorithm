import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0&&b==0)
                break;
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
//문제: 숫자 두개가 주어진다 숫자 두개가 둘다 0이면 종료하고 그 외에는 더한 값을 출력한다.
//풀이: while문을 사용해 숫자 두개가 0일때 까지 반복하여 출력한다.