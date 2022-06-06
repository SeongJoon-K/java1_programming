public class AIwave {
    private int cooktime;
    AIwave(int ti) {
        cooktime = ti;
    }
    public int getCooktime() {
        return cooktime;
    }
    public void cook(Food fd) {
        int alltime = fd.getCode() * cooktime;
        System.out.println("음식 조리 시간은 "+ alltime+ "초입니다.");
    }
}
