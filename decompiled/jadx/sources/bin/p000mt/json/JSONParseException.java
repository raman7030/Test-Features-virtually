package bin.p000mt.json;

/* JADX INFO: loaded from: classes.dex */
public class JSONParseException extends RuntimeException {
    public final Location location;

    public JSONParseException(String str, Location location) {
        super(str + " at " + location);
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }
}
