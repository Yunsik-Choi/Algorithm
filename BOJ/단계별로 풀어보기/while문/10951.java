import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine())!=null){
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
//문제: 숫자 두개가 주이지면 더한 값을 출력하고 EOF의 경우 종료한다.
//풀이: while with resource를 사용하고 EOF의 경우 BufferedReader로 읽어들인 값이 null이면 중단한다.