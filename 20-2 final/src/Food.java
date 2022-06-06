public class Food {
    private String pizza;
    private int code;
    Food(String a, int b) {
        pizza = a;
        code = b;
    }
    String getName() {
        return pizza;
    }
    public int getCode() {
        return code;
    }
}
