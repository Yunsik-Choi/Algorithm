import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        for(int i = 0;i<num;i++){
            arr[Integer.parseInt(br.readLine())+1000000]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<=2000000;i++){
            if(arr[i]>0)
                sb.append(i-1000000).append('\n');
        }
        System.out.println(sb);
    }
}
//문제: 숫자 n개가 주어지면 정렬하여 출력하라
//풀이: 배열을 숫자가 몇개 등장했는지 기록해 출력한다.