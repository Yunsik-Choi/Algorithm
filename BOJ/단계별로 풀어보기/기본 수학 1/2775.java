import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i<T;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            for(int l=1;l<=n;l++){
                arr[l] = l;
            }
            for(int l =1;l<=k;l++){
                int sum = 0;
                for(int j=1;j<=n;j++){
                    sum+=arr[j];
                    arr[j] = sum;
                }
            }
            System.out.println(arr[n]);
        }
    }
}
//문제: a층 b호에 살기 위해선 아래층의 1호부터 b호까지 사는 사람의 총 합만큼 데려와 살아야한다 k층 n호에 살기 위해선 몇명을 데려와야 하나?
//풀이: 배열을 만들어 0층부터 차례로 계산한다.