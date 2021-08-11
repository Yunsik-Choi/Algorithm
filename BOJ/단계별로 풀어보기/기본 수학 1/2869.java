import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.decode(st.nextToken());
        long b = Long.decode(st.nextToken());
        long c = Long.decode(st.nextToken());
        if(a==c)
            System.out.println(1);
        else{
            long n = a-b;
            long x = c-a;
            long answer = 0;
            if(x%n==0){
                answer = x/n;
            } else{
                answer = (x/n)+1;
            }
            System.out.println(answer+1);
        }
    }
}
//문제: 하루에 A미터를 올라가고 B미터씩 떨어진다 C미터를 오르는데 몇일이 걸리는지 구하라
//풀이: C미터에 A미터를 빼고 A-B미터로 나눈 후 나머지가 있으면 2 없으면 1을 더한 후 출력한다.