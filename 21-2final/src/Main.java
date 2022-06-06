import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("ksj");
        Practice ex = new Practice();
        ex.random3(7);
        ex.div10(2973);
        ex.lower("H");
        ex.last_word("What's your name?");
        ex.last_word("I am a boy");
        ex.max_no(18677022);
        TV lg = new TV(7);
        System.out.println("현재 채널은" + lg.get_channel() + "번");

        AI_TV siri = new AI_TV("시리야", 7);
        siri.command("누");

    }
    void lower(String str) {
        String onestr = str.toLowerCase();
    }
    static class Practice {
        void random3(int a) {
            int cnt = 0;
            while (cnt != a) {
                double num = (Math.random() * 100); // 100 이하의 수 출력
                num = (int)num;
                if (num % 3 ==0 && num > 0) {
                    System.out.print((int)num+ " ");
                    cnt++;
                }
            }
            System.out.println("");
        }
        void div10(int b) {
            int firstNum = b % 10;
            System.out.println(firstNum);
        }
        void lower(String str) {
            String onestr = str.toLowerCase();
            System.out.println(onestr);
        }
        void last_word(String str) {
            String[] strArr = str.split(" ");
            System.out.println(strArr[strArr.length-1]);
        }
        void max_no(int num) {
            String strnum = Integer.toString(num);
            int max = 0;
            String[] strArr = strnum.split("");
            for(int i =0; i< strArr.length; i++) {
                if (max < Integer.parseInt(strArr[i])) {
                    max = Integer.parseInt(strArr[i]);
                }
            }
            System.out.println(max);
        }
    }
}

