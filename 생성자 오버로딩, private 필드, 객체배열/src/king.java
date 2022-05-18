public class king {
    private String name; // private 필드로 변수를 선언
    private int num;
    king(String nm, int number){ // 클래스의 기본 생성자를 만들고  두 개의 parameter를 넣어서 오버로딩
        name = nm; // nm과 number의 경우 다른 클래스에서 받을 인자라서 임의대로 넣어준다
        num = number;
    }

    void show() { // private필드는 다른 클래스에서 사용이 불가능하기 때문에 show 함수를 사용해 불러온다
        System.out.println("조선"+num+"대왕 " + name);
    }
}
