package bin.p000mt.json;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSONHandler {
    public JSONParser parser;

    public void endArray(Object obj) {
    }

    public void endArrayValue(Object obj) {
    }

    public void endBoolean(boolean z) {
    }

    public void endNull() {
    }

    public void endNumber(String str) {
    }

    public void endObject(Object obj) {
    }

    public void endObjectName(Object obj, String str) {
    }

    public void endObjectValue(Object obj, String str) {
    }

    public void endString(String str) {
    }

    public Object startArray() {
        return null;
    }

    public void startArrayValue(Object obj) {
    }

    public void startBoolean() {
    }

    public void startNull() {
    }

    public void startNumber() {
    }

    public Object startObject() {
        return null;
    }

    public void startObjectName(Object obj) {
    }

    public void startObjectValue(Object obj, String str) {
    }

    public void startString() {
    }

    public Location getLocation() {
        return this.parser.getLocation();
    }
}
