import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int value = 0;
        for(int i = 1; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            if(n>value){
                value = n;
                cnt = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(value).append("\n").append(cnt));
    }
}
//문제: 9문장에 걸쳐 숫자가 주어지면 최댓값과 몇번째 숫자인지 찾아 출력한다.
//풀이: 각 문장을 읽어 최댓값인 경우 기록 해놓고 출력한다.