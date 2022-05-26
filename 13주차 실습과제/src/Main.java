public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("제한속도 = " + quiz.speed_limit() + "km");
        String source = "The old man and the sea";
        System.out.println("출력결과 : 문장에 포한된 문자열 개수 " +  quiz.count(source,"he") );
    }
}
