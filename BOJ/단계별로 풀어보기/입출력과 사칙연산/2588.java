import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        String two = br.readLine();
        for(int i = two.length()-1;i>=0;i--){
            System.out.println(one*Character.getNumericValue(two.charAt(i)));
        }
        System.out.println(one*Integer.parseInt(two));
    }
}