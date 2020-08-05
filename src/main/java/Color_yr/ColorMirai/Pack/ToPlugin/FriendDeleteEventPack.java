package Color_yr.ColorMirai.Pack.ToPlugin;

public class FriendDeleteEventPack {
    private String name;
    private long id;

    public FriendDeleteEventPack(String name, long id) {
        this.id = id;
        this.name = name;
    }

    public FriendDeleteEventPack() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
