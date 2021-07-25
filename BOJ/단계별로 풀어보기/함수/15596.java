public class Test {
    long sum(int[] a) {
        long answer = 0;
        for(int i : a){
            answer+=i;
        }
        return  answer;
    }
}
//문제: 함수에 배열이 전달되면 합을 return한다.
//풀이: for문으로 합을 계산한다