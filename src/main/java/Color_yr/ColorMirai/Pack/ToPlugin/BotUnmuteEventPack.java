package Color_yr.ColorMirai.Pack.ToPlugin;

public class BotUnmuteEventPack {
    private long id;
    private long fid;

    public BotUnmuteEventPack(long id, long fid) {
        this.fid = fid;
        this.id = id;
    }

    public BotUnmuteEventPack() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }
}
