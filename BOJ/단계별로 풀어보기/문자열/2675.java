import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for(char l : str.toCharArray()){
                for(int k = 0;k<a;k++)
                    sb.append(l);
            }
            System.out.println(sb);
            sb.append("\n");
        }
    }
}
//문제: 숫자와 문자가 주어지면 문자를 하나씩 잘라 각 문자를 숫자만큼 반복하여 이어서 출력하라.
//풀이: 자른 문자열을 for문으로 숫자만큼 반복하여 출력한다.