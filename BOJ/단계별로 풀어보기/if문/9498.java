import java.io.*;

class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStream(System.in));
        int score = Integer.parseInt(br.readline());
        switch (score/10){
            case 10 || 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}