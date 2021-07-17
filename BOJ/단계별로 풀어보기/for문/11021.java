import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))
                    .append("\n");
        }
        System.out.println(sb);
    }
}

//문제 : 숫자 2개가 주어지면 다음과 같은 형식으로 n번째와 결과를 출력하기 "Case #n : 결과"
//풀이 : 첫줄에 주어진 n으로 for문을 설정한 후 한줄씩 입력 받아 형식에