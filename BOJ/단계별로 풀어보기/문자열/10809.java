import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int cnt = 0;
        for(char i : br.readLine().toCharArray()){
            int a = i-'a';
            if(arr[a]==-1)
                arr[a] = cnt;
            cnt++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
//문제: 문자가 주어지면 알파벳 별로 제일 처음 등장하는 위치를 출력하고 등장하지 않는 경우 -1을 출력하라.
//풀이: 문자를 CharArray로 만들어 for문을 돌려 배열에 초기화시킨 후 배열을 출력한다.