import java.util.HashMap;

public class Level2 {

    public Level2(){

        //올바른 괄호
//        String s = "())((())()";
//        System.out.println(solution1(s));

        //간단한 식 만들기
//        String s = "-1 -2 -3 -4";
//        System.out.println(solution2(s));

        //전화번호 목록
        String[] s = {"12","123","1235","567","88"};
        System.out.println(solution3(s));


    }

    //전화번호 목록
    public boolean solution3(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }

//        HashMap<String, Integer> hp = new HashMap<>(); //해시맵
//        for (String s : phone_book) {
//            hp.put(s, hp.getOrDefault(s, 0) + 1); //각 String의 값을 key로 설정하고,
//            //key와 맵핑된 value값을 반환하고 없으면 defaultValue값을 반환합니다.
//        }
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book[i].length(); j++) {
//                if (hp.containsKey(phone_book[i].substring(0, j))) {
//                    return false;
//                }
//            }
//        }

        return answer;
    }

    //간단한 식 만들기
    public String solution2(String s) {
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
    boolean solution1(String s) {
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
