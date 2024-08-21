import java.util.Arrays;

public class Level0_2 {

    public Level0_2(){

        //간단한 식 만들기
//        String s = "43 + 12";
//        System.out.println(solution1(s));

        //배열 만들기 3
        int[] arr = {1,2,3,4,5};
        int[][] in = {{1, 3}, {0, 4}};
        solution2(arr, in);
    }


    //배열 만들기 3
    //다시풀기
    //준내 어렵
    public int[] solution2(int[] arr, int[][] intervals) {
        int[] answer = {};

        int l = (intervals[0][1]-intervals[0][0]+1) + (intervals[1][1]-intervals[1][0]+1);
        answer = new int[l]; //새로운 배열 길이 설정.

        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer[index++] = arr[j];
                System.out.println(answer[i]);
            }
        }

        return answer;
    }

    //간단한 식 만들기
    public int solution1(String binomial) {
        int answer = 0;

        String[] a = binomial.split(" ");
        int i0 = Integer.parseInt(a[0]);
        int i2 = Integer.parseInt(a[2]);
        if (a[1].equals("+")){
            answer = i0 + i2;
        }
        if (a[1].equals("-")) {
            answer = i0 - i2;
        }
        if (a[1].equals("*")) {
            answer = i0 * i2;
        }
        return answer;
    }
}
