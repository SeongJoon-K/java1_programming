
public class King {
    private int order;
    private String name;
    King(String nm, int od) {
        name = nm;
        order = od;
    }

    public void show(){
        System.out.println("조선"+order+"대왕" + name);

    }

}
