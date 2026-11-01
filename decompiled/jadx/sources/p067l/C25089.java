package p067l;

/* JADX INFO: renamed from: l.᩻᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes.dex */
public final class C25089 extends RuntimeException {

    /* JADX INFO: renamed from: ۙ */
    public final String f80046;

    /* JADX INFO: renamed from: ᩶ */
    public final int f80047;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f80048;

    /* JADX INFO: renamed from: ᩹ */
    public final int f80049;

    public C25089(C8996 c8996, String str, boolean z) {
        this.f80049 = c8996.f24381;
        this.f80047 = c8996.f24380;
        this.f80048 = z;
        this.f80046 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f80048;
        String str = this.f80046;
        int i = this.f80049;
        if (z) {
            return "Parse error [" + i + ":eol] " + str;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Parse error [", ":");
        sbM34408.append(this.f80047);
        sbM34408.append("] ");
        sbM34408.append(str);
        return sbM34408.toString();
    }
}
