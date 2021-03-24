package creator.p1;

/**
 * @Description:   工厂实现类
 * @author: LinWeiQi
 */
public class NoticeMessageFactory extends MessageFactory {
    @Override
    public Message createMsg() {
        return new NoticeMessage();
    }
}
