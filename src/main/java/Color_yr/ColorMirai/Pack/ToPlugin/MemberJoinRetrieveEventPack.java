package Color_yr.ColorMirai.Pack.ToPlugin;

import Color_yr.ColorMirai.Pack.PackBase;

/*
79 [机器人]成员群恢复（事件）
id: QQ群
fid: 成员QQ号
name: 成员昵称
 */
public class MemberJoinRetrieveEventPack extends PackBase {
    public long id;
    public long fid;
    public String name;

    public MemberJoinRetrieveEventPack(long qq, long id, long fid, String name) {
        this.qq = qq;
        this.id = id;
        this.fid = fid;
        this.name = name;
    }
}
