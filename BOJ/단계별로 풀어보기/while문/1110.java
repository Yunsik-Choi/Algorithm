import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int origin = a;
        int cnt = 0;

        do {
            int first = a/10;
            int second = a%10;
            a = second*10+((first+second)%10);
            cnt++;
        } while (a!=origin);
        System.out.println(cnt);
    }
}
//문제: 숫자가 주어지면 조건에 맞게 연산하고 값이 처음 값과 몇번만에 같아지는지를 출력한다..
//풀이: do while문을 사용해 연산을 우선하고 조건이 맞으면 중단한다.