import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        if(minute-45>=0){
            System.out.println(time+" "+(minute-45));
        }else{
            if(time>=1)
                System.out.println(time-1+" "+(minute+60-45));
            else
                System.out.println(time+23+" "+(minute+60-45));
        }
    }
}