import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n<=99)
            System.out.println(n);
        else
            System.out.println(fun(n));
    }

    public static int fun(int num){
        int sum = 99;
        for(int i = 100;i<=num;i++){
            int one = i/100;
            int two = (i/10)%10;
            int three = i%10;
            if((one>=two&&two>=three)||(three>=two&&two>=one)) {
                int n1 = Math.abs(one - two);
                int n2 = Math.abs(two - three);
                if (n1 == n2) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
//문제: 숫자 n이 주어지면 n보다 작은 등차수열인 수의 개수를 출력하라.
//풀이: 100미만은 등차수열이니 99부터 100미만은 n을 그 이상일 경우 fun함수를 통해 값을 구한다.