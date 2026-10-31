package l;

/* JADX INFO: renamed from: l.ܶ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15221 extends Exception {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f46707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f46708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8353 f46709;

    /* JADX WARN: Illegal instructions before constructor call */
    public C15221(int i, int i2, int i3, int i4, int i5, C8353 c8353, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM46682 = C20361.m46682("AudioTrack init failed ", i, " Config(", ", ", i2);
        C5834.m16344(sbM46682, i3, ", ", i4, ", ");
        sbM46682.append(i5);
        sbM46682.append(") ");
        sbM46682.append(c8353);
        sbM46682.append(z ? " (recoverable)" : "");
        super(sbM46682.toString(), runtimeException);
        this.f46708 = i;
        this.f46707 = z;
        this.f46709 = c8353;
    }
}
