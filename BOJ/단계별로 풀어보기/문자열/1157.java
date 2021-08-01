import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int c = System.in.read();
        while(c>64){
            int n = c;
            if(n>90)
                n-=32;
            arr[n-'A']++;
            c = System.in.read();
        }
        int max = -2;
        int cnt = 0;
        for(int i = 0;i<26;i++){
            if(arr[i]>max) {
                max = arr[i];
                cnt = i;
            }
            else if(arr[i] == max)
                cnt=-2;
        }
        System.out.println((char) ('A'+cnt));
    }
}
//문제: 단어가 주어지면 단어에서 가장 많이 나온 알파벳을 출력하라.
//풀이: 바이트 단위로 단어를 잘라 읽어 배열에 빈도수를 저장해둔 후 가장 많이 나온 알파벳을 출력한다.