import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ksj");
        Scanner sc = new Scanner(System.in);
        Example ex = new Example();
        ex.search("student", "n");
        boolean t = true;
        System.out.println(ex.toggle(t));

        System.out.println("--- 3번 문제 ---");
        Food pizza = new Food("김성준피자", 3);
        System.out.println("");
        System.out.println(pizza.getName()+"의 코드는 " + pizza.getCode());
        AIwave mywave = new AIwave(40);
        mywave.cook(pizza);

        int N = sc.nextInt();
        String NumStr = Integer.toString(N);
        String[] intArr = NumStr.split("");
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 0; i < intArr.length; i++) {
            sum1 = 1;
            sum2 = 1;
            for (int j = 0; j < i; j++) {
                sum1 *= Integer.parseInt(intArr[j]);
//                System.out.println("sum1 : "+sum1);
            }
            for (int k = i; k < intArr.length; k++){
                sum2 *= Integer.parseInt(intArr[k]);
//                System.out.println("sum2 : "+ sum2);
            }
            if (sum1 == sum2) {
                System.out.println("YES");
                break;
            }
        }
        if (sum1 != sum2) {
            System.out.println("NO");
        }
    }

}
