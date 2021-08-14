import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n/3;
        int answer = -1;
        for(int i =0;i<=m;i++){
            if((n-(3*i))%5==0){
                answer = (n-(3*i))/5+i;
                break;
            }
        }
        System.out.println(answer);
    }
}
//문제: n이 주어지면 5와 3 봉지를 최소한으로 사용하여 나눠 담어라
//풀이: 3으로 나눠 최대 사용 봉지수를 구한 후 5봉지를 하나씩 늘려 사용하여 최소 봉지수를 구한다