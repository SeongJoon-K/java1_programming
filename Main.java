class Example {

    int odd(int N) {

    }
    char next(char c) {
        c = 's';
        c = (char)(c + 1);
        return c;
    }
    int min(int[] arr) {
        int min = 100;
        for (int i =0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        // 1번

        // 2번
        char ch = ex.next('s');
        System.out.println("2번문제 = " + ch);

        //3번
        int[] data = {10,5,8,20,7,3,30,25,15};
        System.out.println("3번문제 = " + ex.min(data));
    }
}
