import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
//문제: 숫자 n개가 주어지면 정렬하여 출력하라
//풀이: 배열을 정렬 함수를 통해 정렬 후 출력한다.