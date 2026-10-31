package l;

/* JADX INFO: renamed from: l.ᩴۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18495 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5131 f57328;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f57329;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C0149 f57330;

    public C18495(C0149 c0149, int i, C5131 c5131) {
        this.f57330 = c0149;
        this.f57329 = i;
        this.f57328 = c5131;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5131 m42996(InterfaceC0897 interfaceC0897) {
        C0149 c0149 = this.f57330;
        if (c0149 == null) {
            throw new IllegalStateException("Text batch is no longer active");
        }
        return C0149.m1234(c0149, this, interfaceC0897);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0149 c0149 = this.f57330;
        if (c0149 != null) {
            c0149.m1247();
        }
    }
}
