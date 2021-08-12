import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(br.readLine());
        for(int i = 0; i<z;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int y = N%H;
            int x = N/H + 1;
            if(N%H==0) {
                y = H;
                x-=1;
            }
            StringBuilder sb = new StringBuilder();
            if(x>=10){
                sb.append(y).append(x);
            }else{
                sb.append(y).append(0).append(x);
            }
            System.out.println(sb);
        }
    }
}
//문제: 호텔 층수 H 호텔 방 수 W 손님 수 N이 주어지고 각 층의 앞 쪽 방부터 채울 경우 마지막 손님이 배정될 방을 계산하라
//풀이: 손님수/층수의 나머지로 층수 결과로 호수를 구한 후 나눈게 0으로 떨어질 경우의 예외처리를 따로 해준다.