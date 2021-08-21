import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> num = new ArrayDeque<>();
        int z = Integer.parseInt(br.readLine());
        int max = z;
        while (z!=0){
            num.add(z);
            z = Integer.parseInt(br.readLine());
            if(max<z)
                max = z;
        }
        int[] arr = new int[max*2+1];
        arr[1] = -1;
        for(int i =2;i<=max*2;i++){
            int n = i+i;
            if(n<=max*2){
                if(arr[i]==0) {
                    while (n <= max * 2) {
                        arr[n] = -1;
                        n += i;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (num.size()>0){
            int n = num.pollFirst();
            int cnt = 0;
            for(int i = n+1;i<=2*n;i++){
                if(arr[i]==0){
                    cnt+=1;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
//문제: 숫자가 n개가 주어지고 각 num초과 num*2보다 작거나 같은 수 중 소수의 개수를 출력하라
//풀이: 숫자 중 가장 큰 수 * 2 만큼 미리 에라토네스의 체를 사용해 소수를 구한 후 각 숫자를 반복하여 