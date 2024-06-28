import java.util.*;

public class Level0 {

    public Level0() {

        //문자열을 정수로 바꾸기
//        String a = "-1234";
//        int aa = solution12925(a);
//        System.out.println(aa);

        //문자열 내 p와 y의 개수
//        String s = "pPoooyY";
//        boolean answer = solution(s);
//        System.out.println(answer);

        //약수의 합
//        int n = 12;
//        int z = solution3(n);
//        System.out.println(z);

        //자릿수 더하기
//        int q = 987;
//        int a = solution4(q);
//        System.out.println(a);

        //자연수 뒤집어 배열로 만들기
//        long q = 3334;
//        int[] a = solution5(q);
//        System.out.println(a);

        //정부 내림차순으로 배치하기
//        long l = 33628;
//        long a = solution6(l);
//        System.out.println(a);

        //정수 제곱근 판별
//        long l = 144;
//        long a = solution7(l);
//        System.out.println("answer = "+a);

        //짝수와 홀수
//        int q = 987;
//        String a = solution8(q);
//        System.out.println(a);

        //평균 구하기
//        int[] arr = {1,2,3,4};
//        double a = solution9(arr);
//        System.out.println(a);

        //하샤드 수
//        int z = 12;
//        boolean a = solution10(z);
//        System.out.println(a);

        //x만큼 간격이 있는 n개의 숫자
//        int x = 2;
//        int y = 4;
//        long[] a = solution11(x,y);
//        System.out.println(a);

        //두 정수 사이의 합
//        int x = 2;
//        int y = 4;
//        long a = solution12(x,y);
//        System.out.println(a);

        //나머지가 1이 되는 수 찾기
//        int z = 10;
//        int a = solution11(z);
//        System.out.println(a);

        //서울에서 김서방 찾기
//        String[] z = {"Jane", "Kim"};
//        String a = solution12(z);
//        System.out.println(a);

        //음양 더하기
        int[] z = {4,7,12};
        boolean[] zz = {true,false,true};
        int a = solution13(z,zz);
        System.out.println(a);

    }

    //음양 더하기
    public int solution13(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int result = 0;
        for(int i=0; i<signs.length; i++){
            if (!signs[i]){
                absolutes[i] = -absolutes[i];
                result += absolutes[i];
            } else if (signs[i]) {
                result += absolutes[i];
            }
            answer = result;
        }
        return answer;
    }

    //서울에서 김서방 찾기
    public String solution12(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (("Kim").equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    //나머지가 1이 되는 수 찾기
    public int solution11(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++){
            if (n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    //두 정수 사이의 합
    public long solution12(int a, int b) {
        long answer = 0;
        if (a>b){
            for (int i=b; i<=a; i++){
                answer+=i;
            }
        } else if (a<b) {
            for (int i=a; i<=b; i++){
                answer+=i;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    //x만큼 간격이 있는 n개의 숫자
    public long[] solution11(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            answer[i] = (long)(i+1) * x;
        }

        return answer;
    }

    //하샤드 수
    public boolean solution10(int x) {
        boolean answer = true;
        int z = 0;
        String[] zzz = String.valueOf(x).split("");
        for (String zz : zzz) {
            z += Integer.parseInt(zz);
        }
        if (x % z == 0) {
            return true;
        } else {
            return false;
        }
    }

    //평균 구하기
    public double solution9(int[] arr) {
        double answer = 0;
        for (int aa : arr)
            answer += aa;
        answer /= arr.length;
        return answer;
    }

    //짝수와 홀수
    public String solution8(int num) {
        String answer = "";
        if (num%2==0) answer = "Even";
        else answer = "Odd";
        return answer;
    }

    //정수 제곱근 판별
    public long solution7(long n) {
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            else answer = -1;
        }

//        double sqrt = Math.sqrt(n);
//        if (n%sqrt==0){
//            answer = (long) Math.pow(sqrt+1, 2);
//        } else {
//            answer = -1;
//        }
        return answer;
    }

    //정수 내림차순으로 배치하기
    public long solution6(long n) {

        String[] list = String.valueOf(n).split(""); //쪼개서 각 배열을 문자열로 생성
        Arrays.sort(list); //배열을 오름차순하기

        StringBuilder sb = new StringBuilder();
        for (String aList : list) {
            sb.append(aList); //StringBuilder에 각 문자를 추가한다.
        }

        return Long.parseLong(sb.reverse().toString());
    }

    //자연수 뒤집어 배열로 만들기
    public int[] solution5(long n) {
        long num = n;
        int cnt = 0;

        while(num > 0){
            num /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];

        num = n;
        for(int i = 0; i<cnt; i++){
            answer[i] = (int)(num % 10);
            num /= 10;
        }

        return answer;
    }

    //자릿수 더하기
    public int solution4(int n) {
        int answer = 0;
        while (n>0) {
            answer += n % 10;
            System.out.println(n);
            System.out.println(n/10);
            System.out.println(n%10);
            System.out.println("-------answer : "+answer);
            n /= 10;
            System.out.println("-------n : "+n);
        }

        return answer;
    }

    //약수의 합
    public int solution3(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n%i ==0 ) {
              answer += i;
            }
        }
        return answer;
    }

    //문자열을 정수로 바꾸기
    int solution12925(String s) {
        //s는 부호와 숫자로만 이루어져있는 조건이기 때문에, 다른 문자열은 신경쓰지않는다.
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    //문자열 내 p와 y의 개수
    boolean solution(String s) {
        boolean answer = true;
        int y=0;
        int p=0;
        s = s.toLowerCase();

        for(int a=0; a<s.length(); a++) {
            if (s.charAt(a)=='p') {
                p++;
            } else if (s.charAt(a)=='y') {
                y++;
            }

            if (p!=y){
                answer = false;
            } else {
                answer = true;
            }
        }

        return answer;
    }
}
