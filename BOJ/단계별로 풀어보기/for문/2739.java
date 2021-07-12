import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<10;i++){
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}