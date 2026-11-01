package p067l;

/* JADX INFO: renamed from: l.ܶ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16834 extends Exception {

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f49831;

    /* JADX INFO: renamed from: ᩸ */
    public final int f49832;

    /* JADX INFO: renamed from: ᩹ */
    public final C10307 f49833;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16834(int i, int i2, int i3, int i4, int i5, C10307 c10307, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM49005 = C21720.m49005("AudioTrack init failed ", i, " Config(", ", ", i2);
        C7913.m18269(sbM49005, i3, ", ", i4, ", ");
        sbM49005.append(i5);
        sbM49005.append(") ");
        sbM49005.append(c10307);
        sbM49005.append(z ? " (recoverable)" : "");
        super(sbM49005.toString(), runtimeException);
        this.f49832 = i;
        this.f49831 = z;
        this.f49833 = c10307;
    }
}
