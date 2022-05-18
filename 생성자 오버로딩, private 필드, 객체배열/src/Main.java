import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("[메뉴]");
        System.out.println("1 : input");
        System.out.println("2 : show");
        System.out.println("3 : menu");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int N = 10;
        int cnt = 0;
        king[] kingarr = new king[20];
        while (N != 0) {
            N = sc.nextInt();
            switch (N) {
                case 1:
                    System.out.println("왕의 이름 > ");
                    String name = sc.next();
                    System.out.println("왕의 순서 > ");
                    int order = sc.nextInt();
                    kingarr[cnt] = new king(name, order);
                    cnt++;
                    break;
                case 2:
                    for (int i = 0; i < cnt; i++) {
                        kingarr[i].show();
                    }
                    break;
                case 3:
                    menu();
                    break;
                }
        }

    }

}
