public class Main {
    public static void main(String[] args) {
        selfNum();
    }

    public static void selfNum(){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10100];
        for(int i = 1; i<=10000; i++){
            int n = sumNum(i);
            arr[n] = n;
            if(arr[i]==0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int sumNum(int num){
        int n = num;
        while (num>0){
            n+=num%10;
            num=num/10;
        }
        return n;
    }
}