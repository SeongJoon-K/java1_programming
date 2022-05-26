import java.util.Random;

public class Quiz {
    private int speed;
    private int cnt;
    String strArr;
    int[] numArr = {60,70,80,100};
    int speed_limit() {
        Random rd = new Random();
        speed = numArr[rd.nextInt(4)];
        return speed;
    }
    int count(String a,String b) {
        cnt = 0;
        for (int i = 0 ; i < a.length()-1; i++){
            if (a.substring(i,i+2).equals(b)){
                cnt ++;
            }
        }
        return cnt;
    }
}
// equals 에서는 false가 출력
// contains == true
