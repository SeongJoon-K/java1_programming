public class Example {
    private boolean t = false;
    private boolean f = true;

    void search(String word, String str) {
        String[] strArr = word.split("");
        int i = 0;
        while (i < strArr.length) { // 없으면 No 입력해야함
            if (strArr[i].equals(str)) {
                System.out.println("Yes");
                break;
            }
            i++;
            if (i == strArr.length) {
                System.out.println("No");
                break;
            }
        }
    }

    boolean toggle(boolean a) {
        if (a == true) {
            a = false;
        } else {
            a = true;
        }
        return a;
    }
}
