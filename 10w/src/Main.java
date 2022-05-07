public class Main {
    public static void main(String[] args) {

        System.out.println("자동차와 주유소");
        Car SM5 = new Car();
        GasStation GS = new GasStation();

        SM5.set_gas(10);
        GS.set_gas(500);
        SM5.show();
        GS.show();
        SM5.fill_gas(50, 60);
        SM5.show();
        GS.show();
        SM5.fill_gas(460,40);
    }
}

class GasStation {
    private static int oil;

    static void set_gas(int a) {
        oil = a;
    }
    void show() {
        System.out.println("현재 재고량 : " + oil);
    }

}
class Car {
    private static int Caroil= 0;
    private static int GS;
    static void set_gas(int a) {
        Caroil = a;
    }
    void show() {
        System.out.println("현재 주유량 : " + Caroil);
    }
    static void fill_gas(int num, int GS) {
        if (num > GS) {
            System.out.println("주유 실패");
        } else {
            Caroil += Caroil;
        }
    }

}