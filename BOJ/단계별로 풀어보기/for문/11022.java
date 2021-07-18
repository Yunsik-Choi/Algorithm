import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ")
                    .append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}

//문제 : 숫자 2개가 주어지면 다음과 같은 형식으로 n번째와 결과를 출력하기 "Case #n: a + b = 결과"
//풀이 : 첫줄에 주어진 n으로 for문을 설정한 후 한줄씩 입력 받아 형식에 맞게 String을 만든 후 출력한다. append와 String + 연산 중 append 연산이 더 효율적이다.