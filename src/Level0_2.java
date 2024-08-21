import java.util.Arrays;

public class Level0_2 {

    public Level0_2(){

        //간단한 식 만들기
//        String s = "43 + 12";
//        System.out.println(solution1(s));

        //배열 만들기 3
//        int[] arr = {1,2,3,4,5};
//        int[][] in = {{1, 3}, {0, 4}};
//        solution2(arr, in);

        //카운트 업
//        int s = 3;
//        int e = 10;
//        solution3(s,e);

        //정수 찾기
//        int[] l = {15, 98, 23, 2, 15};
//        int n = 20;
//        solution4(l, n);

        //중앙값 구하기
//        int[] a = {1, 2, 7, 10, 11};
//        solution5(a);

        //중복된 숫자 개수
        int[] a = {1, 1, 2, 3, 4, 5};
        int n = 1;
        solution6(a,n);
    }

    //중복된 숫자 개수
    public int solution6(int[] array, int n) {
        int answer = 0;

        for (int a:array) {
            if (n == a){
                answer++;
            }
        }
        return answer;
    }

    //중앙값 구하기
    public int solution5(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            answer = array[array.length/2];
        }
        return answer;
    }

    //정수 찾기
    public int solution4(int[] num_list, int n) {
        int answer = 0;

        for (int num:num_list){
            if (n == num){
                answer = 1;
            }
        }
        return answer;
    }

    //카운트 업
    public int[] solution3(int start_num, int end_num) {
        int[] answer = {};

        answer = new int[end_num-start_num+1];

        int idx = 0;
        for (int j = start_num; j <= end_num; j++) {
            answer[idx] = j;
            idx++;
        }

        return answer;
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
