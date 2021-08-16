import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        arr[1] = -1;
        for (int i=2;i<1001;i++){
            if(arr[i]!=-1){
                int sum=i;
                while (sum<1001){
                    sum+=i;
                    if(sum<1001)
                        arr[sum]=-1;
                }
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i = 0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            if(arr[num]!=-1)
                answer++;
        }
        System.out.println(answer);
    }
}
//문제: 숫자가 주어지면 숫자 중 소수는 몇개인지 구하라
//풀이: 에라토스테네스의 체를 사용하여 구한다.