package p067l;

/* JADX INFO: renamed from: l.᩹ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes.dex */
public final class C23705 {

    /* JADX INFO: renamed from: ֫ */
    public final int f75435;

    /* JADX INFO: renamed from: ۧ */
    public final int f75436;

    public C23705(int i, int i2) {
        this.f75436 = i;
        this.f75435 = i2;
    }

    public final String toString() {
        int i = this.f75436;
        if (i == 0) {
            return "TYPE_ANNOTATION_START";
        }
        if (i == 1) {
            return "TYPE_ANNOTATION_END";
        }
        if (i == 2) {
            return "TYPE_FIELD_START";
        }
        if (i == 3) {
            return "TYPE_FIELD_END";
        }
        if (i != 4) {
            return i != 5 ? "???" : "TYPE_METHOD_END";
        }
        return "TYPE_METHOD_START";
    }
}
