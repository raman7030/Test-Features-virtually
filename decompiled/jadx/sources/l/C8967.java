package l;

/* JADX INFO: renamed from: l.ۡܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8967 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f27238;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8159 f27239;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12392 f27240;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4733 f27241;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f27242;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14799 f27243;

    public C8967(C22372 c22372, C12392 c12392, InterfaceC7785 interfaceC7785, C8159 c8159, C4733 c4733, C14799 c14799) {
        this.f27238 = c22372;
        this.f27240 = c12392;
        this.f27242 = interfaceC7785;
        this.f27239 = c8159;
        this.f27241 = c4733;
        this.f27243 = c14799;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m23130() {
        C22372 c22372 = this.f27238;
        if (c22372.f72511 != null || !c22372.f72503) {
            return false;
        }
        C12392 c12392 = c22372.f72517;
        C12392 c12393 = this.f27240;
        return c12392 == c12393 && c12393.m30436() == this.f27242 && this.f27241.f15019.mo23554().equals(c22372.m5420().f15019.mo23554());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23129() {
        if (m23130()) {
            C14799 c14799 = this.f27243;
            C22372 c22372 = this.f27238;
            boolean zM35205 = c14799.m35205(c22372.f72513);
            C12392 c12392 = this.f27240;
            boolean z = zM35205 && c12392.m30358(this.f27239);
            if (m23130()) {
                c22372.m5409(c22372.m50236(c12392.m30297()));
                c22372.f5607.m24121(c22372.m5426() || c22372.f72510);
                c22372.m50198();
            }
            if (z && m23130()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f27243.close();
    }
}
