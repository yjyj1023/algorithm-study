import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {

        int answer = 0;
        int total = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(total+d[i] <= budget){
                total += d[i];
                answer ++;
            }else{
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 q = new 예산();
        int[] arr = {1,3,2,5,4};
        System.out.println(q.solution(arr, 9));
    }
}
