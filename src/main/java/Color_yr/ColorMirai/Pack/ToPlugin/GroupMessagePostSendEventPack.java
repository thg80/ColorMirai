package Color_yr.ColorMirai.Pack.ToPlugin;

import net.mamoe.mirai.message.data.MessageChain;

import java.util.ArrayList;
import java.util.List;

/*
28 [机器人]在群消息发送后广播（事件）
id：群号
res：是否发送成功
message：发送的消息
error：错误消息
 */
public class GroupMessagePostSendEventPack {
    public long id;
    public boolean res;
    public List<String> message;
    public String error;

    public GroupMessagePostSendEventPack(long id, boolean res, MessageChain message, String error) {
        this.error = error;
        this.id = id;
        this.message = new ArrayList<>();
        for (var item : message) {
            this.message.add(item.toString());
        }
        this.message.add(message.contentToString());
        this.res = res;
    }
}
