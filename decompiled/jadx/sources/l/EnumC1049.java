package l;

/* JADX INFO: renamed from: l.֨ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1049 {
    NORMAL("var.might.already.be.assigned", false),
    SPECULATIVE_LOOP("var.might.be.assigned.in.loop", true);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f3879;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f3880;

    EnumC1049(String str, boolean z) {
        this.f3879 = str;
        this.f3880 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m3617() {
        return this.f3880;
    }
}
