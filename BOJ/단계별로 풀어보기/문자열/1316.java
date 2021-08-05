import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        int answer = 0;
        String str;
        for(int i = 0;i<n;i++){
            str = br.readLine();
            int[] arr = new int[26];
            boolean b = true;
            char temp = '-';
            for(char l : str.toCharArray()){
                int num = l - 'a';
                if(arr[num]==1 && temp != l){
                    b = false;
                    break;
                }
                arr[num]=1;
                temp = l;
            }
            if(b)
                answer++;
        }
        System.out.println(answer);
    }
}
//문제: n개의 단어 중 같은 알파벳이 떨어져있지 않은 단어의 개수를 구하라
//풀이: n개의 단어를 반복하면서 알파벳 arr를 만들고 만약 알파벳이 등장한적 있는데 바로 전 단어와 다르다면 카운트하지 않고 그 외의 경우에 카운트한다.