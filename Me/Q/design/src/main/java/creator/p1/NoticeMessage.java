package creator.p1;

/**
 * @Description:
 * @author: LinWeiQi
 */
public class NoticeMessage implements Message {
    @Override
    public void init() {
        System.out.println("notice...init");
    }

    @Override
    public void m2() {
        init();
    }
}
