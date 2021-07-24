import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];
            int avg = 0;
            for(int l = 0;l<m;l++){
                arr[l] = Integer.parseInt(st.nextToken());
                avg+=arr[l];
            }
            avg = avg/m;
            double cnt = 0;
            for(int l : arr){
                if(l>avg){
                    cnt+=1;
                }
            }
            sb.append(String.format("%.3f",cnt/m*100)).append('%').append('\n');
        }
        System.out.println(sb);
    }
}