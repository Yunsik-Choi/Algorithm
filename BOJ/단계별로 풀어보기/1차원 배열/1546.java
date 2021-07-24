import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double m = 0;
        double sum = 0;
        for(int i = 0;i<n;i++){
            double num = Integer.parseInt(st.nextToken());
            if(num>m)
                m = num;
            sum+=num;
        }
        System.out.println(sum/(m*n)*100);
    }
}
//문제: 숫자 n을 n/(n중의 최댓값)*100으로 고친 후 평균을 구해라.
//풀이: 숫자를 다 더한 후 마지막에 한번에 조건에 맞게 고친 후 답을 출력한다.