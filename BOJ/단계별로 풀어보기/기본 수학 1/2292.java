import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int temp = 1;
        if(num==1){
            System.out.println(1);
        }
        else {
            for (int i = 2; ; i++) {
                int n = i * 6 - 6 + temp;
                if (num > temp && num <= n) {
                    System.out.println(i);
                    break;
                }
                temp = n;
            }
        }
    }
}
//문제: 육각형으로 이루어진 배열에서 몇번을 거쳐야 해당 번호로 갈 수 있는지 구하라
//풀이: 육각형을 둘러싸는 크기가 1씩 커지므로 for문을 돌려 해당 번호가 위치한 범위까지 가는 비용을 계산한다