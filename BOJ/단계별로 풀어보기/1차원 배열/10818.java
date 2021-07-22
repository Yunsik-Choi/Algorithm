import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(max<num)
                max = num;
            if(min>num)
                min = num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
//문제: n과 숫자 문장이 주어지면 숫자 문장 중 최솟값과 최댓값을 찾아 출력한다.
//풀이: 숫자 문장을 순회하여 최대 최솟값을 찾는다.