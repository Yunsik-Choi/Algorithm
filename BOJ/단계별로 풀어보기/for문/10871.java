import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int max = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num<max)
                sb.append(num).append(" ");
        }
        System.out.println(sb.toString().strip());
    }
}
//문제: 숫자 n개와 최대값 max가 주어지면 n개의 숫자중 max보다 작은 값을 공백으로 구분하여 출력하라.
//풀이: 숫자를 하나씩 읽어 max보다 작은 수를 출력한다.