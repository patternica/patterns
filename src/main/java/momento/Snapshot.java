package momento;

import java.util.Date;

public class Snapshot {

    private Date snapshotDate;
    private Editor.State state;

    public Snapshot(Editor.State state) {
        this.snapshotDate = new Date();
        this.state = state;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public void setSnapshotDate(Date snapshotDate) {
        this.snapshotDate = snapshotDate;
    }

    public Editor.State getState() {
        return state;
    }

    public void setState(Editor.State state) {
        this.state = state;
    }
}
