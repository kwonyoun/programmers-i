import java.util.ArrayList;
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
//        int[] a = {1, 1, 2, 3, 4, 5};
//        int n = 1;
//        solution6(a,n);

        //배열 회전시키기
//        int[] n = {4, 455, 6, 4, -1, 45, 6};
//        String s = "left";
//        solution7(n,s);

        //배열 만들기 2
//        int l = 5;
//        int r = 50;
//        solution8(l,r);

        //카펫
//        int b = 10;
//        int y = 2;
//        solution9(b,y);

        //최솟값 만들기
//        int []a = {1, 4, 2};
//        int []b = {5, 4, 4};
//        solution10(a,b);

        //올바른 괄호
//        String s = "())((())()";
//        System.out.println(solution11(s));

        //JadenCase 문자열 만들기
//        String s = "3pe    ople unF  ollowed m e";
//        System.out.println(solution12(s));

        //숫자의 표현
        int n = 15;
        System.out.println(solution13(n));


    }

    //숫자의 표현
    public int solution13(int n) {
        int answer = 0;

        int a = 0;
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
            if (a == n){
                System.out.println(a);
                idx++;

            }

        }
//        while (a<=n){
//            a += a;
//            if (a == n){
//
//            }
//          a++;
//        }
        return answer;
    }

    //JadenCase 문자열 만들기
    //다시 풀어보기!
    public String solution12(String s) {
        String answer = "";

        String[] sarr = s.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            String ss = sarr[i];
            System.out.println("ss : "+ss);
            if(sarr[i].isEmpty()){
                answer += " ";
            }
            else {
                answer += ss.substring(0, 1).toUpperCase();
                answer += ss.substring(1).toLowerCase(); //두번째 글자부터 끝까지 소문자로 변환.
                answer += " "; //한 문자열이 끝나면 원래 있던 공백을 다시 추가.
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
    //올바른 괄호
    boolean solution11(String s) {
        boolean answer = true;

        String[] sarr = s.split("");
        int r = 0;
        int l = 0;
        for (int i = 0; i < sarr.length; i++) {
                if (sarr[i].equals("(")){
                    r ++;
                } else if (sarr[i].equals(")")) {
                    l++;
                }
                if (r < l) {
                    answer = false;
                }
        }
        if (r != l){
            answer = false;
        }

        return answer;
    }

    //최솟값 만들기
    public int solution10(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int j = B.length-1;
        while (i<A.length){
            answer += A[i++] * B[j--];
        }
        System.out.println(answer);

        return answer;
    }

    //카펫
    //lev2
    public int[] solution9(int brown, int yellow) {
        int[] answer = {};

        answer = new int[2];
        int sum = brown+yellow;
        for (int i = 1; i <= sum; i++) {
            if(sum%i==0) { //약수

                int se = sum / i; // 세로의 길이
                if ((i - 2) * (se - 2) == yellow) {
                    answer[0] = i;
                    answer[1] = se;
                }
            }
        }
        return answer;
    }

    //배열 만들기 2
    //다시 풀어야할 듯
    public int[] solution8(int l, int r) {
        int[] answer = {};

        String[] na = {"1","2","3","4","6","7","8","9"};
//        int[] na = {1,2,3,4,6,7,8,9};

        ArrayList<Integer> list = new ArrayList<>();
        String a = "";
        for (int i = l; i <= r; i++) {
            String ss = String.valueOf(i); //사이수들을 String형변환
            String[] sar = ss.split(""); //값들을 배열로 변환한다.
            int ll = sar.length; //사잇값들의 각 길이

            int cnt = 0;
            for (int j = 0; j < ll; j++) {
                if (sar[j].equals("0") || sar[j].equals("5")){
                    cnt++;
                }

            }
            if(cnt == ll) {
                list.add(i);
            }

        }
        return answer;
    }

    //배열 회전시키기
    public int[] solution7(int[] numbers, String direction) {
        int[] answer = {};

        answer = new int[numbers.length];
        int idx = 0;
        if (direction.equals("left")){
            for (int i = 1; i < numbers.length; i++) {
                answer[idx] = numbers[i];
                idx++;
            }
            answer[numbers.length-1] = numbers[0];
        }
        else {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[idx];
                idx++;
            }
            answer[0] = numbers[numbers.length-1];
        }

        return answer;
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
