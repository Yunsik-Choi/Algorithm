import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        arr[1] = -1;
        for(int i = 2;i<=N;i++){
            if(arr[i]==0){
                int num = i+i;
                while (true){
                    if(num<=N){
                        arr[num]=-1;
                    }else
                        break;
                    num+=i;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=M;i<=N;i++){
            if(arr[i]==0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
//문제: 숫자가 2개가 주어지면 숫자 안에 소수를 모두 출력하라
//풀이: 에라토네스의 체를 사용하여 구한다.