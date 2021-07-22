import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int n = 1;
        for(int i=0; i<3;i++){
            n*=Integer.parseInt(br.readLine());
        }
        while (n!=0){
            arr[n%10]+=1;
            n = n/10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
//문제: 숫자 3개의 곱에 사용된 0부터 9까지의 개수를 출력하라.
//풀이: 크기 10 배열을 만들고 나머지로 맨 뒤 숫자를 나눠 나온 값에 해당하는 배열에 1을 더해준다.