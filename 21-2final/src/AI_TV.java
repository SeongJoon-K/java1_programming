public class AI_TV extends TV {
    AI_TV(String name,int ch) {
        super(ch);
        String AI_name = name;
    }
    void command(String name) {
        if (name.equals("시리야")) {
            System.out.println("주인님! 현재 채널은 "+ get_channel()+"번");
        } else {
            System.out.println("주인님! 저는 누구가 아니예요.");
        }
    }
}
