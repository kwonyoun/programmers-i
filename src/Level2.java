public class Level2 {

    public Level2(){

        //올바른 괄호
//        String s = "())((())()";
//        System.out.println(solution11(s));

        //간단한 식 만들기
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));

    }

    //간단한 식 만들기
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        int min = intArr[0];
        int max = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]){
                min = intArr[i];
            }
            if (max < intArr[i]){
                max = intArr[i];
            }

        }
        answer = min+" "+max;


        return answer;
    }

    //올바른 괄호
    boolean solution11(String s) {
        boolean answer = true;

        String[] sarr = s.split("");
        int a = 0;
        int b = 0;
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i].equals("(")){
                a++;
            } else if (sarr[i].equals(")")){
                b++;
            }
            if (a<b){
                answer = false;
            }
        }
        if (a != b) answer = false;
        return answer;
    }
}
