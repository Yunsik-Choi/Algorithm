import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int[] arr = {0,0,0,3,3,3,3,3,4,3,4};
        HashMap<Character,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i<arr.length;i++){
            for(int l = 0;l<arr[i];l++){
                map.put((char)('A'+cnt),i);
                cnt++;
            }
        }
        int answer = 0;
        for(char i : number.toCharArray()){
            answer+=map.get(i);
        }
        System.out.println(answer);
    }
}
//문제: 단어가 주어지면 해당 단어의 각 알파벳에 비용을 다 더하여 출력하라
//풀이: map에 알파벳 비용을 저장해 둔 후 단어의 모든 알파벳 비용을 더하여 출력한다