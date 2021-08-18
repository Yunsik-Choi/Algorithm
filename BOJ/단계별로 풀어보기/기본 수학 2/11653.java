import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n>1){
            for(int i = 2;;i++){
                if(n%i==0){
                    System.out.println(i);
                    n=n/i;
                    break;
                }
            }
        }
    }
}
//문제: 숫자가 주어지면 소인수분해 수를 해라
//풀이: 반복문을 중첩하여 인수분해를 반복한다.