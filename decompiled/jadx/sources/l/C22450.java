package l;

/* JADX INFO: renamed from: l.᩹ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes.dex */
public final class C22450 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72709;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f72710;

    public C22450(int i, int i2) {
        this.f72710 = i;
        this.f72709 = i2;
    }

    public final String toString() {
        int i = this.f72710;
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
