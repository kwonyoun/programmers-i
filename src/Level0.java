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
//        int[] z = {4,7,12};
//        boolean[] zz = {true,false,true};
//        int a = solution13(z,zz);
//        System.out.println(a);

        //없는 숫자 더하기
//        int[] a = {1,2,3,4,6,7,8,0};
//        System.out.println(solution14(a));

        //콜라츠 추측
//        int z = 6;
//        int a = solution15(z);
//        System.out.println(a);

        //나누어 떨어지는 숫자 배열
//        int[] arr = {1,32,42,17,16,24,7};
//        int d = 4;
//        System.out.println(Arrays.toString(solution16(arr, d)));

        //핸드폰 번호 가리기
//        String q = "01033334444";
//        System.out.println(solution17(q));

        //제일 작은 수 제거하기
//        int[] q = {45,73,13,7,8};
//        System.out.println(solution18(q));

        //가운데 글자 가져오기
//        String q = "abcdef";
//        String a = solution19(q);
//        System.out.println(a);

        //수박수박수박수
//        int n = 3;
//        String a = solution20(n);
//        System.out.println(a);

        //내적
//        int[] a = {1,2,3,4};
//        int[] b = {-3,-1,0,2};
//        int c = solution21(a,b);
//        System.out.println(c);

        //약수의 개수과 덧셈
//        int l = 13;
//        int r = 17;
//        int a = solution22(l,r);
//        System.out.println(a);

        //문자열 내림차순으로 배치하기
//        String s = "Zbcdefg";
//        String a = solution23(s);
//        System.out.println(a);

        //부족한 금액 부족하기
//        int a = 3;
//        int b= 20;
//        int c= 3;
//        long d =solution24(a,b,c);
//        System.out.println(d);

        //문자열 다루기 기본
//        String s = "a234";
//        boolean a = solution25(s);
//        System.out.println(a);

        //행렬의 덧셈
//        int[][] arr1 = {{1,2}, {2,3}};
//        int[][] arr2 = {{3,4}, {5,6}};
//        int[][] a = solution26(arr1,arr2);
//        System.out.println(a);

        //최대공약수와 최소공배수
//        int a = 3;
//        int b = 12;
//        int[] c  =solution27(a,b);
//        System.out.println(c);

        //같은 숫자는 싫어
//        int[] arr = {1,1,3,3,0,1,1};
//        int[] a = solution28(arr);
//        System.out.println(a);

        //예산
//        int[] d = {1,3,2,5,4};
//        int budget = 9;
//        System.out.println(solution29(d, budget));

        //3진법 뒤집기
//        int n = 125;
//        System.out.println(solution30(n));

        //크기가 작은 부분 문자열
        String a = "4440112";
        String b = "153";
        System.out.println(solution31(a,b));

        //

    }

    //크기가 작은 부분 문자열
    public int solution31(String t, String p) {
        int answer = 0;

        //int보다 Long타입의 범주가 더 크다. 그래서 런타임 에러 떴음. Long으로 형변환하니 됨.
        Long pp = Long.parseLong(p);
        Long zz = 0L;
        String z = "";
        for (int i = 0; i < t.length()-p.length()+1; i++) {
            z = t.substring(i,i+p.length());
            zz = Long.parseLong(z);
            if (pp >= zz){
                answer++;
            }
        }

        return answer;
    }

    //3진법 뒤집기
    public int solution30(int n) {
//        int answer = 0;

//        int result =0; //3진수로 변환하기 위해 값을 저장할 변수.
//        StringBuilder sb = new StringBuilder(); //배열을 뒤집기 위해 StringBuilder 생성함.
//        while (n>0) { //나누어떨어지지 않을 때 까지 실행.
//            result = n % 3; //나머지값을 result에 저장.
//            sb.append(result); //3진수 변환값을 StringBuilder에 저장한다.
//            n /= 3; //3진수 계산을 위해.
//        }
//        sb.reverse(); //배열 뒤집기.
//        String[] str = String.valueOf(sb).split(""); //각 배열 생성.
//        double a = 0; //제곱 계산을 하기 위해 double생성. 굳이 double 말고도 다른 방법이 있을 듯.
//        for (int i = sb.length()-1; i >= 0; i--) { //10진수 변환을 위해.
//            double ii = Double.parseDouble(str[i]); //3진수를 10진수로 변환하기위해 각 값을 저장한다.
//            a += Math.pow(3,i) * ii; //3을 i번 제곱하고, 3진수 앞뒤변환값을 곱한다. 값들을 합한다.
//        }
//        answer = (int) a; //합한 값을 answer에 저장한다.
//        return answer;

        //다른 사람 풀이
        String answer = "";

        while(n > 0){ //n이 0보다 클 때 까지
            answer = (n % 3) + answer; ///string을 합치면 다른 더할 형이 어떻든 결과가 string으로 나온다. string형으로 유지하기위해 초기화된 string을 나머지와 합침.
            // string이기 때문에 값이 더해지기 않고 그대로 합쳐짐.
            n /= 3; //3진수 변환하기 위해.
            System.out.println(answer);
        }
        answer = new StringBuilder(answer).reverse().toString(); //3진수
        System.out.println(answer);

        return Integer.parseInt(answer,3); //10진수


    }

    //예산
    public int solution29(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d); //배열을 정렬한다.
        for (int i = 0; i < d.length; i++) { //배열 길이만큼 반복한다.
            System.out.println(d[i]);
            budget -= d[i]; //예산에서 정렬한 배열 순서대로 뺀다.
            if (budget<0) break; //실행 중 만약 예산이 0보다 작으면 멈춘다.
            answer++; //몇 개의 팀이 예산 충족이 되는지 확인하기 위해.
        }


        return answer;
    }

    //같은 숫자는 싫어
    public int[] solution28(int []arr) {
        int[] answer = {};

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                st.push(arr[i]);
            } else if (st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        answer = new int[st.size()];
        for (int i = st.size()-1; i >=0 ; i--) {
            answer[i]=st.pop();
        }

        return answer;
    }

    //최대공약수와 최소공배수
    public int[] solution27(int n, int m) {
        int[] answer = {};

        int min =0;
        int max=0;
        answer = new int[2];
        for (int i = 1; i <= n && i <= m; i++) {
            if (n%i==0 && m%i==0){
                min=i;
            }
        }
        max = (m*n)/min;
        answer[0]=min;
        answer[1]=max;

        return answer;
    }

    //행렬의 덧셈
    public int[][] solution26(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        answer = arr1; //행렬 길이 설정.
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] =  arr1[i][j] + arr2[i][j];
            }
        }

//        int[][] answer = new int[A.length][A[0].length];
//        for(int i=0; i<A.length; i++)
//            for(int j=0; j<A[0].length; j++)
//                answer[i][j] = A[i][j] + B[i][j];

        return answer;
    }

    //문자열 다루기 기본
    public boolean solution25(String s) {
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                answer = false;
            }
        }
        if (s.length()!=4&&s.length()!=6){
            answer = false;
        }

//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;

        return answer;
    }

    //부족한 금액 부족하기
    public long solution24(int price, int money, int count) {
        long answer = -1;

        long a =0;
        for (int i = 1; i <= count; i++) {
            a += (long)price*i;
//            System.out.println(a);
        }
        if (a>money){
            answer = a - money;
        } else {
            answer = 0;
        }
        return answer;
    }

    //문자열 내림차순으로 배치하기
    public String solution23(String s) {
        String answer = "";

        char[] c = s.toCharArray();
        Arrays.sort(c);
        String cc = new String(c);
        answer = new StringBuilder(cc).reverse().toString();

        return answer;
    }

    //약수의 개수과 덧셈
    public int solution22(int left, int right) {
        int answer = 0;

        //범위 설정.
        for (int i = left; i <= right ; i++) {
            int cnt=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }


    //내적
    public int solution21(int[] a, int[] b) {
        int answer = 1234567890;

        int aa =0;
        for (int i = 0; i < a.length; i++) {
            aa += a[i] * b[i];
        }
        answer = aa;
        return answer;
    }

    //수박수박수박수
    public String solution20(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i%2==0){
                answer += "수";
            } else {
                answer += "박";
            }
        }
        
        return answer;
    }

    //가운데 글자 가져오기
    public String solution19(String s) {
        String answer = "";

        char[] ss = s.toCharArray();
        if (s.length()%2==1){
            answer = String.valueOf(ss[(s.length()-1)/2]);
        } else if (s.length()%2==0){
            answer = String.valueOf(ss[s.length()/2-1]);
            answer += String.valueOf(ss[s.length()/2]);
        }

        return answer;
    }

    //제일 작은 수 제거하기
    public int[] solution18(int[] arr) {
        int[] answer = {};

        if (arr.length<=1) {
            answer= new int[] {-1};
            return  answer;
        };

        int min= arr[0]; //제일 작은 수 비교를 위해 설정.
        for (int i = 0; i < arr.length; i++) {
                min = Math.min(min,arr[i]); //제일 작은수 min으로 선정.
        }

        answer= new int[arr.length-1]; //제일 작은 수를 제외한 배열의 길이 설정.
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==min){ //위의 반복문을 통해 선정된 최솟값과 일치하면 continue;
                continue;
            } else {
                answer[index++] = arr[i]; //그 외는 배열 설정하기.
            }
        }

        return answer;
    }

    //핸드폰 번호 가리기
    public String solution17(String phone_number) {
        String answer = "";

        char[] num = phone_number.toCharArray();
        for (int i=0; i<num.length-4; i++){
            num[i] = '*';
        }
        answer = String.valueOf(num);

//        String[] p = phone_number.split(""); //String 배열 생성.
//        for (int i = 0; i < p.length; i++) { //배열의 크기만큼 반복.
//            if (i<p.length - 4) { //뒷번호 4자리를 제외하고 가리기위해 배열 길이에 -4 하기.
//                answer += "*"; //뒷번호 4자리를 제외한 앞번호는 *로 설정.
//            } else {
//                answer += p[i]; //4자리는 원래 번호.
//            }
//        }


        return answer;
    }

    //나누어 떨어지는 숫자 배열
    public int[] solution16(int[] arr, int divisor) {
        int[] answer = {};
        int s =0;
        int n =0;

        //나누어떨어지는 배열의 갯수 구하기
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                s++; //나누어떨어지는 갯수 증가.
            }
        }

        //나누어떨어지는 배열의 수로 배열의 길이 재설정하여, 새로운 배열 생성.
        answer= new int[s];
        for (int i=0; i<arr.length; i++){
            if (arr[i]%divisor == 0) {
                answer[n] = arr[i]; //미리 구해놓은 배열의 길이만큼, 나누어떨어지는 수를 다시 배열한다. 
                n++; //배열의 길이 증가.

            }
        }

        //나누어떨어지지 않는 경우 -1을 반환.
        if (s==0) {
            answer = new int[]{-1};
            return answer;
        }
        //오름차순 정렬.
        Arrays.sort(answer);

        return answer;
    }

    //콜라츠 추측
    public int solution15(int num) {
        int answer = 0;

        while (num!=1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            answer++;

            if (answer>=500){
                answer = -1;
                break;
            }
        }

        return answer;
    }

    //없는 숫자 더하기
    public int solution14(int[] numbers) {
        int answer = -1;
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            answer = 45-sum;
        }
        return answer;
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
