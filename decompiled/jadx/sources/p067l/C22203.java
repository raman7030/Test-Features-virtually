package p067l;

/* JADX INFO: renamed from: l.᩷۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes4.dex */
public final class C22203 {

    /* JADX INFO: renamed from: ֫ */
    public String f70225;

    /* JADX INFO: renamed from: ۧ */
    public int f70226;

    public C22203(int i) {
        this.f70226 = i;
        this.f70225 = "Attributes incorrectly present on end tag";
    }

    public C22203(int i, String str, Object... objArr) {
        this.f70225 = String.format(str, objArr);
        this.f70226 = i;
    }

    public final String toString() {
        return this.f70226 + ": " + this.f70225;
    }
}
