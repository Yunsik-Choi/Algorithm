import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[1] = -1;
        for(int i = 2;i<=n;i++){
            int num = i+i;
            if(arr[i]==0){
                while (true){
                    if(num<=n){
                        arr[num] = -1;
                    }else
                        break;
                    num+=i;
                }
            }
        }
        int answer = 0;
        int min = -1;
        for(int i=n;i>=m;i--){
            if(arr[i]!=-1){
                answer+=i;
                min = i;
            }
        }
        if(answer>0)
            System.out.println(answer);
        System.out.println(min);
    }
}
//문제: 숫자가 범위가 주어지면 소수의 합과 가장 작은 소수를 구하라
//풀이: 에라토스테네스의 체를 사용하여 구한다