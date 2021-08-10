import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for(int i = 0;i<num;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<10001;i++){
            for(int l = 0;l<arr[i];l++)
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
//문제: 숫자 n개가 주어지면 정렬하여 출력하라
//풀이: 배열을 숫자가 몇개 등장했는지 기록해 출력한다.