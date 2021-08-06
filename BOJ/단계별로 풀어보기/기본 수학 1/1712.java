import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(b>=c){
            System.out.println(-1);
        }
        else{
            System.out.println(a/(c-b)+1);
        }
    }
}
//문제: 손익분기점 고정비용 판매비용이 주어지면 몇개를 팔아야 손익분기점을 넘기는지 출력하라
//풀이: 판매비용 - 고정비용을 하여 몇개를 팔아야 손익분기점을 넘기는지 계산한다