import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            String temp = br.readLine();
            int score = 0;
            int sum = 1;
            for(char l : temp.toCharArray()){
                if(l=='O'){
                    score+=sum;
                    sum+=1;
                }
                else{
                    sum=1;
                }
            }
            sb.append(score).append('\n');
        }
        System.out.println(sb);
    }
}
//문제: 문자열이 주어지면 연속된 O의 개수에 따라 점수를 더한다.
//풀이: 문자열을 charArray로 바꿔 순회 하여 점수를 구한다.