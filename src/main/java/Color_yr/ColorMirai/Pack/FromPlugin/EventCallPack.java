package Color_yr.ColorMirai.Pack.FromPlugin;

import java.util.List;

public class EventCallPack {
    private long eventid;
    private int dofun;
    private List<Object> arg;

    public long getEventid() {
        return eventid;
    }

    public void setEventid(long eventid) {
        this.eventid = eventid;
    }

    public int getDofun() {
        return dofun;
    }

    public void setDofun(int dofun) {
        this.dofun = dofun;
    }

    public List<Object> getArg() {
        return arg;
    }

    public void setArg(List<Object> arg) {
        this.arg = arg;
    }
}
