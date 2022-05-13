import java.util.Scanner;

public class Main {
    static void main(){
        System.out.println("[ menu ]");
        System.out.println("1 : input (King info.)");
        System.out.println("2 : show  (King List.)");
        System.out.println("3 : menu ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main();
        King[] Joseon = new King[30];


        int cnt = 0;
        int choice = 10;
        while (choice != 0) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("왕의 이름 > ");
                    String name = sc.next();
                    System.out.println("왕의 순서 > ");
                    int order = sc.nextInt();
                    Joseon[cnt++] = new King(name, order);
                    break;
                case 2:
                    for (int i = 0; i < cnt; i++) {
                        Joseon[i].show();
                    }
                    break;
                case 3:
                    main();
                    break;
                }


        }

    }
}
